import java.util.Scanner;

public class Day14 {

    public static void main(String[] args) {

        // To Reversed a given number using for loop     //

        Scanner input= new Scanner(System.in);
        System.out.println(" Enter the Number ");
        int num= input.nextInt();
          int reversed=0;

        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println(" The Reversed Number is " +reversed);
    }
}
