package Objcet;

import java.util.Scanner;

public class numToChineseCharacters {
    //2135
    //贰壹叁伍
    //零零零贰壹叁伍
    //零佰零拾零万贰仟壹佰叁拾伍圆
    private final static String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    private final static String[] arr1 = {"佰","拾","万","仟","佰","拾","圆"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num(0-9999999)");
        int num = sc.nextInt();
        //判断输入的数字是否有效 0-9999999
        if (num < 0 && num > 9999 ){
            System.out.println("输入金额无效");
        }else {
            convertNum(arr,arr1,num);
        }
    }
    public static void convertNum(String[] arr,String[] arr1, int num){
        //拆分得到每一个数
        //得到每一个数的中文大写
        String capitall = "";
        while(true) {
            int ge = num % 10;
            //注意capitall要在后面 不然出来的顺序就反了
            capitall = arr[ge] + capitall;
            num = num / 10;
            if(num == 0){
                break;
            }
        }
        //补位 7位 前面要补零零零
        //计算补几位
        int count = 7 - capitall.length();
        for (int i = 0; i < count; i++) {
            capitall = "零" + capitall;
        }
        System.out.println("capitall111: " + capitall);
        System.out.println("capitall111: " + capitall.length());

        //添加单位
        String money = "";
        for (int i = capitall.length() - 1; i > 0 ; i--) {
            money = capitall.charAt(i) + arr1[i] + money;
        }
        System.out.println("capitall: " + money);
    }


}
