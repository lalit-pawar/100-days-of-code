package Java100daysofcode;

import java.util.Arrays;
import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        //Program to check if two arrays are the same or not.
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter your first Array ");
        int arr1[]=new int[input.nextInt()];
        System.out.println(" Enter your second Array ");
        int arr2[]=new int[input.nextInt()];
         boolean ans= Equal(arr1,arr2);
        System.out.println(ans);
    }
    public static boolean Equal(int arr1[], int arr2[])
    {
        if (arr1.length!= arr2.length)
            return false;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Linearly compare elements
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }
}
