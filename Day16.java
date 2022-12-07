import java.util.Scanner;

public class Day16 {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number ");
        int num= input.nextInt();
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
                sum=sum+i;
        }
        if(sum==num)
            System.out.println(" It is a Perfect Number");
        else
            System.out.println("Not an Perfect Number");
    }

}
