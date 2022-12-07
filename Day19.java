package Java100daysofcode;

import java.util.Scanner;

public class Day19 {

    //to find whether the given number is armstrong number or not //

    // function to calculate power
    static int power(int x, int y)
    {
        if (y == 0)
            return 1;
        else if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        else
            return x * power(x, y / 2) * power(x, y / 2);
    }

     // function to calculate no of digits in a number
    public static int digits(int num)
    {
        int n = 0;
        while (num != 0) {
            n++;
            num = num / 10;
        }
        return n;
    }
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number ");
         int num =input.nextInt();
         int a = num;
         int sum=0;
         int or= digits(num);

            while (num != 0) {

                int r = num % 10;
               sum = sum + power(r,or);
                num = num / 10;

            }
            if (sum == a) {

                System.out.println("  it is an armstrong number ");
            } else {
                System.out.println(" It is not an armstrong number ");
            }


        }

    }
