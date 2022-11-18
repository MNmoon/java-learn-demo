package threadDemo;

public class TestThread extends Thread{

    @Override
    public void run(){
        //不断的循环
        while (true){
            System.out.println("test thread is running");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
