package gcflPr;

import java.util.Scanner;

public class DominoPilinh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int b = in.nextInt();
        in.nextLine();
        int area = l * b;
        System.out.println(area/2);
    }
}
