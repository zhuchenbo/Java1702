package java1702.javase.io;

import sun.text.resources.cldr.ur.FormatData_ur;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by xiaozhu
 * on 2017/4/21
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("raf", "rw");
            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeDouble(i * 0.5);
            }
            randomAccessFile.seek(32L);
            System.out.println(randomAccessFile.readDouble());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
