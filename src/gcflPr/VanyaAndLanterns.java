package gcflPr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class VanyaAndLanterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int l = in.nextInt();
        in.nextLine();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        ArrayList<Integer> arrHelp = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            arrHelp.add(Math.abs(arr[i] - arr[i + 1]));
        }
        Collections.sort(arrHelp);
        double maxGap = (double)arrHelp.get(arrHelp.size() -1) / 2;
        System.out.printf("%.20f",maxGap);
    }
}
