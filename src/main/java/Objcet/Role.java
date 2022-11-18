package Objcet;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String faces;

    String[] boyfaces = {"器宇轩昂", "面目狰狞", "风流倜傥"};
    String[] girlfaces = {"美丽大方", "楚楚动人", "蛇蝎心肠"};

    //攻击描述
    String[] attackDesc={
            "%s使出一掌背心钉 攻向对象后背",
            "%s使出一阳指 攻向对方天灵盖",
            "%s使出ssss 攻向对方天灵盖"
    };
    //受伤描述
    String[] injectDesc={
            "%s后退 毫发无损",
            "%s后退 造成骨折",
            "%s向后倒地不起"
    };

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //根据genger设置faces
        this.setFaces(gender);
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    /**
     * 获取
     *
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return faces
     */
    public String getFaces() {
        return faces;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setFaces(char gender) {
        //根据性别确定长相
        Random r = new Random();

        if (gender == '男') {
            int indexBoy = r.nextInt(boyfaces.length);
            this.faces = boyfaces[indexBoy];
        } else if (gender == '女') {
            int indexGirl = r.nextInt(girlfaces.length);
            this.faces = boyfaces[indexGirl];
        } else {
            this.faces = "no gender";
        }
    }

        /**
         * attack
         */
    public void attack(Role role){
        Random r = new Random();
        int index = r.nextInt(attackDesc.length);

        //攻击描述
        System.out.printf(attackDesc[index],this.getName());


        //每次造成伤害 1 - 20
        int hurt = r.nextInt(20) + 1;
        int remainBlood = role.getBlood() - hurt;
        //剩余血量
//        if (role.getBlood() < 0) role.setBlood(0); //bug
        remainBlood = remainBlood < 0 ? 0: remainBlood;
        role.setBlood(remainBlood);
//        System.out.println(this.getName() + "举起拳头打了" + role.getName() + "一下，造成了 " + hurt + "点伤害 " +role.getName() +"还剩下 " + role.getBlood() + "点血");

        //受伤描述 受伤严重程度判断
//        System.out.printf(injectDesc[index],role.getName());
        System.out.printf(String.format("造成 %s 点伤害,", hurt));
        if (remainBlood > 90){
            System.out.println(String.format(injectDesc[0],role.getName()));
        } else if ( remainBlood >= 70 && remainBlood <= 90) {
            System.out.println(String.format(injectDesc[1],role.getName()));
        }else {
            System.out.println(String.format(injectDesc[2], role.getName()));
        }
    }
    public void showInfo(){
        System.out.println("人物姓名:" + this.getName());
        System.out.println("人物血量:" + this.getBlood());
        System.out.println("人物性别:" + this.getGender());
        System.out.println("人物形象:" + this.getFaces());

    }

}

