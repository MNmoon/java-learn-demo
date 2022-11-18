package ThreadDemo1;

import java.util.concurrent.TimeUnit;

public class TimeSleepDemo {
    public static void main(String[] args) {
        System.out.println("main start");
        sleep();
        System.out.println("dddddd");

    }

    public static void sleep(){
        System.out.println("sleep 5s");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
