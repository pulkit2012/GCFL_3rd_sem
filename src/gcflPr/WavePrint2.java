package gcflPr;

import java.util.Scanner;

public class WavePrint2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < m; i1++) {
                arr[i][i1] = in.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            if(i % 2 == 0){
                for (int i1 = 0; i1 < n; i1++) {
                    System.out.print(arr[i1][i] + " ");
                }
            }
            else {
                for (int i1 = n - 1; i1 >= 0; i1--) {
                    System.out.print(arr[i1][i] + " ");
                }
            }
        }
    }
}
