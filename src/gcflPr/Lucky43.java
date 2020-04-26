package gcflPr;

import java.util.Scanner;

public class Lucky43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while(test > 0){
            int temp = 0;
            String input = in.nextLine().trim();
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == '4'){
                    temp++;
                }
            }
            System.out.println(temp);
            test--;
        }
    }
}
