package java1702.javase.multithreading;

import javax.swing.*;

/**
 * Created by xiaozhu
 * on 2017/5/10
 */
public class PriorityTest implements Runnable{
    public static void main(String[] args) {
        //  priority 优先级
        Thread thread1 = new Thread(new PriorityTest(), "thread 1");
        Thread thread2 = new Thread(new PriorityTest(), "thread 2");
        Thread thread3 = new Thread(new PriorityTest(), "thread 3");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    @Override
    public void run() {
        Thread currThread = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(currThread.getName()+":"+currThread.getPriority());
        }
    }
}
