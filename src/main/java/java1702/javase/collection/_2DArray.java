package java1702.javase.collection;

import sun.misc.PostVMInitHook;

import javax.sound.midi.Soundbank;

/**
 * Created by xiaozhu
 * on 2017/3/28
 */
public class _2DArray {
    public static void main(String[] args) {
        int[][] ints = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(ints[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
