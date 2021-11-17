import java.io.*;
import java.util.*;

public class First_Index_Of_Occurence_In_Array_Using_Recursion_1 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int fi = firstIndex(arr, 0, d);
        System.out.println(fi);
    }

    public static int firstIndex(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        int fiisa = firstIndex(arr, idx + 1, x);
        if (arr[idx] == x) {
            return idx;
        } else {
            return fiisa;
        }
    }
}
