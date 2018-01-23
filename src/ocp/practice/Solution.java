//package ocp.practice;
//
///**
// * Created by iuliab on 14.09.2017.
// */
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//import java.util.stream.Collectors;
//
//public class Solution {
//
//    static int simpleArraySum(int n, int[] ar) {
//        return Arrays.stream(ar).sum();
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] ar = new int[n];
//        for(int ar_i = 0; ar_i < n; ar_i++){
//            ar[ar_i] = in.nextInt();
//        }
//        int result = simpleArraySum(n, ar);
//        System.out.println(result);
//    }
//}
package ocp.practice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void insertionSort1(int n, int[] arr) {
        int unsortedEl = arr[n-1];
        boolean elementPlaced = false;
        for(int i = n-2; i >= 0; i--) {
            if(unsortedEl <= arr[i]) {
                arr[i + 1] = arr[i];
                for(int j = 0; j < n; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            } else {
                arr[i+1] = unsortedEl;
                elementPlaced = true;
                for(int j = 0; j < n; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
                break;
            }
        }
        if(!elementPlaced) {
            arr[0] = unsortedEl;
            for(int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        in.close();
    }
}

