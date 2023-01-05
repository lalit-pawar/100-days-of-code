package Java100daysofcode;

import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        // Program to print Length of the string without using strlen() function.
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter your string ");
         String string= input.next();
         int count=0;
         // using For-Each Loop //
         for(char ch: string.toCharArray()){
             count++;
         }
        System.out.println(" The length of the string is :" +count);
    }
}
