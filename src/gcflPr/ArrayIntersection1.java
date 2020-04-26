package gcflPr;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayIntersection1 {
    static boolean finder(ArrayList<Integer> arr2,int element){
        boolean temp = false;
        for (int i = 0; i < arr2.size(); i++) {
            if(arr2.get(i) == element){
                arr2.remove(i);
                temp = true;
                break;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len1 = in.nextInt();
        in.nextLine();
        int[] arr1 = new int[len1];
        for (int i = 0; i < len1; i++) {
            arr1[i] = in.nextInt();
        }
        int len2 = in.nextInt();
        in.nextLine();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < len2; i++) {
            arr2.add(in.nextInt());
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if(finder(arr2,arr1[i])){
                ans.add(arr1[i]);
            }
        }
        if(ans.size() == 0){
            System.out.println(-1);
        }
        else {
            for(Integer c : ans){
                System.out.println(c);
            }
        }
    }
}
