package StudentSystem;

import Objcet.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSys {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

//        loop: while (true) {
        loop:
        while (true) {
            System.out.println("1 添加学生");
            System.out.println("2 查询学生");
            System.out.println("3 修改学生");
            System.out.println("4 删除学生");
            System.out.println("5 退出！");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1" : {addStudent(list); break;}
                case "2" : {queryStudent(list); break;}
                case "3" : {updateStudent(list); break;}
                case "4" : {delStudent(list); break;}
                case "5" : {
                    System.out.println("退出系统");
//                break loop;
                    System.exit(0);
                }
                case "6" : {login();break;}
                case "7" : {register(list);break;}
//                case "8" : {forgetPasswd();break;}
                default : System.out.println("没有这个选项");
            }

        }

    }


    //添加
    public static void addStudent(ArrayList<Student> list) {
        Student stu = new Student();

        //判断id是否存在
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("enter id: ");
            int id = sc.nextInt();
            System.out.println("enter name: ");
            String name = sc.next();
            System.out.println("enter age: ");
            int age = sc.nextInt();
            boolean flag = isExist(list,id);
            if (flag) {
                System.out.println("id 存在 请重新录入！");
            }else {
                stu.setId(id);
                stu.setName(name);
                stu.setAge(age);
                list.add(stu);
                System.out.println("学生信息添加成功！");
                break;
            }
        }
    }

    //删除
    public static void delStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter del id: ");
        int id = sc.nextInt();
        int index = getIndex(list,id);
        if (index >= 0 ){
            System.out.println("要删除的id存在，删除成功！");
            list.remove(index);
        }else {
            System.out.println("要删除的id不存在，删除失败！");
    }
    }

    //修改
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter update id: ");
        int id = sc.nextInt();
        int index = getIndex(list,id);
        if (index >= 0 ) {
            Student stu = list.get(index);
            stu.setId(id);
            System.out.println("enter name: ");
            String name = sc.next();
            stu.setName(name);
            System.out.println("enter age: ");
            int age = sc.nextInt();
            stu.setAge(age);
            list.add(stu);
            System.out.println("update student info success!");
        }else {
            System.out.println("要修改的id不存在，重新输入！");
        }

    }
    //查询
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息 添加后再查询");
            return;
        }
        System.out.println("请输入要查询的id:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        //打印表头信息
        System.out.println(" id\t\tname\t\tage");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId() == id) {
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t");
                return;
            }
        System.out.println("要查询的信息不存在！");
        }
    }
    /**
     * 登录
     */
    public static void login(){

    }

    /**
     * register
     */
    public static boolean register(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        //先验证格式是否正确
        //所有的数据以后都是存在于数据库中 需要校验则需要需用网络资源 --性能问题
        while (true) {
            System.out.println("请输入用户id：");
            String id = sc.next();
            boolean flag = checkUsername(id);
            if (!flag) {
                System.out.println("用户名格式不满足条件,重新输入！");
                continue;
            }

            //验证唯一性
//        boolean flag1 = isExist(list,id);
        }
    }

    private static boolean checkUsername(String username) {
        //require: 用户名唯一  3-15
        int len = username.length();
        //username.length() < 3 || username.length() > 15) -->需要调用2次计算 效率低下
        if (len <3 || len > 15) {
            return false;
        }
        //字母+数字
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                return false;
            }
        }
        int count = 0;
        //且不能是纯数字  统计usrname中字母的个数 >=1即可
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                count ++;
                break;//当统计到有1个字母 确认不是纯数字 则可break 提高效率
            }
        }
        return count > 0;
    }

    /**
     * 忘记密码
     */
    public static void forgetPasswd(){

    }


    public static boolean isExist(ArrayList<Student> list,int id){
        //注释的代码跟getIndex相似
//        for (int i = 0; i < list.size(); i++) {
//            Student stu = list.get(i);
//            if (stu.getId() == id) {
//                return true;
//            }
//        }
//        return false;
        //getIndex(list,id) >= 0  表达式的取值为true  false
        //复用getIndex的代码
        return getIndex(list,id) >= 0;
    }

    public static int getIndex(ArrayList<Student> list,int id){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId() == id) {
                return i;
            }
        }
        return -1;
    }



}
