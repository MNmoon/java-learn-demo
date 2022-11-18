package Objcet;

import org.junit.jupiter.api.Test;

class GoodsTest {

    @Test
    void goodsTest(){
        //创建数组
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("000","huawei","100","50");
        Goods g2 = new Goods("001","xiaomi","100","50");
        Goods g3 = new Goods("002","apple","100","50");
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + goods.getProduceName() + goods.getPrice() + goods.getCount());
        }

    }
}