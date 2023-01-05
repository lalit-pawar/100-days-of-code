package Java100daysofcode;

import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {

        // Program to Toggle each character in a string //
        Scanner input = new Scanner(System.in);
        System.out.println(" enter your string");
        char str[] = input.next().toCharArray();

        for (int i=0; i<str.length; i++)
        {
            if (str[i]>='A' && str[i]<='Z')
                str[i] = (char) (str[i] + 'a' - 'A');
            else if (str[i]>='a' && str[i]<='z')
                str[i] = (char) (str[i] + 'A' - 'a');
        }

        System.out.println("String after toggle ");
        System.out.println(String.valueOf(str));

    }
}