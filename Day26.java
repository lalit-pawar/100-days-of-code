package Java100daysofcode;

import java.util.Scanner;

public class Day26 {

    public static void main(String[] args) {

        // program to calculate Maximum number of handshakes. //
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter number of peoples as input ");
        int num= input.nextInt();

        int handshakes= (num* (num- 1)) / 2;

        System.out.println( " The no of handshakes are: " +handshakes );
    }
}
