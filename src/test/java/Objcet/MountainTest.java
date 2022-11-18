package Objcet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {

    @Test
    void getName() {
        //LomBook注解测试  不用写javaBean冗余代码,直接注解@Data 即可调用setName getName等
        Mountain mt = new Mountain();
        mt.setName("zhumu");
        assertEquals("zhumu",mt.getName());
    }
}