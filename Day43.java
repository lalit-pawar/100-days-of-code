package Java100daysofcode;

import java.util.Arrays;
import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {

        //Program to find the array type -- Even /Odd or Mixed. //

        int odd=0,even = 0,mixed=0;

        Scanner input= new Scanner(System.in);
        System.out.println(" Enter the length of the array ");
        int length= input.nextInt();

        System.out.println(" Enter the element of the Array ");
        int arr[]=new int[length];

        for(int i=0;i<length;i++){
            arr[i]= input.nextInt();
        }

        for(int i=0;i<length;i++){
           if(arr[i]%2== 0){
               even++;
           }
            if(arr[i]%2== 1){
               odd++;
            }
        }

        if(even== length)
            System.out.println("Odd type array elements");
        else if(odd == length)
            System.out.println("Even type array elements");
        else
            System.out.println("Mixed type array elements");
    }
}
