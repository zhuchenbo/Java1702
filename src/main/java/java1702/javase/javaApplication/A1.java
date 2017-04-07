package java1702.javase.javaApplication;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import javax.xml.transform.Source;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by xiaozhu
 * on 2017/4/1
 */
//从键盘上输入 4 行 4 列的一个实数矩阵到一个二维数组中
// 然后求出主对角线（从左上角到右下角）上元素之和以及副对角线上元素之乘积。
public class A1 {
//    public static void main(String[] args) throws IOException{
//        final int M = 4;
//        double[][] a = new double[M][M];
//        int i,j;
//        double main_product=1.0,vice_product=1.0;
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader(isr);
//        for(i=0;i<M;i++)
//            for(j=0;j<M;j++)
//                a[i][j]=Double.parseDouble(br.readLine());
//        for(i=0;i<M;i++){
//            main_product *= a[i][i];
//            vice_product *= a[i][M-i-1];
//        }
//        System.out.println("主对角线乘积为："+main_product);
//        System.out.println("付对角线乘积为："+vice_product);
//    }
public static void main(String[] args) {
    int[][] ints = new int[4][4];
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int mul = 1;
    for (int i = 0; i < ints.length; i++) {
        for (int j = 0; j < ints[i].length; j++) {
            System.out.println("input int:" );
            ints[i][j] = scanner.nextInt();
            if (i == j) {
                 sum += ints[i][j];
            }
            if (i + j == ints.length - 1) {
                mul *= ints[i][j];
            }
        }
    }
    System.out.println(Arrays.deepToString(ints));
    System.out.println(sum);
    System.out.println(mul);
}
}

