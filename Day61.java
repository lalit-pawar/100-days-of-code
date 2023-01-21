package Java100daysofcode;

import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        int t;
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        int a[] = new int[t];
        int b[] = new int[t];

        for (int i = 0; i < t; i++) {

            a[i]= input.nextInt();
            b[i]=input.nextInt();


        }

        for (int i = 0; i < t; i++) {
            int sum = a[i] + b[i];

            if (sum < 3) {
                System.out.println(" 1 ");
            } else if (3 < sum && sum < 10) {

                System.out.println(" 2 ");
            } else if (11 < sum && sum < 60) {
                System.out.println(" 3 ");
            } else if (60 <= sum) {
                System.out.println(" 4 ");
            }

        }

    }

}

