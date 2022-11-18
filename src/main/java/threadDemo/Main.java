package threadDemo;

public class Main {
    public static Integer  r1 = 1;
    public static Integer r2 = 2;
    public static void main(String[] args)  throws InterruptedException{
//        TestThread1 t1 = new TestThread1();
//        TestThread2 t2 = new TestThread2();
//        //死锁测试  线程获取资源顺序不能交叉
//        t1.start();
//        t2.start();
        TestThread t = new TestThread();
        //先设置
        t.setDaemon(true);
        //后启动
        t.start();
        Thread.sleep(2000);
        System.out.println("main thread is existing");
    }
}
