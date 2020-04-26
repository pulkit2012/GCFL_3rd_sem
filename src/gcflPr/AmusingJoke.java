package gcflPr;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class AmusingJoke {
    static int counter(char c, String s) {
        int counts = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                counts++;
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a1 = in.nextLine();
        String a2 = in.nextLine();
        String finalStr = a1 + a2;
        String a3 = in.nextLine();
        TreeSet<Character> set = new TreeSet<>();
        TreeSet<Character> set1 = new TreeSet<>();
        for (int i = 0; i < finalStr.length(); i++) {
            set.add(finalStr.charAt(i));
        }
        for (int i = 0; i < a3.length(); i++) {
            set1.add(a3.charAt(i));
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (char c : set) {
            arr.add(counter(c, finalStr));
        }
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (char c : set1) {
            arr1.add(counter(c, a3));
        }
        if (set.equals(set1) && arr.equals(arr1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}