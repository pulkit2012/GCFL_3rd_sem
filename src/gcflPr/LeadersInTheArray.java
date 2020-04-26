package gcflPr;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersInTheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        int counter = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = i + 1; i1 < arr.length; i1++) {
                if(arr[i] <= arr[i1]){
                    break;
                }
                else {
                    counter++;
                }
            }
            if(counter == (len -1) - i){
                ans.add(arr[i]);
            }
            counter = 0;
        }
        for (int i : ans){
            System.out.print(i + " ");
        }
    }
}
