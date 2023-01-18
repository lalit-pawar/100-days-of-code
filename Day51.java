package Java100daysofcode;

import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {

        //program to sort the array.

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the length of the array ");
        int length = input.nextInt();

        System.out.println(" Enter the element of the Array ");
        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                 }
              }
           }
          System.out.println(" The sorted Elements are: ");
          for (int i = 0; i < length; i++) {
            System.out.println(arr[i] );
        }
    }
}
