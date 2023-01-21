package Java100daysofcode;

import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int N = input.nextInt();
        int B = input.nextInt();


        for (int i = 1; i < N; i++) {

            int Wi = input.nextInt();
            int Hi = input.nextInt();
            int Pi = input.nextInt();

            if (Pi < B) {
                System.out.println(Wi * Hi);
            } else {
                System.out.println("NO tablet");
            }
        }

    }
}
