package gcflPr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class PairSum2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int[] arr = new int[len];
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
            arr2.add(arr[i]);
        }
        int X = in.nextInt();
        ArrayList<String> ansString = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            String s = "";
            for (int i1 = 0; i1 < arr2.size(); i1++) {
                if(arr[i] + arr2.get(i1) == X && i != i1){
                    s = s + String.valueOf(Math.min(arr[i],arr2.get(i1))) + String.valueOf(Math.max(arr[i],arr2.get(i1)));
                    set.add(s);
                    break;
                }
            }
        }
        ansString.addAll(set);
        Collections.sort(ansString);
        if(ansString.size() == 0){
            System.out.println(-1);
        }
        else {
            for(String c : ansString){
                System.out.println(c.charAt(0) + " " + c.charAt(1));
            }
        }
    }
}
