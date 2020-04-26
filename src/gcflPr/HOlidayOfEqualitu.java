package gcflPr;

import java.util.Arrays;
import java.util.Scanner;

public class HOlidayOfEqualitu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int[] arr = new int[len];
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            total = total + (max - arr[i]);
        }
        System.out.println(total);
    }
}
