package Java100daysofcode;
import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x;
        int t = input.nextInt();
        for(int i = 0;i<t;i++)
        {
            int sum0 = 0,sum1 = 0;
            for(int j = 0;j<7;j++)
            {
                x= input.nextInt();
                if(x==1)
                {
                    sum1++;
                }
                else
                {
                    sum0++;
                }
            }
            if(sum0>=sum1)
            {
                System.out.println("No");
            }
            else
            {
                System.out.println("Yes");
            }
        }
    }
}
