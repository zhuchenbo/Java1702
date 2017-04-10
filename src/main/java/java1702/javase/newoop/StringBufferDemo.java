package java1702.javase.newoop;

/**
 * Created by xiaozhu
 * on 2017/4/8
 */
//字符串缓冲区
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append(" world");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.delete(5,6));
        System.out.println(stringBuffer.insert(5,","));
        System.out.println(stringBuffer.reverse());
        stringBuffer.reverse().setCharAt(6,'W');
        System.out.println(stringBuffer);
    }
}
//append
//delete
// insert  插入
// reverse
//setCharAt  改变字符

