package gcflPr;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Dragons1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        in.nextLine();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        while(n > 0){
            int pow = in.nextInt();
            int bon = in.nextInt();
            in.nextLine();
            map.put(pow,bon);
            n--;
        }
        ArrayList<Integer> power = new ArrayList<>(map.keySet());
        ArrayList<Integer> bonus = new ArrayList<>(map.values());
        int i = 0;
        for (i = 0; i < power.size(); i++) {
            if(s <= power.get(i)){
                break;
            }
            else {
                s = s + bonus.get(i);
            }
        }
        if(i -1 == power.size()-1){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
