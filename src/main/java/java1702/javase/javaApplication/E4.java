package java1702.javase.javaApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xiaozhu
 * on 2017/4/15
 */
public class E4 {
    public static void main(String[] args){
        E4 text=new E4();
        String result=text.getMinString("abbccd");
        System.out.println(result);
    }
    public String getMinString(String input){
        System.out.println("原字符串--->"+input);
        char[] c=input.toCharArray();
        List<String> list=new ArrayList<String>();
        for(int i=0;i<c.length;i++)
            list.add(c[i]+"");
        //求出字母出现的最小次数（不能对list排序，会影响最后输出结果）
        int minTime=0;
        int[] count=new int[list.size()];
        for(int i=0;i<count.length;i++)
            count[i]=0;

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(list.get(i).equals(list.get(j)))
                    count[i]++;
            }
            minTime=count[1];//把第一个字母出现的次数初始为最小次数。!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!此题关键！！！
            if(minTime>=count[i])
                minTime=count[i];
        }
        System.out.println("每个下标的字母对应的出现次数---->"+ Arrays.toString(count));
        System.out.println("字母出现的最小次数---->"+minTime);

        StringBuffer sb=new StringBuffer();
        for(int i=0;i<count.length;i++){
            if(count[i]>minTime)
                sb.append(list.get(i));
        }
        return  sb.toString();

    }

}
