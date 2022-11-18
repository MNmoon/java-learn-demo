package Objcet;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringDemo3Test {
    private final static String ID = "52010019909201290";

//    @BeforeAll
//    static void beforeAll(){
//        System.out.println("before all test");
//    }
//
//    @BeforeEach
//    void beforeEach(){
//        System.out.println("before each test");
//    }
//
//
//    @AfterEach
//    void afterEach(){
//        System.out.println("after each test");
//    }
//
//    @AfterAll
//    static void aftereAll(){
//        System.out.println("after all test clean up");
//
//    }

    @Test
    void verify_Id_Info(){
        //将身份证中几位隐藏为*****

        //截取身份证中的信息
        String birthday = ID.substring(6,13);
        System.out.println("birthday: " + birthday);
        assertEquals("1990920",birthday,"生日信息不匹配");

        String Id = StringDemo3.hideInfo(ID);
        System.out.println(Id);
        assertEquals("52010********1290",Id,"身份证信息隐藏失败");
    }

    @Test
    void verify_duicheng_Info(){
        String str = "addd";
        String str1 = "123321";
        String str2 = "aabaa";
        stringBuilderDemo.duicheng(str);
        stringBuilderDemo.duicheng(str1);
        stringBuilderDemo.duicheng(str2);
    }

    @Test
    void verify_pinjie_Info(){
        int[] arr = {1,2,3};
        String pinjie = stringBuilderDemo.pinjie(arr);
        System.out.println(pinjie);
    }

    @Test
    void verify_arr_to_string_Info(){
        int[] arr = {1,2,3};
        String pinjie = stringBuilderDemo.arrToString(arr);
        System.out.println(pinjie);
    }
}