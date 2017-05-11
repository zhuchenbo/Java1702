package java1702.javase.multithreading;

/**
 * Created by xiaozhu
 * on 2017/5/10
 */
public class Sync {
    public void test() {
        synchronized (Sync.class) {
            System.out.println(Thread.currentThread().getName() + "start..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "end...");
        }
    }
}

class SyncTest implements Runnable {
    private Sync sync;

    public void run() {
        sync = new Sync();
        sync.test();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SyncTest(), "tread" + i);
            thread.start();
        }
    }
}
