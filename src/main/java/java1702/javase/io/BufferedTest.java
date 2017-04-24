package java1702.javase.io;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.io.*;

/**
 * Created by xiaozhu
 * on 2017/4/21
 */
public class BufferedTest {
    public static void main(String[] args) {
        // buffer 缓冲
        try (
                BufferedInputStream in = new BufferedInputStream(new FileInputStream("文件路径"));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("新建文件名字加地址"))
        ) {
            int i;
            while ((i = in.read()) != -1) {
                out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
