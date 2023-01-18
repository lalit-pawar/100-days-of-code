package Java100daysofcode;

import java.util.Scanner;

public class Day54 {

    public static void main(String[] args) {

        // Program to find whether Arrays are disjoint or not.
        // Two arrays are said to be disjoint if they have no elements in common.

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the length of the array ");
        int length = input.nextInt();

        System.out.println(" Enter the element of the first Array ");
        int arr1[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println(" Enter the element of the second Array ");
        int arr2[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr2[i] = input.nextInt();
        }
        if(Isjoint(arr1,arr2,length)==true)
        {
            System.out.print(" The Arrays are Disjoint");
        }
        else
        {
            System.out.print("The Arrays are not disjoint");
        }

    }

    static boolean  Isjoint(int arr1[],int arr2[],int length){

                 boolean flag=false;
        for (int i = 0; i < length; i++) {
            if (arr1[i] == arr2[i]){

                    flag = false;

            }
            if(flag == false)
            {
                break;
            }
        }
        return flag;
       }
    }

