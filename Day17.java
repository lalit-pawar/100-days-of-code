import java.util.Scanner;

public class Day17 {

    public static void main(String[] args) {

         // TO get factors of a given number.
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your number ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {

                System.out.println(i + " ");
            }
        }
    }
}