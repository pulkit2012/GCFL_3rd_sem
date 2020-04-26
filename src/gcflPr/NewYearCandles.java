package gcflPr;

import java.util.Scanner;

public class NewYearCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int candles = in.nextInt();
        int remakeAfter = in.nextInt();
        int hours = 0;
        hours = hours + candles;
        int remaining = candles;
        while (true) {
                candles = remaining / remakeAfter;
                hours = hours + candles;
                remaining = remaining % remakeAfter + candles;
                if (remaining < remakeAfter) {
                    break;
                }
            }
            System.out.println(hours);
        }
    }

