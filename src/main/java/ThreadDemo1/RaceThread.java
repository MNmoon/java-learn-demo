package ThreadDemo1;

public class RaceThread implements Runnable{
    //龟兔赛跑
    private int step = 100;
    //常量  且 winner只有1个 ->static
    private static String Winner;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {

            //规定兔子每跑10步休息一步
            if (Thread.currentThread().getName().equals("兔子") && i%10 == 0) {
                try {
                    Thread.sleep((long) 0.1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(Thread.currentThread().getName() + "跑了-->" + i + "步");
            step--;
            boolean flag = gameOver(step);
            if (flag) {
                System.out.println("比赛结束");
                break;
            }
        }
    }

    public boolean gameOver(int step){
        if (Winner != null) {
            return true;
        }else {
            if (step <= 0){
                Winner = Thread.currentThread().getName();
                System.out.println("Winner is " + Winner);
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        RaceThread rabbit = new RaceThread();
        RaceThread torise = new RaceThread();

        new Thread(rabbit,"兔子").start();
        new Thread(torise,"乌龟").start();


    }
}
