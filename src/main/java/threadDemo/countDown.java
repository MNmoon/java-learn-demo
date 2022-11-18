package threadDemo;

import java.util.concurrent.CountDownLatch;

public class countDown {
    public static void main(String[] args) {
        final int count = 10;
        final CountDownLatch latch = new CountDownLatch(count);

        for (int i = 0; i < count; i++) {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        System.out.println("线程" + Thread.currentThread().getId());
                    } catch (Throwable e) {
                        // whatever
                    } finally {
                        // 很关键, 无论上面程序是否异常必须执行countDown,否则await无法释放
                        latch.countDown();
                    }
                }
            }).start();
        }

        try {
            //某一线程在开始运行前等待10个线程执行完毕
            // 10个线程countDown()都执行之后才会释放当前线程,程序才能继续往后执行
            //计数器为0的情况下 await的线程才会被唤醒
            //一个典型应用场景就是启动一个服务时，主线程需要等待多个组件加载完毕，之后再继续执行。
            latch.await(); //阻塞当前线程
        } catch (InterruptedException e) {
            // whatever
        }
        System.out.println("Finish");
    }

}