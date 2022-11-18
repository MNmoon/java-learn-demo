package Objcet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

    @Test
    void GIVEN_three_brand_WHEN_calu_average_price_THEN_calu_scuess() {
        Phone[] arr = new Phone[3];

        Phone p0 = new Phone("xiaomi","yellow",1100);
        Phone p1 = new Phone("huawei","blue",2300);
        Phone p2 = new Phone("apple","black",5100);

        arr[0] = p0;
        arr[1] = p1;
        arr[2] = p2;


        //calculate average price
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum = sum + phone.getPrice();
        }
        int avg = sum / arr.length;
        System.out.println(avg);

        //小数
        double avg2 = sum * 1.0 / arr.length;
        System.out.println(avg2);
    }

}