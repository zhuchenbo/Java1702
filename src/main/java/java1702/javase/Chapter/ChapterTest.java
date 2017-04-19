package java1702.javase.Chapter;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import javax.print.attribute.AttributeSetUtilities;
import javax.xml.transform.Source;

/**
 * Created by xiaozhu
 * on 2017/4/17
 */
public class ChapterTest {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.err.println("算数异常");
        }

    }
}
