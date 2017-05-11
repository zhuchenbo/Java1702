package realestate.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by xiaozhu
 * on 2017/5/9
 */
public class Analytics {
    private static final String[] AREA_FILE = {
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

    private static int counter;
    public static void main(String[] args) {
        for (String areaFileName : AREA_FILE) {
            getData(areaFileName);
        }
        System.out.println(counter);
    }

    private static void getData(String areaFileName) {
        List<Integer> totalPriceList = new ArrayList<>();
        List<Integer> unitPriceList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("data/" + areaFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
//                String[] strings = line.split("@");
//                int totalPrice = Integer.parseInt(strings[2]);
//                totalPriceList.add(totalPrice);
//                int unitPrice = Integer.parseInt(strings[3]);
//                unitPriceList.add(unitPrice);
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(totalPriceList);
        Collections.sort(unitPriceList);

        System.out.println("---------------");
//        System.out.println(totalPriceList.get(0));
//        System.out.println(totalPriceList.get(totalPriceList.size() - 1));
//        System.out.println(totalPriceList.stream().mapToInt(Integer::intValue).sum() / totalPriceList.size());
//
//        System.out.println(unitPriceList.get(0));
//        System.out.println(unitPriceList.get(unitPriceList.size() - 1));
//        System.out.println(unitPriceList.stream().mapToInt(Integer::intValue).sum() / unitPriceList.size());
    }
}
