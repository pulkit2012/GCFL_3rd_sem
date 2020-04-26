package gcflPr;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().trim();
        String s2 = "";
        for (int i = s.length() -1; i >= 0; i--) {
            s2 = s2 + s.charAt(i);
        }
        System.out.println(s.equals(s2));
    }
}
