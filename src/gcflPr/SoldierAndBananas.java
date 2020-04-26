package gcflPr;

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        int cost = 0;
        for (int i = 1; i <= w; i++) {
            cost += k*i;
        }
        if(cost <= n){
            System.out.println(0);
        }
        else {
            System.out.println(cost - n);
        }
    }
}
