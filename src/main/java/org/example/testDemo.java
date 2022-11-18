package org.example;

import java.util.Arrays;

public class testDemo {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
//        printArray(array);
//        int max = getMax(array);
//        System.out.println(max);
//        boolean flag = contains(array,4);
//        System.out.println(flag);
//        int[] arr01 = copyOfRange(array,2,5);
//        System.out.println(arr01);//打印的是内存地址
//        printArray(arr01);

        //区分change和 changeArray的区别：传递基本数据类型--传递引用数据类型
        int number = 100;
        //函数内部改变num的值：返回给重新赋值给num
        number = change(number);
        System.out.println("number = " + number);
        //改变数组中的值
        System.out.println("arr[1]:" + array[1]);
        changeArray(array);
        System.out.println("arr[1]:" + array[1]);

    }





    public  static  void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            }else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }

    public  static  int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
           if (arr[i] > max) {
               max = arr[i];
           }
        }
        return max;
    }

    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return  true;
            }
        }
        return false;//什么时候才return false  这个要想清楚
    }

    //from to是不是在array的index范围内  3-7
    //from < to
    //from > to
    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] arr01 = new int[to - from ];
        //伪造索引的思想,当你的代码中没有一个变量能符合当前使用，此时就可伪造一个
        int index = 0;
        for (int i = from; i < to; i++) {
            arr01[index] = arr[i]; //arr01[i] 这是错误的,这样赋值的就变成了arr01[3] arr01[4] arr01[5]-->实际arr01只有index0-3
            index ++;
        }
        return arr01;//返回数组
    }
    public static  int change(int num){
        //传递的是变量 改变变量的值后返回重新赋值给外面的num
        num = 200;
        return num;
    }

    public static void changeArray(int[] arr){
        //传递的数组的内存地址给函数
        //函数里面直接改变的是存在堆里面的值 无需返回重新赋值
        arr[1] = 300;
    }

}
