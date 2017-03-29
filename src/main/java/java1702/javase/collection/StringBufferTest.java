package java1702.javase.collection;

/**
 * Created by xiaozhu
 * on 2017/3/29
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.toString());

        String s = "hello";
        StringBuffer stringBuffer1 = new StringBuffer(s);
        String s1 = stringBuffer1.toString();

        String s2 = "true";
        s2 += "123";
        System.out.println(stringBuffer.append(true).append(123));
        System.out.println(stringBuffer.delete(4,6));

      System.out.println(stringBuffer.insert(4,false));

        System.out.println(stringBuffer.reverse());

        stringBuffer.setCharAt(0,'a');
        System.out.println(stringBuffer);
    }

    private static String reverse(String origin) {
        StringBuffer stringBuffer =new StringBuffer(origin);
        return stringBuffer.reverse().toString();
    }
}
