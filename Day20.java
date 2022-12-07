package Java100daysofcode;

import java.util.Scanner;

public class Day20 {

    // TO check whether given no is prime or not //
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your number ");
        int num = input.nextInt();
        boolean flag=false;

         if(num==0 || num==1){
             System.out.println(" not aq prime number ");
         }

        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                flag=true;
                break;
            }
        }
        if(!flag){

            System.out.println(" it is a prime number ");
        }
        else{
            System.out.println(" it is not a prime number ");
        }

    }

}