package java1702.javase.javaApplication;

/**
 * Created by xiaozhu
 * on 2017/4/22
 */
// 编写一个没有处理的发生数组下标越界异常的程序
public class F1 {
    public static void main(String[] args) {
//        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception:" + e);
//        }
//        System.out.println("Out of the block");
    }
}
