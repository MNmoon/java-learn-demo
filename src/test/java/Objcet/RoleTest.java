package Objcet;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RoleTest {

    @BeforeEach
    void setUp() {
        System.out.println("before each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("after each");

    }

    @Test
     void GameTest() {
        Role r1 = new Role("乔峰",100);
        Role r2 = new Role("鸠摩智",100);

        while (true){
            r1.attack(r2);
            if (r2.getBlood() == 0){
                System.out.println(r1.getName()+ "ko " + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName()+ " KO 了 " + r1.getName());
                break;
            }
        }

    }
    @RepeatedTest(3)
    @DisplayName("先跑一次，再重复3次")
    @Test
    void showInfoTest(){
        Role r1 = new Role("乔峰",100,'男');
        Role r2 = new Role("鸠摩智",100,'女');
        r1.showInfo();
        r2.showInfo();
    }


}