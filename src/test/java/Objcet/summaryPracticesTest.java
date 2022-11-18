package Objcet;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class summaryPracticesTest {

    @Test
    void convertRoma() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("enter digit str: ");
            String str = sc.next();
            boolean flag = summaryPractices.checkStr(str);
            if (flag) {
                String s = summaryPractices.converRoma(str);
                System.out.println("Roma: " + s);
                break;
            } else {
                System.out.println("输入长度大于9,重新输入！");
                continue;
            }
        }
    }
}