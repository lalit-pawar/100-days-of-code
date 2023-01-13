package Java100daysofcode;

import java.util.Scanner;

public class Day38 {

     // Program to print Non-repeating characters in a string .
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter your input string ");
        String str = input.next();
        int count[] = new int[256];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;

        System.out.println( " Non- repeating characters: ");
        for (int i = 0; i < 256; i++)
            if (count[i] == 1)
                System.out.print((char) i + " ");
    }

}