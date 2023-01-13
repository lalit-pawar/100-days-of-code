package Java100daysofcode;

import java.util.Scanner;

public class Day41 {

    public static void main(String[] args) {

        // Check if two strings match where one string contains wildcard characters .
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter your first String ");
        String str1= input.nextLine();

        System.out.println(" Enter your second string ");
        String str2= input.nextLine();

        check(str1,str2);

    }
    static boolean wildcard(String first, String second)
    {
        if (first.length() == 0 && second.length() == 0)
            return true;

        if (first.length() > 1 &&first.charAt(0) == '*') {
            int i=0;
            while (i+1<first.length() && first.charAt(i+1) == '*')
                i++;
            first=first.substring(i);
        }
        if (first.length() > 1 && first.charAt(0) == '*' &&
                second.length() == 0)
            return false;

        if ((first.length() > 1 && first.charAt(0) == '?') ||
                (first.length() != 0 && second.length() != 0 &&
                        first.charAt(0) == second.charAt(0)))
            return wildcard(first.substring(1),
                    second.substring(1));

        if (first.length() > 0 && first.charAt(0) == '*')
            return  wildcard(first.substring(1), second) ||
                    wildcard(first, second.substring(1));
        return false;
    }
    static void check(String str1, String str2)
    {
        if (wildcard(str1, str2))
            System.out.println("Yes,The Strings are matching ");
        else
            System.out.println("No,The Strings are not matching ");
    }
}
