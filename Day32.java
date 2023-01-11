package Java100daysofcode;

import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {

        // Program to Remove vowels from a string.
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your String " );
        String str= input.nextLine();

        String s1 = "";
        s1 = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(s1);
    }
}
