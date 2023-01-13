package Java100daysofcode;

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {

        //Program to Replace substring in a string .
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a string ");
        String str = input.nextLine();

        System.out.println(" Enter the string to be removed ");
        String substring = input.nextLine();

        System.out.println("Enter the new string: ");
        String string2 =input.nextLine();
        String new_string = str.replace(substring, string2);
        System.out.println("New String is " +new_string);
    }
}
