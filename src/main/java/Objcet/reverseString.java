package Objcet;

public class reverseString {

    public static void main(String[] args) {
        String s = reverseStr("abc");
        System.out.println(s);

    }

    //反转字符串
    public static String reverseStr(String str){
        String result = "";
        //"abc"
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            result = result + ch;
        }
        return result;
    }
}
