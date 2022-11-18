package Objcet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private final static Student[] arr = new Student[3];

    @BeforeEach
    void beforeEach(){
        Student stu0 = new Student(001,"lucy",28);
        Student stu1 = new Student(002,"xiaomei",29);
        Student stu2 = new Student(003,"dazhuang",38);
        arr[0] = stu0;
        arr[1] = stu1;
        arr[2] = stu2;
    }

    @Test
    void studentAddTest(){
        Student stu3 = new Student(004,"kalami",27);

        boolean flag =  contains(arr, stu3.getId());
        //判断数组长度
        if (flag){
            //
            System.out.println("此ID已存在");
        }else {
            //判断是数组是否存满
            int count = getCounter(arr);
            if (count == arr.length){
                //创建一个新的数组 新数组的长度 = arr.length + 1,且将原数组的数据全部拷贝过去
                //在最后一个索引的位置上添加此时要增加的stu3
                Student[] arr01 = create(arr);
                arr01[count] = stu3;
                //遍历学生信息
                showInfo(arr01);
            }else {
                arr[count] = stu3;
                //遍历学生信息
                showInfo(arr);
            }
        }
    //添加完学生信息后 遍历学生信息
    }

    @Test
    void studentDelTest(){
//        Student stu3 = new Student(004,"kalami",27);
//        Student stu1 = new Student(002,"xiaomei",29);
        int sid = 002;
        //判断id在数组中
        //找出id在数组中的索引
        int i = getIndex(arr,sid);
        if (i >= 0 ) {
            //在 就将数组中该删除:arr[i] = null
                arr[i] = null;
            showInfo(arr);
        }else {
            //不在就打印删除失败
            System.out.println("该ID不存在，删除失败");
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {002,005})
    void GIVEN_exist_student_id_WHEN_query_student_THEN_update_age(int sid){
        //query ok,then update age
        updateAge(arr,sid);
        showInfo(arr);
    }

    @Test
    void GIVEN_collection_WHEN_create_student_THEN_create_success(){
        //定义集合 泛型为Student对象
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student(1,"lucy",15);
        Student stu2 = new Student(2,"xxxx",18);

        list.add(stu1);
        list.add(stu2);

//        for (int i = 0; i < list.size(); i++) {
//            Student stu = list.get(i);
//            System.out.println(list.get(i));
//            System.out.println("Id: " + stu.getId() + " Name " + stu.getName() + " Age " + stu.getAge());
//        }
        boolean flag = searchUser(3,list);
        if (flag) {
            System.out.println("id 在list中");
        }else {
            System.out.println("id 不在list中");
        }

    }


    public static boolean searchUser(int id, ArrayList<Student> arr) {
        //查找id是否在集合stu中
        for (int i = 0; i < arr.size(); i++) {
            Student stu = arr.get(i);
            if (id == stu.getId()) {
                //可以返回索引
//                return i;
                return true;
            }
        }
        //返回索引 -1表示不存在
//        return -1;
        return false;
    }


    public static void updateAge(Student[] arr, int sid) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null){
                if (sid == arr[i].getId()){
                    //找到 则getAget + 1
                    stu.setAge(stu.getAge() + 1);
                }
            }
        }
    }


    //找出id在数组中的索引
    public static int getIndex(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
                Student stu = arr[i];
                if (stu != null) {
                    if (id == stu.getId()) {
                        return i;
                    }
                }
        }
        return -1;
    }

    //遍历
    public static void showInfo(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            //如果数组没有装满 则null的不需要打印
            if (arr[i] != null) {
                System.out.println("id: " + arr[i].getId() + " Name: " + arr[i].getName() + " Age: " + arr[i].getAge());
            }
        }
    }

    //创建一个新的数组 新数组的长度 = arr.length + 1,且将原数组的数据全部拷贝过去
    public static Student[] create(Student[] arr){
        Student[] arr01 = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr01[i] = arr[i];
        }
        return arr01;
    }

    //判断数组是否存满
    public static int getCounter(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                count ++;
            }
        }
        return count;
    }

    //what i should do
    //what shoud i need
    //need return?
    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            //当数组本身就没装满
            if (arr[i] != null){
                //arr[i] == null时调用getId() ->bug
                int sid = arr[i].getId();
                if (id == sid) {
                    return true;
                }
            }
        }
        return false;
    }

}