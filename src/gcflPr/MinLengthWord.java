package gcflPr;

import java.util.Scanner;

public class MinLengthWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().trim().split(" ");
        int minLen =  arr[0].length();
        String min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].length() < minLen){
                minLen = arr[i].length();
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
