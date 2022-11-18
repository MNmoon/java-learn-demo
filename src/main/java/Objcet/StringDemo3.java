package Objcet;


public class StringDemo3 {
    private String Id;


    public StringDemo3() {
    }

    public StringDemo3(String Id) {
        this.Id = Id;
    }

    /**
     * 隐藏身份证信息
     * @return Id
     */
    public static String hideInfo(String Id){
        //隐藏中间八位 52010019909201290
        String ID = Id.replace("01990920","********");
        return ID;
    }

    //从身份证第17位获取到用户的性别
    public String getGender(String Id){
        String gender = "女";
        //'9' 字符9  怎么奇偶判断？
        char ch = Id.charAt(16);
        //转换数字  做奇数偶数判断 --得到性别
        //ASCII中字符'0' 对应48  '9' 对应 57
        int num = ch - 48;
        if (num % 2 == 0){
            gender = "女";
        }else {
            gender = "男";
        }
        return gender;
    }


    /**
     * 获取
     * @return ID
     */
    public String getId() {
        return Id;
    }

    /**
     * 设置
     * @param Id
     */
    public void setID(String Id) {
        this.Id = Id;
    }

    public String toString() {
        return "StringDemo3{ID = " + Id + "}";
    }
}
