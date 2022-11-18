package Objcet;

import javax.print.DocFlavor;

public class rotateString {
    private String str;
    private String str1;


    public rotateString() {
    }

    public rotateString(String str, String str1) {
        this.str = str;
        this.str1 = str1;
    }

    public static String rotate(String str){
        //String str = "abcde";
        //用array的方法实现
//        char[] ch = str.toCharArray(); //["a,"b","c","d","e"]
//        char first = ch[0];
//        //将剩余的字符依次移动一个位置
//        for (int i = 0; i < str.length(); i++) {
//            ch[i - 1] = ch[i];
//        }
//        ch[str.length()-1] = first;
//        String result = new String(ch);
        //用substring的方法实现
        //截取左边的
        String first = str.substring(0,1);
        //将左边截取的 加到右边
        String end = str.substring(1,str.length());
        return end + first;
    }


    /**
     * 获取
     * @return str
     */
    public String getStr() {
        return str;
    }

    /**
     * 设置
     * @param str
     */
    public void setStr(String str) {
        this.str = str;
    }

    /**
     * 获取
     * @return str1
     */
    public String getStr1() {
        return str1;
    }

    /**
     * 设置
     * @param str1
     */
    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String toString() {
        return "rotateString{str = " + str + ", str1 = " + str1 + "}";
    }
}
