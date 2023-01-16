package Java100daysofcode;

import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {

        //Program to find smallest and largest element in an array.

        Scanner input= new Scanner(System.in);
        System.out.println(" Enter the length of the array ");
        int length= input.nextInt();

        System.out.println(" Enter the element of the Array ");
        int arr[]=new int[length];

        for(int i=0;i<length;i++){
            arr[i]= input.nextInt();
        }
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<length;i++){
          if(arr[i]> max){
              max=arr[i];
          }
          if (arr[i]<min){
              min=arr[i];
          }

        }
        System.out.println( " The Largest element in the array is: " +max);
        System.out.println( " The smallest element in the array is: " +min);
    }
}
