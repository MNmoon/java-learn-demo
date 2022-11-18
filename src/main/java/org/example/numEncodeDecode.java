package org.example;

import java.util.Scanner;

public class numEncodeDecode {
    public static void main(String[] args) {
        //输入一个数字
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num:");
        int num = sc.nextInt();

        int[] arr =  getArrayFromNum(num);
        int result = getResult(arr);
        System.out.println(result);
    }

    //一个数组中的数字 每个+5 每个%10 再反转后拼接输出
    private static int getResult(int[] arr) {
        //+5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //%10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //反转  *******
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //拼接
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        return num;
    }

    //输入一个数字 得到数字长度动态创建数组并将数字的每一位放到数组中
    private static int[] getArrayFromNum(int num) {
        int temp = num;
        //12345  -->获取长度
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }

        int[] arr = new int[count];
        int index = arr.length - 1;
        //拆分得到数组中的每一位 注意反序存放
        for (int i = 0; i < count; i++) {
            //取余数
            int ge = temp % 10;
            //去掉个位 重新赋值
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
    return arr;
    }
}
