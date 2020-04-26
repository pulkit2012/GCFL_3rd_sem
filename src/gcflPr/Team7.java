package gcflPr;

import java.util.Scanner;

public class Team7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int globalCounter = 0;
        while(a > 0){
            int[] arr = new int[3];
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
                if(arr[i] == 1){
                    temp++;
                }
            }
            if(temp >= 2){
                globalCounter++;
            }
            a--;
        }
        System.out.println(globalCounter);
    }
}
