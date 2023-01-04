package Java100daysofcode;

import java.util.Scanner;

public class Day22 {

     // TO get the given number as addition of two prime numbers //
    static int primesum(int n)
    {
        int i, prime = 1;
        for(i = 2; i <= n/2; ++i)
        {
            if(n % i == 0)
            {
                prime = 0;
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            int flag = 0;
            for(int i = 2; i <= num/2; ++i)
            {
                if(primesum(i) == 1)
                {
                    if(primesum(num-i) == 1)
                    {
                        System.out.println(num+" can be expressed as the sum of "+i+" and "+(num-i));

                            flag = 1;
                    }
                }
            }
            if(flag == 0)
                System.out.println(num+" cannot be expressed as the sum of two primes");
    }

}
