package Java100daysofcode;

import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {

        //  to print Pyramid pattern using stars description. //
        Scanner input=new Scanner(System.in);
        System.out.println( " Enter number of lines ");
        int num= input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j= 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for(int k=0;k != 2 * i - 1;k++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
