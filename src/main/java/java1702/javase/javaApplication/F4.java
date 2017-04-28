package java1702.javase.javaApplication;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import sun.text.resources.cldr.ia.FormatData_ia;
import sun.text.resources.cldr.ur.FormatData_ur_IN;

import javax.xml.transform.Source;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by xiaozhu
 * on 2017/4/27
 */

// 编写一个程序以下功能：
// （1）产生5000个（1，9999）[2,9998]之间的随机整数，将其存在文本文件 a.txt 中
// （2）从文件中读取这个5000个整数，并计算其最大值、最小值和平均值并输出结果
public class F4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5000; i++) {
            int r = (int) (Math.random() * 9997) + 2;
//            System.out.println(r);
            try (RandomAccessFile raf=new RandomAccessFile("a.txt","rw")) {
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
