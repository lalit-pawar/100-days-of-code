package Java100daysofcode;

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        // to check the given no is positive or negative
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter your number" );
        int a= input.nextInt();
        if(a>0){
            System.out.println(" The given no is positive ");
        }
        else if (a<0) {
            System.out.println(" The  given no is negative ");
        }          else{
            System.out.println("The no is neither positive nor negative ");
        }

    }
}
