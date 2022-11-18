package Objcet;

import MockDemo.HttpService;
import MockDemo.InjectMocksDemo;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class PostInjectDemoTest {
    @Mock
    private HttpService httpService;
    @InjectMocks
    private InjectMocksDemo injectMocksDemo = new InjectMocksDemo();

    //第一种形式captor
    @Captor
    private ArgumentCaptor<HttpService> httpServiceArgumentCaptor =  ArgumentCaptor.forClass(HttpService.class);
    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
     void injectTest(){
        String name = "lcy";
        //捕捉mock对象调用的方法传入值
        //第二种形式captor
        ArgumentCaptor argument = ArgumentCaptor.forClass(String.class);
        doReturn(1).when(httpService).queryStatus(name);

        int status = httpService.queryStatus(name);
        //verify(mock).method(argument.capture());
        verify(httpService).queryStatus((String) argument.capture());
        verify(httpService).queryStatus(String.valueOf(httpServiceArgumentCaptor.capture()));
        String hello = injectMocksDemo.hello(name);

        //注入验证
        assertEquals("hello",hello);
        //验证mock对象调用方法的传入值
        assertEquals("lcy",argument.getValue());
        assertEquals("lcy",httpServiceArgumentCaptor.getValue());
        assertEquals(1, status);
    }

    @Test
    void matcherTest(){
        Map mapMock = mock(Map.class);
        //用来干啥？
        when(mapMock.put(anyInt(),anyString())).thenReturn("world");

        mapMock.put(1,"hello");
        mapMock.put("ppp",1);

        verify(mapMock).put(anyInt(),eq("hello"));
        verify(mapMock).put(anyString(),eq(1));

        //import static org.mockito.Mockito.*; 使用静态导入的写法
        List mockList = mock(List.class);
        //import org.mockito.Mockito.*;使用非静态导入的写法
        List mockList2 = Mockito.mock(List.class);
        mockList.add(1);
        //代表上一次交互后，list再无任何交互
        verifyNoMoreInteractions(mockList);
        //mockeList只能调用add方法且只能调用1次
        verify(mockList, only()).add(1);


        //使用了参数匹配器anyInt anyString 必须使用Matchers类内建的eq方法
        // 上述代码是正确的,因为eq()也是一个参数匹配器
        verify(mockList).add(anyInt(),eq(true));
        assertTrue(mockList.add(anyInt()));

        Map mapMock2 = mock(Map.class);
        List mockList1 = mock(List.class);

        // 验证mock对象没有交互过
//        verifyZeroInteractions(mapMock2, mockList1);

    }
}
