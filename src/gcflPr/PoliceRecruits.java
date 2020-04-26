package gcflPr;

import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int available = 0;
        int untreated = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == -1){
                if(available == 0){
                    untreated++;
                }
                else {
                    available--;
                }
            }
            else if(arr[i] > 0) {
                available = available + arr[i];
            }
        }
        System.out.println(untreated);
    }
}
