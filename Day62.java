package Java100daysofcode;

import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {

        int t;
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        int N = input.nextInt();
        int X =  input.nextInt();
        int Y =  input.nextInt();

        for (int i = 0; i < t; i++) {

            N= input.nextInt();
            X=input.nextInt();
            Y =  input.nextInt();

           if(solve(N,X,Y)){
               System.out.println("yes");
           }
           else{
               System.out.println("NO");
           }
        }



    }
    static boolean solve(int N, int X, int Y) {
        return (N + 1) * Y >= X;
    }
}
