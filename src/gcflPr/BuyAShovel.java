package gcflPr;

import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int r = in.nextInt();
        int j = 1;
        while(true){
            if((k * j) % 10 == 0){
                break;
            }
            else if((k * j) % 10 == r){
                break;
            }
            else {
                j++;
            }
        }
        System.out.println(j);
    }
}
