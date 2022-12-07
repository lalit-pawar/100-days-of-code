import java.util.Scanner;

public class Day11 {

    public static void main(String[] args) {

        //to calculate Fibonacci series upto n //

        // The Fibonacci series is a series where the next term is the sum of the previous two terms.
        //  The first two terms of the Fibonacci sequence are 0 followed by 1.

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your input ");
        int num= input.nextInt();

        int a=0;
        int b=1;
        int c=0;
        while(c<=num)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println("Fibonacci series upto "+num+" is - ");
    }
}
