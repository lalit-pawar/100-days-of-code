package Java100daysofcode;
import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            int n = input.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += input.nextInt();
            }
            if (sum % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
