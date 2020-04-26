package gcflPr;

import java.util.Scanner;

public class WizardsAndDem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int population = in.nextInt();
        int wizards = in.nextInt();
        float percentage = in.nextFloat();
        float amountTobeReq = (percentage / 100) * population;
        if (amountTobeReq - wizards < 0) {
            System.out.println(0);
        } else {
            System.out.println((int) Math.ceil(amountTobeReq - wizards));
        }
    }
}
