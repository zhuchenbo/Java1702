package java1702.javase.io;

import java.io.File;

/**
 * Created by xiaozhu
 * on 2017/4/21
 */
public class FileTest {
    public static void main(String[] args) {
        //  file 文件的意思
        File file = new File("raf");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
    }
}
