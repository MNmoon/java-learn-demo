package Objcet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class simpleTest {

    @Test
    void test(){
        String name = "kk";
        if (name.equals("gg")){
            System.out.println("pass");
            assertTrue(true);
        }else {
            System.out.println("fail");
            assertFalse(false);
        }
    }
}
