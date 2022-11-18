package org.example;

public class printZhishu {
    public static void main(String[] args) {

        //101-200之间的质数  打印次数和count
        //2-99
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            //依次循环i中的每一个数

            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("质数：" + i);
                count ++;
            }
        }
        System.out.println("count: " + count);
    }
}
