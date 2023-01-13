package Java100daysofcode;

import java.util.Arrays;
import java.util.Scanner;
public class Day39 {

    static boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("[\\s]", "");
        String s2 = str2.replaceAll("[\\s]", "");
        boolean stat = true;
        if (s1.length() != s2.length())
            stat = false;
        else {
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            stat = Arrays.equals(arr1, arr2);
        }
        return stat;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two string: ");
        String str1 = input.next();

        String str2 = input.next();
        boolean anagram = isAnagram(str1, str2);
        if (anagram)
            System.out.println("It is an Anagram");
        else
            System.out.println("It is Not an Anagram");
    }

}