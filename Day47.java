package Java100daysofcode;

import java.util.Arrays;
import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {

        //Program to find longest palindrome in an array.
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter the length of the array ");
        int length= input.nextInt();

        System.out.println(" Enter the element of the Array ");
        int arr[]=new int[length];

        for(int i=0;i<length;i++){
            arr[i]= input.nextInt();
        }

          int ans=  largestPalindrome(arr,length);
        System.out.println( "the largest palindrome is " +ans);
        }
    static int largestPalindrome(int arr[], int n)
    {
         Arrays.sort(arr);
         for (int i = n - 1; i >= 0; --i) {

            if (isPal(arr[i]))
                return arr[i];
        }

        return -1;
    }

        static boolean isPal( int  num){
            int a,pal=0;
            int x=num;
            while(num>0){
                a= num%10;
                pal= (pal*10)+a;
                num=num/10;

            }
            return true;
        }

}
