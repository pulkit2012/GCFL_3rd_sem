package gcflPr;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int check = 0;
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int i1 = 0; i1 < c; i1++) {
                if(i % 2 == 0){
                    System.out.print("#");
                }
                else {
                    if (check % 2 == 0) {
                        if (i1 == c - 1) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    } else {
                        if (i1 == 0) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    }
                    if (i1 == c - 1) {
                        check++;
                    }
                }
            }
            System.out.println();
        }
    }
}
