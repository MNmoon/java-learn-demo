package utils;

import org.junit.jupiter.api.Test;

class ArryaUtilsTest {

    @Test
    void GIVEN_arr_WHEN_print_THEN_print_array_as_string() {
        int[] arr = {1,2,3,4,5};
        String res = ArryaUtils.printArr(arr);
        System.out.println(res);

    }

    @Test
    void GIVEN_double_arr_WHEN_calc_avg_THEN_print_docuble_avg() {
        double[] arr = {1.2,2.4,3.4,4.1,5.6};
        double res = ArryaUtils.getAvg(arr);
        System.out.println(res);
    }
}