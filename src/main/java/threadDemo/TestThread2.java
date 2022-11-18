package threadDemo;

import java.util.concurrent.TimeUnit;

public class TestThread2 extends Thread {
    @Override
    public void run(){
//        synchronized (Main.r2){
        synchronized (Main.r1){
            try {
                /* 规定资源的获取顺序，r1 -> r2*/
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            //t2在对r1对象加锁时，t1已经获取到r1的锁
//            synchronized (Main.r1) {
            synchronized (Main.r2){
                System.out.println("t2已经在运行");
            }
        }
    }
}
