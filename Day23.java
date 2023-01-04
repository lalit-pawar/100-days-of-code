package Java100daysofcode;

import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {

        // Write a program to Replace all 0’s with 1 in a given integer

        Scanner input= new Scanner(System.in);
        System.out.println(" Enter your number ");
        int num= input.nextInt();
        int digit=0;

        // tO replace the 0's with 1's.
        while(num!=0){
            int n=num%10;
            num= num/10;
            if(n==0)
                n=1;
                digit= digit*10+ n;
        }
        // To get the reverse of digit .
        while(digit!=0){
            int x= digit%10;

            num= num*10+x;
            digit /=10;
        }

        System.out.println( " The number after changing the 0's with 1's :  " + num);

        }

}
