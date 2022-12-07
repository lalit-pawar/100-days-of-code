import java.util.Scanner;

public class Day13 {

    public static void main(String[] args) {

        // To calculate sum of n natural numbers. //

        Scanner input= new Scanner(System.in);
        System.out.println(" Enter your input ");
        int num= input.nextInt();
           int sum = 0;

        for(int i = 1; i < num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
