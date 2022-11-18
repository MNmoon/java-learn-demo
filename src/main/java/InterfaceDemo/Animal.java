package InterfaceDemo;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(){}
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //eat something
    public abstract void eat();
}
