package Objcet;

public class arrayToString {




    public static void main(String[] args) {
//        //没有这个arr
//        int[] arr = new int[0];
//        int[] arr1 = new int[2]; // {1,2,3}
        int[] arr = {1,2,3};
        String str = convert(arr);
        System.out.println("str: " + str);

    }

    public static String convert(int[] arr) {
        String result = "[";
        if (arr == null) {
            return "--";
        }
        if (arr.length == 0) {
            return "[]";
        }
        for (int i = 0; i < arr.length; i++) {
            //[1,2,3]
            if (i == arr.length - 1) {
                result = result + arr[i] + "]";
            } else {
                result = result + arr[i] + ",";
            }
        }
        return result;
    }


}
