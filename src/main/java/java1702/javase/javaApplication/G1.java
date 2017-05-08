package java1702.javase.javaApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by xiaozhu
 * on 2017/5/6
 */
//利用 switch 语句将学生成绩分级,
// 当从键盘中输入学生成绩在 100~90 范围时,
// 输出“优 秀”,
// 在 89~80 范围时输出“良好”,
// 在 79~70 范围时输出“中等”,
// 在 69~60 范围时输出 “及格”,
// 在 59~0 范围时输出“不及格”,
// 在其他范围时输出“成绩输入有误!”。
public class G1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int score, k;
        score = Integer.parseInt(br.readLine());
        if (score > 100 || score < 0) {
            System.out.println("输入成绩超出范围！");
            System.exit(1);
        }
        k = score / 10;
        switch (k) {
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
                System.out.println("中等");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
    }
}

