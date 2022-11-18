package Objcet;

import java.util.Scanner;

public class charDemo {
    public static void main(String[] args) {
        //输入一串字符 判断其中大写字母 小写字母 数字的个数
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s1 = sc.next();
        int smallCount = 0;
        int bigCount = 0;
        int digitCount = 0;
        //判断
        for (int i = 0; i < s1.length(); i++) {
            //拿到对应字符串索引的值
            char ch = s1.charAt(i);
            //如果字符串中有空格 ->则bug
            //判断大写
            if (ch >= 'A' & ch <= 'Z'){
                bigCount ++;
            } else if (ch >= 'a' & ch <= 'z') {
                //判断小写
                smallCount ++;
            } else if (ch >= '0' & ch <= '9') {
                //判断数字
                digitCount ++;
            }
        }
        System.out.println("bigCount: " + bigCount);
        System.out.println("smallCount: " + smallCount);
        System.out.println("digitCount: " + digitCount);

    }
}
