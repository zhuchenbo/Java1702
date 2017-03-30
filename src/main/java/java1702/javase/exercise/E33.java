package java1702.javase.exercise;

import java.util.Arrays;

/**
 * Created by xiaozhu
 * on 2017/3/30
 * 打印出杨辉三角形（要求打印出 n 行如下图）
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * .........（略）
 */
public class E33 {
//    public static void main(String[] args) {
//        int[][] a = new int[10][10];
//
//        for (int i = 0; i < 10; i++) {
//
//            a[i][i] = 1;
//
//            a[i][0] = 1;
//
//        }
//
//        for (int i = 2; i < 10; i++) {
//
//            for (int j = 1; j < i; j++) {
//
//                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
//
//            }
//
//        }
//
//
//        for (int i = 0; i < 10; i++) {
//
//            for (int k = 0; k < 2 * (10 - i) - 1; k++) {
//
//                System.out.print(" ");
//
//            }
//
//            for (int j = 0; j <= i; j++) {
//
//                System.out.print(a[i][j] + "  ");
//
//            }
//
//            System.out.println();
//
//        }
//
//    }

    public static void main(String[] args) {
        int[] array1 = {1};
        int[] array2 = {1, 1};
        int[] array3 = {1, 2, 1};
        int[] array4 = {1, 3, 3, 1};

        int[] array5 = new int[5];
        for (int i = 0; i < array5.length; i++) {
            if (i == 0 || i == array5.length - 1) {
                array5[i] = 1;
            } else {
                array5[i] = array4[i - 1] + array4[i];
            }

        }
        System.out.println(Arrays.toString(array5));
    }
}
