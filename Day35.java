package Java100daysofcode;

import java.util.Scanner;

public class Day35 {

    public static void main(String[] args) {

        // Program to Count the sum of numbers in a string //
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter your String ");
        String str= input.nextLine();
        int i, sum= 0;
        for(i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)))
                sum=sum+Character.getNumericValue(str.charAt(i));

        }
        System.out.println(" The sum of the numbers " +sum);

    }
}

