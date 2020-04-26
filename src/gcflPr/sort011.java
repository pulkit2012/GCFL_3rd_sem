package gcflPr;

import java.util.Scanner;

public class sort011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int counter = 0;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
            if(arr[i] == 0){
                counter++;
            }
        }
        while(len > 0){
            if(counter > 0){
                System.out.print(0 + " ");
            counter--;
            len--;
            }
            else {
                System.out.print(1 + " ");
            len--;
            }

        }
    }
}
