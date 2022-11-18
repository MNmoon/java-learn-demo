package Objcet;

import java.util.StringJoiner;

public class summaryPractices {
    private String str;

    public summaryPractices() {
    }

    public summaryPractices(String str) {
        this.str = str;
    }

    //输入一个字符串
    //长度小于9
    //判断字符串中只有数字

    /**
     * 判断输入str是否合法
     *
     * @param str
     * @return boolean
     */
    public static boolean checkStr(String str) {
        //判断字符串长度
        if (str.length() > 9) {
            return false;
        }
        //判断字符串中只有数字
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        //string中所有的都要满足在'0'-'9'之间才能返回true
        return true;
    }

    /**
     *
     */
    public static String converRoma(String str) {
        //找出数字对应的罗马数字  罗马数字中是没有0
        //I-1 II - 2 III - 3 IV - 4 V–5 VI - 6 VII – 7 VIII - 8 IX - 9
        String[] arr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        //"1234"
        //"0123456"
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //"2"
            int index = ch - 48;
            sj.add(arr[index]);
        }
        return sj.toString();
    }

    //switch  将对应的字符 变换到罗马字符
    public static String change(int num){
//            String str = switch (num) {
//                case '0' -> str="";
//                case '1' -> "I";
//                case '2' -> "II";
//                case '3' -> "III";
//                case '4' -> "IV";
//                case '5' -> "V";
//                case '6' -> "VI";
//                case '7' -> "VII";
//                case '8' -> "VIII";
//                case '9' -> "X";
//                default:
//        String str = switch (num) {
//            case '0' -> str="";
//            case '1' -> str="I";
//            case '2' -> str="II";
//            case '3' -> str="III";
//            case '4' -> str="IV";
//            case '5' -> str="V";
//            case '6' -> str="VI";
//            case '7' -> str="VII";
//            case '8' -> str="VIII";
//            case '9' -> str="X";
//            default -> str="";
//            };
        return "";
           };


    /**
     * 获取
     *
     * @return str
     */
    public String getStr() {
        return str;
    }

    /**
     * 设置
     *
     * @param str
     */
    public void setStr(String str) {
        this.str = str;
    }

    public String toString() {
        return "summaryPractices{str = " + str + "}";
    }

}
