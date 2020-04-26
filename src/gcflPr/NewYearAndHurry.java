package gcflPr;

import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int remaining = 240 - k;
        int i = 0;
        for (i = 1; i <= n; i++) {
            remaining = remaining - (i * 5);
            if(remaining < 0){
                break;
            }
        }
        System.out.println(i - 1);
    }
}
