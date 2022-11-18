package Objcet;

public class Goods {
    private String id;
    private String produceName;
    private String price;
    private String count;

    public Goods() {
    }

    public Goods(String id, String produceName, String price, String count) {
        this.id = id;
        this.produceName = produceName;
        this.price = price;
        this.count = count;
    }


    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return produceName
     */
    public String getProduceName() {
        return produceName;
    }

    /**
     * 设置
     * @param produceName
     */
    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }

    /**
     * 获取
     * @return price
     */
    public String getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 获取
     * @return count
     */
    public String getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(String count) {
        this.count = count;
    }

    public String toString() {
        return "Goods{id = " + id + ", produceName = " + produceName + ", price = " + price + ", count = " + count + "}";
    }

}
