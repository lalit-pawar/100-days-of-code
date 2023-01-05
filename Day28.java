package Java100daysofcode;

import java.util.Scanner;

public class Day28 {

    public static void main(String[] args) {

        // Program to reverse a string.
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter a String ");
        String name= input.next();

        String str = " ";
        for(int i=name.length()-1;i>=0;i--)
            str=str+name.charAt(i);
        System.out.println("Reversed string : " +str);



    }
}
