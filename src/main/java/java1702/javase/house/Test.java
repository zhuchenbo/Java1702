package java1702.javase.house;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xiaozhu
 * on 2017/5/6
 */
public class Test {
    private static final String[] AREA = {
            "dongcheng",
            "xicheng",
            "chaoyang",
            "haidian",
            "fengtai",
            "shijingshan",
            "tongzhou",
            "changping",
            "daxing",
            "yizhuangkaifaqu",
            "shunyi",
            "fangshan",
            "mentougou",
            "pinggu",
//            "huairou",
            "miyun",
            "yanqing",
            "yanjiao"
    };
    private static final int[] PAGES = {
            35,
            35,
            100,
            100,
            67,
            21,
            46,
            94,
            42,
            6,
            29,
            17,
            14,
            1,
//            0,
            1,
            1,
            100
    };

    private static final String DONGCHENG_URL = "http://bj.lianjia.com/ershoufang/";
    private static final String IMAGE_REGEXP = "<div class=\"totalPrice\"><span>(\\d+)</span>";
    private static int counter;

    public static void main(String[] args) {
        for (int i = 0; i < AREA.length; i++) {
            counter = 0;
            System.out.println("area:" + AREA[i]);
            for (int j = 0; j < PAGES[i]; j++) {
                System.out.println("\t page: " + (j + 1));
                try {
                    getPage(j + 1, AREA[i]);
                    Thread.sleep((int)Math.random()*5000);
                } catch (MalformedURLException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(3000 * 60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void getPage(int page, String area) throws MalformedURLException {
        URL url = new URL(DONGCHENG_URL + area + "/pg" + page);
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/" + area, true))
        ) {

            String line;
            Pattern pattern = Pattern.compile(IMAGE_REGEXP);
            Matcher matcher;
            while ((line = bufferedReader.readLine()) != null) {
                matcher = pattern.matcher(line);
                while (matcher.find()) {
                    bufferedWriter.append(matcher.group(1) + "\n");
                    System.out.println("\t\t counter: " + (++counter));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
