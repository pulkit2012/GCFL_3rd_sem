package gcflPr;

import java.util.Scanner;

public class NumberStarPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int checker = 1;
        for (int i = 0; i < a; i++) {
            String ans = "";
            for (int i1 = a; i1 >= 1; i1--) {
                if (i1 == checker) {
                    ans = ans + "*";
                }
                else {
                    ans += String.valueOf(i1);
                }
            }
            checker++;
            System.out.println(ans);
        }
    }
}