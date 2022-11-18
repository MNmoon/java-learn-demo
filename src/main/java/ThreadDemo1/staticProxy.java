package ThreadDemo1;

import javax.swing.*;

//静态代理
//真是对象和代理对象都要实现同一个接口
//代理对象要代理一个真是的对象 target
public class staticProxy {
    public static void main(String[] args) {
        //lambda
        new Thread(()-> System.out.println("maybe")).start();
        new WeddingCompany(new You()).HappyMarry();
    }
}

interface Marry{
    void HappyMarry();

}
class You implements Marry{
    @Override
    public void HappyMarry(){
        System.out.println("You will be happy ---you will be marry");
    }

}

class WeddingCompany implements Marry{
    //代理的对象
    private Marry target;

    public WeddingCompany(Marry target){
        this.target = target;
    }

    @Override
    public void HappyMarry(){
        before();
        this.target.HappyMarry(); //真是对象
        after();
    }
    public void before(){
        System.out.println("布置现场");
    }

    public void after(){
        System.out.println("收尾款");
    }
}