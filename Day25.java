package Java100daysofcode;

import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {

        // to find Area of a circle .//
        Scanner input=new Scanner(System.in);
        System.out.println( " enter the value of radius ");
        // calling the function .
        Area_of_circle((int) input.nextDouble());
    }
    static double Area_of_circle(int radius){
           double Area= 3.142 *radius*radius;
        System.out.println( " Area of a circle is : " +Area );

        return 0;
    }
}
