package ExtendsDemo;

public class Animal {

    //吃饭
    public void eat(){
        System.out.println("吃饭");
    }

    //喝水
    public void drink(){
        System.out.println("喝水");
    }

    //私有  不能被继承
    private void play(){
        System.out.println("play");
    }

}
