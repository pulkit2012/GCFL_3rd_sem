package gcflPr;

import java.util.Scanner;

public class YoungPhysist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        while(test > 0){
            int[] arr = new int[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            x += arr[0];
            y += arr[1];
            z += arr[2];
            test--;
        }
        if((x + y + z) == 0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
