package java1702.javase.javaApplication;

import java.util.Scanner;

/**
 * Created by xiaozhu
 * on 2017/4/1
 */
public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        result = sc.nextLine();
        System.out.println("输入："+result);
        while(!"".equals(result)){
            char a = result.charAt(0);
            String first = result.substring(0,1);
            System.out.print(first+"("+getCount(result,a)+") ");
            result = result.replaceAll(first,"");
        }
    }

    public static int getCount(String str,char a){
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == a){
                count++;
            }
        }
        return count;
    }
}
