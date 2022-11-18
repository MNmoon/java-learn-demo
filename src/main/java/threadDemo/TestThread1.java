package threadDemo;

import java.util.concurrent.TimeUnit;

public class TestThread1 extends Thread {
    @Override
    public void run(){
        synchronized (Main.r1){
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            //t1在对r2对象加锁时，t2已经获取到r2的锁 -->死锁
            synchronized (Main.r2) {
                System.out.println("t1已经在运行");
            }
        }
    }
}
