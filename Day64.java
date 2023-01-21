package Java100daysofcode;

import java.util.Scanner;

public class Day64 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
         int t=input.nextInt();
        while(t-->0)
        {
            String a=input.next();
            if(a.contains("010")||a.contains("101"))
                System.out.println("Good");
            else
                System.out.println("Bad");
        }
    }
}
