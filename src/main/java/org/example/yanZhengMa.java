package org.example;

import java.util.Random;

public class yanZhengMa {
    public static void main(String[] args) {
        //随机验证码5位数，包含大小写字母共4个和1个数字
        //4位大小写字母
        //大小写字母放入数组
        Random r = new Random();
        char[] chars = new char[52];
        String result = "";

        for (int i = 0; i < chars.length; i++) {
            //获取小写字母并加入到chars
            //‘a’  ->97   'z' ->122
            if (i < 26){
                chars[i] = (char)(97 + i);
            }else {
                //获取大写字母并加入到chars
                //‘A’ ->65 'Z' ->90
                //索引从26开始到52:i-26
                chars[i] = (char)(65 + i - 26);
            }
        }
        //随机生成4个index
        for (int i = 0; i < 4; i++) {
            //循环获取4个随机index
            //在chars数组中随机生成一个index
            int randomIndex = r.nextInt(52);
            result = result + chars[randomIndex];
        }

        //0-9的数字
        int num = r.nextInt(10);
        result = (String) (result + num);
        System.out.println("result: " + result);
    }

}
