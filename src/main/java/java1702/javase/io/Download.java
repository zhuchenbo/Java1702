package java1702.javase.io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by xiaozhu
 * on 2017/4/21
 */
public class Download {
//    private static final String IMAGE_URL = "图片网络地址";
//
//    public static void main(String[] args) {
//        try {
//            URL url = new URL(IMAGE_URL);
//            try (
//                    InputStream inputStream = url.openStream();
//                    OutputStream outputStream = new FileOutputStream("新建文件名")
//
//            ) {
//                System.out.println(inputStream, available());
//                int i;
//                while ((i = inputStream.read()) != -1) {
//                    outputStream.write(i);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//    }
private static final String IMAGE_URL = "网络文件地址";

    public static void main(String[] args) {
        try {
            URL url = new URL(IMAGE_URL);
            try (
                    InputStream inputStream = url.openStream();
                    OutputStream outputStream = new FileOutputStream("新建文件名.png")
            ) {
                System.out.println(inputStream.available());
                int i;
                while ((i = inputStream.read()) != -1) {
                    outputStream.write(i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
