package Objcet;

import java.util.Scanner;

public class StringDemo1 {

    public static void main(String[] args) {
//        String s1 = new String("abc");
//        String s2 = "Abc";
//
//        // == 比较值
//        System.out.println(s1 == s2);
//
//        //equals比较内容 用户名 密码等验证  严格比较(不能忽略大小写)
//        boolean flag = s1.equals(s2);
//        System.out.println(flag);
//
//        //equalsIgnoreCase忽略大小写(只能是英文a A) 验证码
//        boolean flag01 = s1.equalsIgnoreCase(s2);
//        System.out.println(flag01);

        //键盘录入
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(); //new
        //直接赋值
        String s2 = "ac";
        System.out.println(s1 == s2);//false


    }
}
