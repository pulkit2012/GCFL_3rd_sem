package gcflPr;

import java.util.Scanner;

public class VesyaHipster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int red = in.nextInt();
        int blue = in.nextInt();
        System.out.print(Math.min(red,blue) + " ");
        int remaining = Math.max(red,blue) - Math.min(red,blue);
        System.out.print(remaining / 2);
    }
}
