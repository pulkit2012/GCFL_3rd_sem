package gcflPr;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistrationSystem {
    static boolean checker(String s,ArrayList<String> arr){
        boolean temp = false;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).equals(s)){
                temp = true;
                break;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        while(len > 0){
            String s = in.nextLine();
            if(checker(s,arr)){
                int i = 1;
                String temp = s;
                while(true){
                    s = s + i;
                    if(!checker(s,arr)){
                        arr.add(s);
                        break;
                    }
                    s = temp;
                    i++;
                }
                System.out.println(s);
            }
            else {
                arr.add(s);
                System.out.println("OK");
            }
            len--;
        }
    }
}