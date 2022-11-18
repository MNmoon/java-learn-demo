package ThreadDemo1;

//创建线程方法，实现runnable犯法，重写run方法，实现线程需要丢入runnable实现类，调用start方法
public class RunnableThread implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("run 方法" + i);
        }
    }
    public static void main(String[] args) {
        //创建runnable的接口实现类对象
        RunnableThread rt = new RunnableThread();
        //创建线程，通过线程对象来开启我们的线程,代理
        new Thread(rt).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main中循环" + i);
        }

    }
}
