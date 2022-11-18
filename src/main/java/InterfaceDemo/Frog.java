package InterfaceDemo;


//继承animal 且还要实现接口Swim
public class Frog extends Animal implements Swim {
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("frog 吃东西");
    }

    @Override
    public void swim() {
        System.out.println("frog swim");

    }
}
