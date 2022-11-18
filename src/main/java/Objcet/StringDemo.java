package Objcet;

public class StringDemo {

    public static void main(String[] args) {
        //创建一个空字符串对象
        String str00 = new String();
        System.out.println("@" + str00 + "!");

        //拼接字符
        char[] chs = {'a','b','c'};
        String str = new String(chs);
        System.out.println(str);

        //传输一个字节数组,根据字节数组再创建一个新的字符串对象
        //应用场景:平时网络中传输的都是字节信息
        //一般要将字节信息转换成字符串对象  此时就需要构造了
        byte[] bytes = {97,98,99,100};
        String str01 = new String(bytes);
        System.out.println(str01);

    }


}


