import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {

        // To calculate factorial of a given number //

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your number ");

         int num = input.nextInt();
         int factorial = 1;

         if(num<0) {
            System.out.println(" Invalid input ");

        }
         else{
            for ( int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println(" the factorial of given no is factorial " + factorial);
        }
    }
}
