package java1702.javase.newoop;

/**
 * Created by xiaozhu
 * on 2017/4/7
 */
public class ParameterPassTest {
    private static void test(int x) {
        x = 1;
        System.out.println("a:" + x);
        x++;
        System.out.println("d:" + x);
    }

    public static void main(String[] args) {
        int x = 0;
        System.out.println("b:" + x);
        test(x);
        System.out.println("c:" + x);
    }
}
