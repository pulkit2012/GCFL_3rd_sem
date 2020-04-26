package gcflPr;

import java.util.Scanner;

public class TheatreSquare8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int b = in.nextInt();
        int a = in.nextInt();
        int valueOfBlocks = 0;
        int nb = 0;
        int nl = 0;
        if(b <= a) {
            if(l <= a){
                valueOfBlocks = 1;
            }
            else {
                if(l % a == 0){
                    valueOfBlocks = l / a;
                }
                else {
                    valueOfBlocks = (l / a) + 1;
                }
            }
        }
        else {
            if(l <= a){
                if(b % a == 0){
                    valueOfBlocks = b / a;
                }
                else {
                    valueOfBlocks = (b / a) + 1;
                }
            }
            else {
                if(l % a == 0){
                    nl = l / a;
                }
                else {
                    nl = (l / a) + 1;
                }
                if(b % a == 0){
                    nb = b / a;
                }
                else {
                    nb = (b / a) + 1;
                }
                valueOfBlocks = nb * nl;
            }
        }
        System.out.println(valueOfBlocks);
    }
}
