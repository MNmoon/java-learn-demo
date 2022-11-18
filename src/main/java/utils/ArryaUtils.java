package utils;

import java.util.StringJoiner;

public class ArryaUtils {

    //私有化构造方法
    private ArryaUtils(){}

    //遍历数组打印字符串
    public static String printArr(int[] arr){
        StringJoiner sj = new StringJoiner(",","[","]");

        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        return sj.toString();
    }


    //
    public static double getAvg(double[] arr){
        //
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    //

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            //
            System.out.println(args[i]);
        }
    }
}
