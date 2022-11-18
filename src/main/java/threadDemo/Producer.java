package threadDemo;

import java.util.Random;

public class Producer implements Runnable{
    private Storage storage;

    public Producer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run(){
        int i = 0;
        Random r = new Random();

        //生产者往仓库放10个产品 两个生产者线程共计会生产20个产品
        while (i < storage.getCapacity()) {
            i ++;
            Product product = new Product(i, "商品" + r.nextInt(100));
            try {
                storage.push(product);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }

}












