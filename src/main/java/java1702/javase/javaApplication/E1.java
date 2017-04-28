package java1702.javase.javaApplication;

/**
 * Created by xiaozhu
 * on 2017/4/15
 */
public class E1 {
    public static void main(String[] args) {
//        String s1 = "1,3,5";
//        int len1 = 3;
//        String s2 = "2,4,1,7,5";
//        int len2 = 5;
//
//        int diffNum= getDiffNum(s1,len1,s2,len2);
//        System.out.println("输出："+diffNum);
//    }
//    public static int getDiffNum(String s1,int len1,String s2,int len2){
//        String[] str1=s1.split(",");
//        String[] str2=s2.split(",");
//        int len=len1>len2? len2:len1;
//        int count=0;
//        for(int i=0;i<len;i++){
//            if(!str1[len1-1-i].equals(str2[len2-1-i]))
//                count++;
//        }
//        return count;
//    }
        String s1 = "1,3,5";
        String s2 = "2,4,1,7,5";

        int length1 = s1.length();
        int length2 = s2.length();

        if (s1.length() > s2.length()) {
            String tmep = s2;
            s2 = s1;
            s1 = tmep;
        }

    }
}