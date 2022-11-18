package org.example;

public class twoDimensonDemo {
    public static void main(String[] args) {
        //二维数组
        String[][] arr00 = new String[][]{{"a","b"},{"c","d"}};
        //建议这么写
        int[][] arr01 = {
                {1,2},
                {4,5,6}
        };
        for (int i = 0; i < arr01.length; i++) {
            for (int i1 = 0; i1 < arr01[i].length; i1++) {
                System.out.print(arr01[i][i1] + " ");
            }
            System.out.println("");
        }



    }
}
