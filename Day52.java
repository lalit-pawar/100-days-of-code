package Java100daysofcode;

import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {

         //write a program to reverse the array.
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the length of the array ");
        int length = input.nextInt();

        System.out.println(" Enter the element of the Array ");
        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println( " Reversed Array: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
}
