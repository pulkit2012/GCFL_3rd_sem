package gcflPr;

import java.util.Scanner;

public class wordCapitalization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine().trim();
        String ans = String.valueOf(a.charAt(0)).toUpperCase();
        for (int i = 1; i < a.length(); i++) {
            ans += a.charAt(i);
        }
        System.out.println(ans);
    }
}
