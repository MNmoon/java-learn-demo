package org.example;

import java.util.Random;

import static org.example.testDemo.contains;


public class getLottery {
    public static void main(String[] args) {
        //{2,388，588,3888,10000} 随机抽取5次 每次出现顺序不一样
        //奖项出现顺序随机但不重复
        int[] lottery = {2,388,588,3888,10000};
        Random r = new Random();
        int[] arr = new int[5];
//
//        //效率低下 可能重复几次都是同一个值
//        for (int i = 0; i < lottery.length;) {
//            //弊端： random重复抽取一定范围内的随机数 --会可能出现相同的
//            int randomIndex = r.nextInt(lottery.length);
//            //抽取到一个奖项
//            int lotteryNum = lottery[randomIndex];
//            //判断这个奖项是否出现过
//            boolean flag = contains(arr,lotteryNum);
//            if (!flag) {
//                arr[i] = lotteryNum;
//                i++;
//            }
//        }
//        for (int i1 = 0; i1 < arr.length; i1++) {
//            System.out.println(arr[i1] + ",");
//        }
//
        //高效率 打乱顺序  不会像上面出现抽取的无效奖项
        for (int i = 0; i < lottery.length; i++) {
            int randomIndex = r.nextInt(lottery.length);
            int temp = lottery[i];
            lottery[i] = lottery[randomIndex];
            lottery[randomIndex] = temp;
        }
        for (int i = 0; i < lottery.length; i++) {
            System.out.println(lottery[i] + ",");
        }

    }
}
