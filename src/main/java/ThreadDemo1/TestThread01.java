package ThreadDemo1;

public class TestThread01 extends Thread{

    //重写run:执行线程体
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("learn 多线程 " + i);
        }
    }

    //线程开启不一定立即执行，由cpu调度
    public static void main(String[] args) {
        //main线程主线程
        TestThread01 tt01 = new TestThread01();
        //调用start方法开启线程
        tt01.start();
//        System.out.println("run");
//        tt01.run();


//        for (int i = 0; i < 4; i++) {
//            System.out.println("lll");
//        }
    }
}
