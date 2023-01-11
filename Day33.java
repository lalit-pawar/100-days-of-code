package Java100daysofcode;

import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {

        //  Program to check if String is a palindrome or not.
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter your string ");
         String str= input.nextLine();
         String temp = "";

         for (int i = str.length() - 1; i >= 0; i--) {
            temp = temp + str.charAt(i);
        }
        if (str.equals(temp)) {
            System.out.println(" it is a palindrome ");
        }
        else{
            System.out.println(" It is not a palindrome ");
        }
    }
}
