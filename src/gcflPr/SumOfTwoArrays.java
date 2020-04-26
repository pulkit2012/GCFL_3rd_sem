package gcflPr;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len1 = in.nextInt();
        in.nextLine();
        int[] arr1 = new int[len1];
        String arr1Str = "";
        for (int i = 0; i < arr1.length; i++) {
           arr1[i] = in.nextInt();
           arr1Str += String.valueOf(arr1[i]);
        }
        int len2 = in.nextInt();
        in.nextLine();
        int[] arr2 = new int[len2];
        String arr2Str = "";
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextInt();
            arr2Str += String.valueOf(arr2[i]);
        }
        String ans = String.valueOf(Integer.parseInt(arr1Str) + Integer.parseInt(arr2Str));
        if(ans.length() > Math.max(len1,len2)){
            for (int i = 0; i < ans.length(); i++) {
                System.out.print(ans.charAt(i) + " ");
            }
        }
        else {
            ans = "0" + ans;
            for (int i = 0; i < ans.length(); i++) {
                System.out.print(ans.charAt(i) + " ");
            }
        }
    }
}
