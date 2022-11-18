package threadDemo;

public class Storage {
    private int capacity = 10;//仓库容量10
    private Product[] products = new Product[capacity];
    private int top = 0;

    public int getCapacity() {
        return capacity;
    }

    //生产者向仓库中存放产品
    public synchronized void push(Product product) throws InterruptedException {
        while (top == capacity) {
            try {
                System.out.println("仓库已满，producer请等待");
                wait();
                /**
                 * 进入等待后 只能由其他线程唤醒
                 * 当某个生产者生成一个产品后 仓库满 则这个生产者线程进入等待
                 * 由于这是一个同步方法 所以另一个线程也会排队等待
                 * 当前等待线程(消费者线程)唤醒时，另一个消费者线程才能继续执行
                 * 被唤醒时继续去判断top与capacity是否相等 是的话就继续等待
                 * 苟泽就继续生成 消费者线程也是一样
                 */
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //把产品放入仓库
        products[top++] = product;
        System.out.println(Thread.currentThread().getName() + " 生产了产品 " + product.toString());
        System.out.println("producer notifyAll");
        notifyAll(); //唤醒所有等待线程
    }

    //消费者从仓库中取产品
    public  synchronized Product pop(){
        while (top == 0) {
            try{
                System.out.println("仓库已空 请等待");
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        //从仓库中取出产品
        Product product =  products[--top];
        products[top] = null;
        System.out.println(Thread.currentThread().getName() + " 消费了产品 " + product.toString());
        System.out.println("customer notifyAll");
        /**若将下面这行注释掉，生产者线程将不会被唤醒
         * 只会有10个产品被生产和消费
         *
         * */
        notifyAll();//唤醒所有等待线程
        return product;
    }

}






















