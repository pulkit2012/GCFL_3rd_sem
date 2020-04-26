package gcflPr;

import java.util.Scanner;

public class CheapTravel4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        if(m * a > b){
            int remainingCost = (n % m) * a;
            if(remainingCost > b){
                System.out.println((n / m) * b + b);
            }
            else {
                System.out.println((n / m) * b + remainingCost);
            }
        }
        else {
            System.out.println(n * a);
        }
    }
}
