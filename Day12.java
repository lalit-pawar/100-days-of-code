import java.util.Scanner;

public class Day12 {

    public static void main(String[] args) {
        // To calculate sum of digits in a given number //
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your input ");

        int num = input.nextInt();

        int sum = 0;
        for(sum=0; num!=0; num=num/10)   {

            sum = sum+num%10;

        }
        System.out.println(sum);
    }
}
