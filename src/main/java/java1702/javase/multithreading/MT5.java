package java1702.javase.multithreading;

/**
 * Created by xiaozhu
 * on 2017/5/8
 */
public class MT5 implements Runnable{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MT5());
        thread1.setName("thread1");
        Thread thread2 = new Thread(new MT5());
        thread2.setName("thread2");
        Thread thread3 = new Thread(new MT5());
        thread3.setName("thread3");

        thread1.start();
        thread2.start();
//        try {
//            thread2.join(); // main 线程被阻塞
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        thread3.start();
        System.out.println("test....");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+"is running");
            try {
                Thread.sleep((int) (Math.random() * 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
