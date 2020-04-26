package gcflPr;

import java.util.Scanner;
import java.util.TreeSet;

public class HorseShoeHoof {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < 4; i++) {
            set.add(in.nextInt());
        }
        System.out.println(4 - set.size());
    }
}
