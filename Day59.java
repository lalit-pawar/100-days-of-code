package Java100daysofcode;
import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        int t;
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        int M[][] = new int[t][2];

        for (int i = 0; i < t; i++) {
            M[i][0] = input.nextInt();
            M[i][1] = input.nextInt();
        }
        for (int i =0; i<t;i++) {

            int BMI = (M[i][0] / (M[i][1] * M[i][1]));
            if (BMI <= 18) {
                System.out.println("1");
            } else if (BMI >= 18 && BMI < 25) {

                System.out.println("2");
            } else if (BMI > 25 && BMI < 30) {

                System.out.println("3");
            } else if (BMI >= 30) {
                System.out.println("4");
            }
        }
    }
}
