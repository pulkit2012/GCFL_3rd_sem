package gcflPr;

import java.util.Scanner;

public class Tprimes {
    static boolean tprimeChecker(int a){
        boolean temp = true;
        int counter = 0;
        for (int i = 1; i <= a; i++) {
            if(a % i == 0){
                counter++;
            }
            if(counter > 3){
                temp = false;
                break;
            }
        }
        if(counter == 3){
            temp = true;
        }
        else {
            temp = false;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        for (int i = 0; i < len; i++) {
            int a = in.nextInt();
            if(tprimeChecker(a)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
