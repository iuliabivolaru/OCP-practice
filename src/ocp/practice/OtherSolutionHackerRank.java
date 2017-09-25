package ocp.practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by iuliab on 14.09.2017.
 */
public class OtherSolutionHackerRank {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] result = new int[3];
        if((a0 > b0) || (a0 < b0))
            result[0] = 1;
        if((a1 > b1) || (a1 < b1)) result[1] = 1;
        if((a2 > b2) || (a2 < b2)) result[2] = 1;
        return Arrays.stream(result).filter(a -> a != 0).toArray();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = 1;
        int a1 = 2;
        int a2 = 3;
        int b0 = 0;
        int b1 = 2;
        int b2 = 4;
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
