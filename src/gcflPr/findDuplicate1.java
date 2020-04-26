package gcflPr;

import java.util.Scanner;

public class findDuplicate1 {
    static boolean dupliFinder(int[] arr,int element,int index){
        boolean temp = false;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element && i != index){
                counter++;
            }
            if(counter >= 1){
                temp = true;
                break;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(dupliFinder(arr,arr[i],i)){
                ans = arr[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
