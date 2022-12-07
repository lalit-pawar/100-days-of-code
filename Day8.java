package Java100daysofcode;

import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the values for a, b and c: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        double calc = Math.pow(y,2) - 4*x*z;
        if(calc> 0){
            System.out.println("There are two real roots");
            System.out.println("Roots are " + (-y+Math.sqrt(calc))/(2*x) +
                    " and " + (-y-Math.sqrt(calc))/(2*x));
        }
        else if (calc == 0){
            System.out.println("Roots are equal");
            System.out.println("Roots are " + -y/(2*x));
        }
        else{
            System.out.println("No real roots");
            System.out.println("Roots are " + -y/(2*x) + "+i" + Math.sqrt(-
                    calc)/(2*x) + " and " + -y/(2*x) + "-i" +
                    Math.sqrt(-calc)/(2*x));
        }
    }
}
