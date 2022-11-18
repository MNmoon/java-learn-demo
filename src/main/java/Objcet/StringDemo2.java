package Objcet;

import java.util.Scanner;

public class StringDemo2 {
    //模拟用户登录  3次try chance
    private String username;
    private String password;

    public StringDemo2() {
    }

    public StringDemo2(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static void login(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("username:");
            String username = sc.next();
            System.out.println("password:");
            String password = sc.next();
            //短路运行算
            if (username.equals("chunyan") && password.equals("Admin123")){
                System.out.println("login success");
                break;
            }else {
                if (i == 2) {
                    System.out.println("账户被锁定，联系管理员解锁！");
                }else {
                    System.out.println("username or password error,retry time:" + ( 2 - i));
                }
            }
        }
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return username;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.username = name;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "StringDemo2{name = " + username + ", password = " + password + "}";
    }
}
