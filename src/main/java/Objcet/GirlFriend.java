package Objcet;

import java.util.HashMap;
import java.util.Map;

public class GirlFriend {
    private String name;
    private String hobby;
    private String gender;
    private int age;

    public GirlFriend() {
    }

    public GirlFriend(String name, String hobby, String gender, int age) {
        this.name = name;
        this.hobby = hobby;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置
     *
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     * 获取
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public static Map<String, Double> getAvgAge(GirlFriend[] arr) {
        Map<String, Double> result = new HashMap<>();

        //计算总年龄
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girl = arr[i];
            int age = girl.getAge();
            sum += age;
        }
        //计算平均年龄
        double avg = sum / arr.length;

        //判断比平均年龄小的有几个
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girl = arr[i];
            int age = girl.getAge();
            if (age < avg) {
                count ++;
            }
        }
        result.put("avg", avg);
        result.put("count", count);
        return result;
    }




    public String toString() {
        return "GirlFriend{name = " + name + ", hobby = " + hobby + ", gender = " + gender + ", age = " + age + "}";
    }
}
