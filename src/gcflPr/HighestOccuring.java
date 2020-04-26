package gcflPr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class HighestOccuring {
    static int counter(String input,char ch){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().trim();
        TreeSet<Character> set = new TreeSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            set.add(input.charAt(i));
        }
        int max = 0;
        for(char c: set){
            arrayList.add(counter(input,c));
            if(max < counter(input,c)){
                max = counter(input,c);
            }
        }
        ArrayList<Character> faltu = new ArrayList<>(set);
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) == max){
                index.add(i);
            }
        }
        ArrayList<Integer> finaAe = new ArrayList<>();
        for (int i = 0; i < index.size(); i++) {
            finaAe.add(input.indexOf(faltu.get(index.get(i))));
        }
        Collections.sort(finaAe);
        System.out.println(input.charAt(finaAe.get(0)));
    }
}
