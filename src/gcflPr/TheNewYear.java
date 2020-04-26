package gcflPr;

import java.util.Scanner;

public class TheNewYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();
        int distTravelledbyx1andx2 = Math.abs(x1 - x3) + Math.abs(x2 - x3);
        int distbyx2andx3 = Math.abs(x1 -  x2) + Math.abs(x1 - x3);
        int distbyx1andx3 = Math.abs(x1 - x2) + Math.abs(x3 - x2);
        System.out.println(Math.min(Math.min(distTravelledbyx1andx2,distbyx1andx3),distbyx2andx3));
    }
}
