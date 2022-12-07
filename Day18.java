package Java100daysofcode;

import java.util.Scanner;

public class Day18 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value for a1 and b1: ");
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        System.out.print("Enter the value for a2 and b2: ");
        int a2=sc.nextInt();
        int b2=sc.nextInt();
        int Div;
        int a3=(a1*b2)+(a2*b1);
        int b3=b1*b2;

        if(a3>b3)
            Div=b3;
        else
            Div=a3;
        for(int i=Div;i>0;i--)
        {
            if(a3%i==0 && b3%i==0)
            {
                a3=a3/i;
                b3=b3/i;
            }
        }
        System.out.print("Sum ==  " +a3+ " /"  +b3 );
    }
}
