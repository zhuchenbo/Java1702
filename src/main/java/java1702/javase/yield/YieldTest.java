package java1702.javase.yield;

/**
 * Created by xiaozhu
 * on 2017/5/9
 */
public class YieldTest implements Runnable{
    public static void main(String[] args) {

    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
