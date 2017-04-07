package java1702.javase.javaApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by xiaozhu
 * on 2017/4/1
 */
// 从键盘上输入一个字符串
// 利用字符串类的方法将大写字母转变为小写字母
// 小写字母转变为大写字母，再将前后字符对换,然后输出最后结果。
public class A2{
        public static void main(String args[]) throws IOException {
            InputStreamReader isr= new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            StringBuffer strb = new StringBuffer(br.readLine());
            int i;
            for(i=0; i<strb.length(); i++){
                char ch = strb.charAt(i);
                if(ch<='Z' && ch>='A')
                    strb.setCharAt(i,(char)(ch+32));
                if(ch<='z' && ch>='a')
                    strb.setCharAt(i,(char)(ch-32));
            }
            strb.reverse();
            System.out.println(strb);
        }
}
