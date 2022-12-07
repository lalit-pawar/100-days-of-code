import java.util.Scanner;

public class Day15 {

     // to calculate the factorial
    public static int fact(int num){

        int factorial = 1;
        for(int i=1;i<=num;i++){
            factorial= factorial*i;

        }
        return factorial;

    }
    public static void main(String[] args) {

          int sum= 0;

        Scanner input=new Scanner(System.in);
        System.out.println(" Enter your number ");
        int num= input.nextInt();
        int x= num; // to store the value of num

        while( num !=0){

            int n= num%10 ;
            sum= sum + fact(n);
            num= num/10;
        }

        if(sum == x){

            System.out.println( " the number is strong number ");
        }
        else{
            System.out.println(" the number is not strong number ");
        }

    }
}
