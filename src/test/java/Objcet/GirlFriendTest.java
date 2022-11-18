package Objcet;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GirlFriendTest {

    @Test
    void GIVEN_girl_array_WHEN_calu_avg_THEN_output_avg_age(){
        GirlFriend[] girl = new GirlFriend[3];
        //获取arr中的年龄
        GirlFriend g0 = new GirlFriend("xiaomi","dengshan","女",35);
        GirlFriend g1 = new GirlFriend("dashan","hiking","女",28);
        GirlFriend g2 = new GirlFriend("wanduzi","papa","女",29);
        girl[0] = g0;
        girl[1] = g1;
        girl[2] = g2;

        //调用计算平均年龄
        Map<String, Double> result = new HashMap<>();
        result = GirlFriend.getAvgAge(girl);
        System.out.println("avg age:" + result.get("avg"));
        //double转int
        int count = (int)(Math.round(result.get("count")));
        System.out.println("低于平均年龄的女友count:" + count);

        double avg = result.get("avg");

        //匿名函数中只能是最终变量 不能用result.get("avg") ->方法调用完毕后就出栈 栈内就没有保存 下面再调用就找不到
        //Variable used in lambda expression should be final or effectively final
        assertAll("failed to verify avg age or count",
                () -> assertEquals(2,count),
                () -> assertNotEquals(30,avg)
                );

    }

}