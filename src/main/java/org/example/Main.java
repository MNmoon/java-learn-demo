package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        //判断回文数
//        //算法题
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number:");
//        int num = sc.nextInt();
//        int temp = num;
//        int new_num = 0;
//        while (num != 0){
//            //得到个位数
//            int ge = num % 10;
//            //原数去掉个位数
//            num = num / 10;
//            new_num = new_num * 10 + ge;
//        }
//
//        if (temp == new_num) {
//            System.out.println("回文数");
//        }else {
//            System.out.println("非回文数");
//        }

//        //不用 / %的方法来得出 除数 与 被除数  计算的次数和商
//        //算法题
//        int divided = 100;
//        int divisor = 32;
//        int count = 0;
//        while(divided >= divisor){
//            divided  = divided - divisor;
//            count ++;
//        }
//        System.out.println("余数为:" + divided);
//        System.out.printf("商为: %s",count);

//        //1-100中包含数字7或7的倍数,都打印过，其他的打印对应的数字
//        for (int i = 0; i <= 100; i++) {
//            if(i % 10 == 7 || i / 10 % 10 == 7 || i % 7 ==0){
//                System.out.println("guo");
//                continue;
//            }
//            System.out.println(i);
//        }
//

//         //查找一个数的平方根
//         //i * i = number
//
//        Scanner sc = new Scanner(System.in);
//        int number01 = sc.nextInt();
//
//        for (int i = 1; i <= number01; i++) {
//            if (i * i == number01) {
//                System.out.println("这个数的平方根就是:" + i);
//                break;
//            }else if(i * i > number01){
//                System.out.println("这个数的平方根整数部分是:" + (i - 1));
//                break;
//            }
//        }

        //如果一个数只能被自身和1整除就叫质数 ->循环从2到num-1
        //8 = 1 * 8, 2 * 4
        //循环范围
        int num = 8;
        boolean flag = true;
//        for (int i = 2; i <= num - 1; i++) {
//            if (num % i == 0){
//                System.out.println("非质数");
//                break;
//            }
//        }
//        System.out.println("质数");
//        for (int i = 2; i < num - 1; i++) {
//            if (num % i == 0){
//                flag = false;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println("是质数");
//        }else {
//            System.out.println("非质数");
//        }
        //上面的有弊端，如果输入的数字是10万，那么需要循环xxx次，是不可接受的
        /*简化上面的代码 思路
        * 输入的是81
        * 3 * 27
        * 9 * 9
        * 如果一个数的平方根可以被

        for (int i = 2; i < num的平方根; i++) {
            //同上
        }
        */

        //生成随机数
        Random r =  new Random();
        //生成0-99之间的随机数
        int num01 = r.nextInt(100);
        System.out.println(num01);
        //生成指定区间的随机数 7-15 tou: 0 + x = 7  wei: y + x = 15 （y是生成随机数的最大一个数字）
        int num02 = r.nextInt(9) + 7;

        Scanner sc = new Scanner(System.in);

        int count = 0;
        //猜随机数的游戏
        while(true){
            System.out.println("enter guessnumber:");
            count ++;
            if (count == 3){
                System.out.println("竞猜次数为0");
            }
            int guessnumber = sc.nextInt();
            if(guessnumber < num01){
                System.out.println("smaller");
                continue;
            } else if (guessnumber > num01) {
                System.out.println("bigger");
                continue;
            }else {
                System.out.println("equal");
                break;
            }
        }


    }
}