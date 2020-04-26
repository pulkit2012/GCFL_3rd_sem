package gcflPr;

import java.util.Scanner;

public class ILoveUsername {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int max = 0;
        int min = 0;
        int amaze = 0;
        for (int i = 0; i < len; i++) {
            int a = in.nextInt();
            if(i == 0){
                max = a;
                min = a;
            }
            else {
                if(a < min){
                    amaze++;
                    min = a;
                }
                else if(a > max) {
                    amaze++;
                    max = a;
                }
            }
        }
        System.out.println(amaze);
    }
}
