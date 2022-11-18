package Objcet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class rotateStringTest {

    @Test
    void rotate() {
        String name = "abcde";
        String name1 = "cdeab";

        boolean flag = compareStr(name,name1);
        if (flag) {
            System.out.println("反转后name与name1相等");
        }else {
            System.out.println("反转后name与name1不相等");
        }
    }

    @Test
    void disruptedOrder(){
        String name = "name";
        char[] arr = name.toCharArray();
        //打乱顺序 从0索引开始 跟一个随机索引进行位置交换
        //当数组中的每一个元素都跟一个随机索引交换位置后  那么顺序就乱了

        String new_name = new String(arr);
        System.out.println(new_name);

    }


    private boolean compareStr(String name,String name1){
        for (int i = 0; i < name.length() - 1; i++) {
            String res = rotateString.rotate(name);
            //反转后需要给name重新赋值 否则每次都是用name来做第一次截取  bug!!!
            name = res;
            if (res.equals(name1)){
                return true;
            }
        }
        return false;
    }
}