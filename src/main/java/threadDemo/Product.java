package threadDemo;

public class Product {
    private int id;
    private String name;

    public Product(int id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "产品ID: " + id + " 产品名称 " + name;
    }

}
