package Objcet;

public class SeatFsVo {
    private String Name;
    private int Age;
    private String ExplicitNumber;
    private String ExplicitNumber2;

    public SeatFsVo() {
    }

    public SeatFsVo(String Name, int Age, String ExplicitNumber, String ExplicitNumber2) {
        this.Name = Name;
        this.Age = Age;
        this.ExplicitNumber = ExplicitNumber;
        this.ExplicitNumber2 = ExplicitNumber2;
    }

    /**
     * 获取
     * @return Name
     */
    public String getName() {
        return Name;
    }

    /**
     * 设置
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取
     * @return Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * 设置
     * @param Age
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * 获取
     * @return ExplicitNumber
     */
    public String getExplicitNumber() {
        return ExplicitNumber;
    }

    /**
     * 设置
     * @param ExplicitNumber
     */
    public void setExplicitNumber(String ExplicitNumber) {
        this.ExplicitNumber = ExplicitNumber;
    }

    /**
     * 获取
     * @return ExplicitNumber2
     */
    public String getExplicitNumber2() {
        return ExplicitNumber2;
    }

    /**
     * 设置
     * @param ExplicitNumber2
     */
    public void setExplicitNumber2(String ExplicitNumber2) {
        this.ExplicitNumber2 = ExplicitNumber2;
    }

    public String toString() {
        return "SeatFsVo{Name = " + Name + ", Age = " + Age + ", ExplicitNumber = " + ExplicitNumber + ", ExplicitNumber2 = " + ExplicitNumber2 + "}";
    }
}
