package Java100daysofcode;

import java.util.Scanner;

public class Day44 {

    public static void main(String[] args) {

        // Program to find number of even and odd elements in an array.
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

        System.out.println(" The no of even elements in the array are: " +even);
        System.out.println(" The no of odd elements in the array are: " +odd);


    }
}
