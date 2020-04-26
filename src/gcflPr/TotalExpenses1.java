package gcflPr;

import java.util.Scanner;

public class TotalExpenses1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while(test > 0){
            double exp = 0.0;
            double quan = in.nextDouble();
            double price = in.nextDouble();
            if(quan > 1000){
                exp = (quan * price) - ((quan * price) * 10)/100;
            }
            else {
                exp = (quan * price);
            }
            System.out.printf("%.6f",exp);
            System.out.println();
            test--;
        }
    }
}
