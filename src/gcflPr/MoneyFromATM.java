package gcflPr;

import java.util.Scanner;

public class MoneyFromATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double withdraw = in.nextDouble();
        double balance = in.nextDouble();
        if(withdraw % 5 != 0){
            System.out.printf("%.2f",balance);
        }
        else {
            if(withdraw + 0.50 > balance){
                System.out.printf("%.2f",balance);
            }
            else {
                System.out.printf("%.2f",balance - (withdraw + 0.50));
            }
        }
    }
}
