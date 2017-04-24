package java1702.javase.javaApplication;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

import static java.lang.System.out;

/**
 * Created by xiaozhu
 * on 2017/4/22
 */
public class F3 {
//    public static void main(String[] args) {
//        // 字节输入流
//
//        FileInputStream fis = null;
//        RandomAccessFile randomFile = null;
//
//        try {
//
//// 打开一个随机访问文件流，按读写方式
//
//            randomFile = new RandomAccessFile("c://3.txt", "rw");
//
//// 文件长度，字节数
//
//            long fileLength = randomFile.length();
//
//// 将写文件指针移到文件尾。
//
//            randomFile.seek(fileLength);
//
//            File fileRead = new File("c://1.txt");
//
//// 定义一个字节数组 相当于缓存 一点一点读进来 一下都进来 内存放不下
//
//            byte[] bytes = new byte[1024];
//
//            fis = new FileInputStream(fileRead);
//
//            int n = 0;// 得到实际读取到的字节数
//
//// 循环读取
//
//            while ((n = fis.read(bytes)) != -1) {// 读完了
//
//// 把字节转成string
//
//                String str = new String(bytes, 0, n);
//
//                randomFile.writeBytes(str);
//
//            }
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//
//
//        } finally {
//
//            try {
//
//                fis.close();
//
//                randomFile.close();
//
//            } catch (Exception e) {
//
//                e.printStackTrace();
//
//            }
//
//        }
//

    //    }
    public static final int BUFSIZE = 1024 * 8;

    public static void mergeFiles(String outFile, String[] files) {
        FileChannel outChannel = null;
        out.println("Merge " + Arrays.toString(files) + " into " + outFile);
        try {
            outChannel = new FileOutputStream(outFile).getChannel();
            for (String f : files) {
                FileChannel fc = new FileInputStream(f).getChannel();
                ByteBuffer bb = ByteBuffer.allocate(BUFSIZE);
                while (fc.read(bb) != -1) {
                    bb.flip();
                    outChannel.write(bb);
                    bb.clear();
                }
                fc.close();
            }
            out.println("Merged!! ");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (outChannel != null) {
                    outChannel.close();
                }
            } catch (IOException ignore) {
            }
        }
    }

    public static void main(String[] args) {
        mergeFiles("c://3.txt", new String[]{"c://1.txt", "c://2.txt"});
    }

}
