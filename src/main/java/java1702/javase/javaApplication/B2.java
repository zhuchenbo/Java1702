package java1702.javase.javaApplication;

/**
 * Created by xiaozhu
 * on 2017/4/8
 */
public class B2 {
    public static void main(String[] args) {
        int a[] = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        for (int i = 0; i < a.length; i++) {
            int b = 0;
            if ((a[i] - 0) == 0) {
                b++;
            } else {
                int newArr[] = new int[a.length - b];
                for (int j = 0; j < a.length; j++) {
                    newArr[j] = a[i];
                }
                System.out.print(newArr[i] +",");
            }
        }
    }
}