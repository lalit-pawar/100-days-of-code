package Java100daysofcode;

import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {

        //Write Program to find sum of positive square elements in the array.

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the length of the array ");
        int length = input.nextInt();

        System.out.println(" Enter the element of the Array ");
        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }
        int sum=0;

        for(int i=0;i<length;i++){

          sum = sum+ arr[i]*arr[i];

        }

        System.out.println(sum);
    }
}
