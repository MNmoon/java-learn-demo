package Objcet;

import java.util.StringJoiner;

public class stringBuilderDemo {
    private String name;

    public stringBuilderDemo() {
    }

    public stringBuilderDemo(String name) {
        this.name = name;
    }

    public static String convertName(StringBuilder sb){
        //
//        StringBuilder sb0 = new StringBuilder();
//        StringBuilder sb1 = new StringBuilder("sssss");
        sb.append("aaa");
        return sb.toString();
    }
    /**
     * 字符串对称信息判断
     * @return none
     */
    public static void duicheng(String str){
        //判断对称字符串
        String sb =new StringBuilder(str).reverse().toString();
        System.out.println("sb: " + sb);
//        String sb =new StringBuilder().append(str).reverse().toString();
        if (sb.equals(str)){
            System.out.println("对称");
        }else {
            System.out.println("不对称");
        }
    }

    /**
     * 字符串拼接
     * @return 拼接后的字符串
     */
    public static String pinjie(int[] arr){
        //{1，2,3} --> [1,2,3]
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1){
//                sb.append(arr[i] + ",");
                sb.append(arr[i]).append(",");
            }else {
                sb.append(arr[i]);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    //
    public static String arrToString(int[] arr){
        StringJoiner sj = new StringJoiner(",","[","]");

        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        return sj.toString();
    }



    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "stringBuilderDemo{name = " + name + "}";
    }
}
