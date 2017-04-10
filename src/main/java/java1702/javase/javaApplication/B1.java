package java1702.javase.javaApplication;

/**
 * Created by xiaozhu
 * on 2017/4/8
 */
//接受用户输入的一个字符串，将其每个字节的数据相加求和输出
public class B1 {
    public static void main(String[] args) {
        String str = "acb";
        int sum = 0;
        byte[] a = str.getBytes();
        for (int i = 0; i < a.length; i++) {
            byte num = a[i];
            sum += num;
        }
        System.out.println(sum);
    }


}


