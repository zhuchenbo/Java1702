package java1702.javase.collection;

import com.sun.org.apache.bcel.internal.generic.ALOAD;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

/**
 * Created by xiaozhu
 * on 2017/3/29
 */
public class StringVsStringBufferTest {
    public static final String ALPHABET="sadshdsfkjhafasfasfhufs";
    //private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz"; // alphabet 字母\ ['ælfəbet]


    public static void main(String[] args) {
        String s="";
        StringBuffer stringBuffer=new StringBuffer("");
        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {

            stringBuffer.append(ALPHABET);
        }
        System.out.println("time:"+(System.currentTimeMillis()-start));
        System.out.println(stringBuffer.length());
    }

}
