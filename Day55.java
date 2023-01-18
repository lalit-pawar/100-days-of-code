package Java100daysofcode;

import java.util.Scanner;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Day55 {
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
        System.out.println(" Enter the element of the Array 2 ");
        int arr2[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr2[i] = input.nextInt();
        }
        SpecialSort(arr1,length);

        System.out.println(" The Maximum Scalar Product is " +MaximumScalarProduct(arr1,arr2,length));
    }
    static void SpecialSort(int vec1[],int n)
    {
        Arrays.sort(vec1);
        int idx=0;
        while((idx<n) && (vec1[idx] < 0))
        {
            idx++;
        }
        int start = idx,end = n-1;
        while(start<end)
        {

            swap(vec1,start,end);;
            start++;end--;
        }
    }

    static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int MaximumScalarProduct(int vec1[], int vec2[], int n) {
        int max, sop = 0;
        int id1 = 0, id2 = 0;
        for (int i = 0; i < n; i++) {
            max = Integer.MIN_VALUE;
            for (int j = i; j < n; j++) {
                if ((vec1[i] * vec2[j]) > max) {
                    max = vec1[i] * vec2[j];
                    id1 = i;
                    id2 = j;
                }
            }
            sop = sop + max;
            swap(vec1, i, id1);
            swap(vec2, i, id2);

        }

        return sop;
    }

}

