package java1702.javase.io;

import java.io.*;

/**
 * Created by xiaozhu
 * on 2017/4/20
 */
public class ReaderTest {
    //    public static void main(String[] args) {
//        try {
//            Reader reader = new FileReader("test");
//            Writer writer = new FileWriter(""){
//                int i;
//                while((i=reader.read())!=1){
//                    System.out.println((char)i);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {
        try (
                Reader reader = new FileReader("test");
                Writer writer = new FileWriter("")) {
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
