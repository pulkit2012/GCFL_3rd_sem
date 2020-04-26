package gcflPr;

import java.util.Scanner;

public class ZeroesAndStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int length = a * 2 + 1;
        int subtractor = 1;
        for (int i = 0; i < a; i++) {
            String ans = "";
            for (int i1 = 1; i1 <= length; i1++) {
                if (i1 == subtractor || i1 == (length / 2) + 1 || i1 == (length - subtractor) + 1) {
                    ans = ans + "*";
                } else {
                    ans = ans + "0";
                }
            }
            System.out.println(ans);
            subtractor++;
        }
    }
}