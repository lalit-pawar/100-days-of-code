package Java100daysofcode;

import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {

        //  Given 2 integer arrays X and Y of same size.
        //  Consider both arrays as vectors and print the minimum scalar product (Dot product) of 2 vectors.

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the length of the array 1 ");
        int length = input.nextInt();

        System.out.println(" Enter the element of the  first Array ");
        int arr1[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println(" Enter the element of the second Array ");
        int arr2[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr2[i] = input.nextInt();
        }
        // sorting the element of array 1 .
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        //Sorting the element of array 2.
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr2[i] < arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        int scalar_product = 0;
        for (int i = 0; i < length; i++) {
            scalar_product += arr1[i] * arr2[i];
        }
        System.out.println(" The scalar product of arr1 and arr2 ia=s " + scalar_product);
    }

}
