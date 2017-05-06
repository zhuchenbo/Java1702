package java1702.javase.house;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by xiaozhu
 * on 2017/5/6
 */
public class Data {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("data/dongcheng"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(list);
        System.out.println("min: " + list.get(0));
        System.out.println("max: " + list.get(list.size() - 1));
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println("avg: " + sum / list.size());
    }
}
