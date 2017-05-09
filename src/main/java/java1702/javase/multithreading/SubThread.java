package java1702.javase.multithreading;

/**
 * Created by xiaozhu
 * on 2017/5/8
 */
public class SubThread extends Thread{
    public static void main(String[] args) {
        SubThread subThread = new SubThread();
        subThread.run();
        System.out.println("test...");
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
//        super.run();
    }
}
