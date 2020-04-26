package gcflPr;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArrayRotation4 {
    static int[] rotator(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length -1] = temp;
        return arr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        int[] arr = new int[len];
        int[] arr2 = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2);
        int k = 0;
        while (true){
            if(Arrays.equals(arr2, arr)){
                break;
            }
            else {
                rotator(arr);
                k++;
            }
        }
        System.out.println(k);
    }
}
