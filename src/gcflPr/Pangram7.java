package gcflPr;

import java.util.Scanner;
import java.util.TreeSet;

public class Pangram7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        String checker = "abcdefghijklmnopqrstuvwxyz";
        String a = in.nextLine();
        a = a.toLowerCase();
        if(len < 26){
            System.out.println("NO");
        }
        else {
            TreeSet<Character> set = new TreeSet<>();
            for (int i = 0; i < a.length(); i++) {
                set.add(a.charAt(i));
            }
            String test = "";
            for(char c : set){
                test = test + c;
            }
            if(checker.compareToIgnoreCase(test) == 0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
