package ThreadDemo1;

//多线程操作一个对象,线程不安全，数据紊乱(多个人可能拿到同一张票)
public class duoOperThread implements Runnable {
    private int ticketNum = 10;

    @Override
    public void run() {
        while(true) {
            if (ticketNum <= 0){
                break;
            }
//        //模拟延时
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName() + " 拿到了ticket" + ticketNum--);
//            ticketNum = ticketNum - 1;
        }
    }

    public static void main(String[] args) {
        duoOperThread ticket = new duoOperThread();

        //并发的
        new Thread(ticket,"小明").start();
        new Thread(ticket,"小红").start();
        new Thread(ticket,"小花").start();

    }
}
