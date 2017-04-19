package java1702.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by xiaozhu
 * on 2017/4/18
 */
public class InputStreamTest {
    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("test");
//            int i = inputStream.read();
//            while (i != -1) {
//                System.out.print((char) i);
//                i = inputStream.read();
//
//            }
//            System.out.println((char)inputStream.read());
            int i;
            while ((i = inputStream.read()) != -1){
                System.out.print((char) i);
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
