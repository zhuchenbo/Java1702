package java1702.javase.Chapter;

/**
 * Created by xiaozhu
 * on 2017/4/17
 */
public class Test {
    public static void main(String[] args) {
        try {

            System.out.println("hello".charAt(5));//异常 例外
        } catch (StringIndexOutOfBoundsException e) {
            //e.printStackTrace();
        }

        System.out.println((new int[]{1, 2, 3})[0]);

        System.out.println(1 / 2);

        System.out.println(Integer.valueOf("123"));

        String s = "hi";

        //s = null;
        System.out.println(s.toUpperCase());
    }
}
