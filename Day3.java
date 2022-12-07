package Java100daysofcode;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {

        // ****** Program to get Ascii value of given character ****//
        Scanner input = new Scanner (System.in);
        System.out.println(" enter your input character ");
        char ch= input.next().charAt(0);

        int ascii= ch;
        System.out.println( " The Ascii value of given character is " +ascii );


    }
}
