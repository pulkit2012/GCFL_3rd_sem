package gcflPr;

import java.util.Scanner;

public class VesyaSocks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int socks = in.nextInt();
        int day = in.nextInt();
        int days = 0;
        while (true){
            if(socks <= 0){
                break;
            }
            else {
                days++;
                socks--;
                if(days % day == 0){
                    socks++;
                }
            }
        }
        System.out.println(days);
    }
}
