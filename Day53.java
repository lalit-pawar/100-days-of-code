package Java100daysofcode;

import java.util.Scanner;

public class Day53 {

      //  Program to find maximum product subarray in a given array.
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the length of the array ");
        int length = input.nextInt();

        System.out.println(" Enter the element of the Array ");
        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print(" The product of subarray is : " +Subarray(arr,length));
    }
    static int Subarray(int arr[], int n)
    {
        int ans = arr[0];
        for (int i = 0; i < n; i++)
        {
            int p= arr[i];
            for (int j = i + 1; j < n; j++)
            {
                ans = Math.max(ans,p);
                p= p * arr[j];
            }
            ans = Math.max(ans,p);
        }
        return ans;
    }
}

