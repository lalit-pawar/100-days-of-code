package Java100daysofcode;

import java.util.Scanner;

public class Day21 {

    public static void main(String[] args) {
         // to check whether the given number is palindrome or not //
        // A number is said to be palindrome if it is same after traversing in reverse order.
        // Eg . 121 is same after reversing it.
        Scanner input=new Scanner(System.in);
        System.out.println( "enter your number ");
        int num= input.nextInt();
        int x=num;
        int a,pal=0;

        while(num>0){
             a= num%10;
              pal= (pal*10)+a;
              num=num/10;

        }
        if(x==pal){
            System.out.println(" It is a palindrome ");
        }
        else{
            System.out.println("It is not a palindrome ");
        }

    }
}
