package gcflPr;

import java.util.Scanner;

public class CompressTheString {
    static int[] compresser(String input,char ch,int index){
        int[] arr = new int[2];
        for (int i = index; i < input.length()-1; i++) {
            if(input.charAt(i) == input.charAt(i + 1)){
                arr[0]++;
                arr[1] = i + 1;
            }
            else {
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().trim();
        int i = 0;
        String ans = "";
        while(true){
            if(i > input.length() -1){
                break;
            }
            ans = ans + input.charAt(i);
            if((compresser(input,input.charAt(i),i)[0] + 1) != 1){
                ans += String.valueOf(compresser(input,input.charAt(i),i)[0] + 1);
            }
            if(i == input.length() -1){
                break;
            }
            i = compresser(input,input.charAt(i),i)[1] + 1;
        }
        System.out.println(ans);
    }
}
