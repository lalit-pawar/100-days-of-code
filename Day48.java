package Java100daysofcode;

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {

        //Program to remove duplicate elements in an array.
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the length of the array ");
        int length = input.nextInt();

        System.out.println(" Enter the element of the Array ");
        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }

         int n = remove_duplicate(arr,length);
        System.out.println(" array after removing duplicate elements: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");

    }
    }

    public static int remove_duplicate(int arr[], int n)
    {
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        System.out.println( " Array after removing the duplicates : ");
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }
}
