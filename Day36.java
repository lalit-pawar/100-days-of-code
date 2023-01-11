package Java100daysofcode;

import java.util.Scanner;

public class Day36 {

    public static void main(String[] args) {

        //Program to Capitalize the first and last letter of each word of a string

        Scanner input=new Scanner(System.in);
        System.out.println(" Enter your String ");
        String str= input.nextLine();
        String newstring = "";
        String[] str1 = str.split("\\s");
        for (String string : str1) {
            int length = string.length();
            String j = string.substring(0, 1);
            String k = string.substring(1, length - 1);
            String l = Character.toString(string.charAt(length-1));
            newstring = newstring+j.toUpperCase()+k+l.toUpperCase();
        }
        System.out.println(newstring);
    }

}
