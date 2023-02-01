package Java100daysofcode;

import java.util.Scanner;

public class Day74 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int T = input.nextInt();

        while(T-->0){
        int N = input.nextInt();
        int M = input.nextInt();

            if(N%2==0 && M%2==0){
                System.out.println(0);
            }
            else if(N%2==0&&M%2!=0){
                System.out.println(N);
            }
            else if(N%2!=0&&M%2==0){

                System.out.println(M);
            }
            else{
                System.out.println(M+N-1);
            }
        }
    }
}
