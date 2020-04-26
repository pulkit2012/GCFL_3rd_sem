package gcflPr;

import java.util.ArrayList;
import java.util.Scanner;

public class XeniaAndRingRoad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            arr.add(in.nextInt());
        }
        int counter = 0;
        int ans = 1;
       for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) >= ans){
                counter += arr.get(i) - ans;
            }
            else {
                counter += n - ans +  arr.get(i);
            }
            ans = arr.get(i);
        }
        System.out.println(counter);
    }
}
