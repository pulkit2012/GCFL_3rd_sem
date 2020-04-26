package gcflPr;

import java.util.Scanner;

public class FindUnique {
    static boolean UniqueChecker(int[] arr,int element){
        int counter = 0;
        boolean temp = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                counter++;
            }
        }
        if(counter == 1){
            temp = true;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(UniqueChecker(arr,arr[i])){
                ans = arr[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
