package threadDemo;

public class Consumer implements Runnable{
    private Storage storage;

    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public  void run(){
        int i = 0;
        //消费者从仓库中去拿10个产品，2个消费者线程共会消费20个产品
        while (i < storage.getCapacity()) {
            i ++;
            storage.pop();
        }
    }





}
