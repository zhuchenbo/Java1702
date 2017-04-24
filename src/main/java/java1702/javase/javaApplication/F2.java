package java1702.javase.javaApplication;

/**
 * Created by xiaozhu
 * on 2017/4/22
 */
//编写一个正确处理的产生空指针异常的程序
public class F2 {
    public static void main(String[] args) {
        String s = null;
        try {
            if (s != null) {
                System.out.println(s.charAt(0));
            }
        } catch (NullPointerException e) {
            e.printStackTrace();

        }
        System.out.println("hello");
    }
}
