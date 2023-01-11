package Java100daysofcode;

import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {

        // Program to Remove brackets from an algebraic expression.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter algebraic expression: ");

        String str = input.nextLine();

        String str2 = str.replaceAll("[(){}]","");

        System.out.println("Expression without brackets : "+str2);

    }
}
