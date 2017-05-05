package java1702.javase.javaApplication;

/**
 * Created by xiaozhu
 * on 2017/4/15
 */
public class E5 {
    public static void main(String[] args) {
        double d=-23.234;

        System.out.println(getValue(d) );
    }
    private static int getValue(double d){
        if(!String.valueOf(d).contains(".")){
            return (int)d;
        }
        String[] ss=String.valueOf(d).split("\\.");

        if(Integer.valueOf(ss[1].substring(0, 1)) <5){
            return (int)Math.floor(d);// 取接近它的比它小的浮点数xx.0000  
        }
        else{
            return (int)Math.ceil(d);//取接近它的比它大的浮点数(int)xxxx.00000
        }

    }

}
