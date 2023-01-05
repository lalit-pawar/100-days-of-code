package Java100daysofcode;

import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {

        // Program to concatenate a string.
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter your first String " );
        String first= input.next();
        System.out.println(" Enter your second String ");
        String second= input.next();

        System.out.println(" concatenated String: " +first + second);
    }
}
