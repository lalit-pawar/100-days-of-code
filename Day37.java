package Java100daysofcode;

import java.util.Scanner;

public class Day37 {

    public static void main(String[] args) {

        // Program to calculate the Frequency of characters in a string
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your String ");
        String str = input.nextLine();
        int i = 0;
        int count []= new int[256];
        for (i = 0; i < str.length(); i++) {
            count[(int) str.charAt(i)]++;
        }
        // Print Frequency of characters
        for (i = 0; i <256; i++) {
            if (count[i] != 0) {
                System.out.println("The frequency of  " + (char) i + " is " + count[i]);
            }
        }
    }
}
