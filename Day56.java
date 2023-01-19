package Java100daysofcode;

import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {

       // Program to find whether the numbers of an array be made equal.

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the length of the array 1 ");
        int length = input.nextInt();

        System.out.println(" Enter the element of the  first Array ");
        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }

        if (Equal(arr, length))

            System.out.println("Yes, The numbers of an array can be made equal ");

        else

            System.out.println("No,The numbers of an array can not be made equal ");
    }
     static boolean Equal(int arr[], int n)

    {
        for (int i = 0; i < n; i++) {
            while (arr[i] % 2 == 0)

                arr[i] /= 2;

            while (arr[i] % 3 == 0)

                arr[i] /= 3;

        }
        for (int i = 1; i < n; i++)

            if (arr[i] != arr[0])
            {
                return false;
            }

           return true;
    }

}
