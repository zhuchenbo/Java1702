package java1702.javase.multithreading;

import javax.xml.transform.Source;

/**
 * Created by xiaozhu
 * on 2017/5/8
 */
//  java 语言的虚拟机

public class Test implements Runnable{
    public static void main(String[] args) {

        // process 进程
        // thread  线程
//        run();
        Test test = new Test();
        Thread thread = new Thread(test);
        thread.start();

        System.out.println("test....");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

//    private static void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//    }
}
