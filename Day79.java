package Java100daysofcode;

import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for(int i=0;i<T;i++)
        {int count=0,t=0;
            int n=input.nextInt();
            String a=input.next();

            for(int j=0;j<a.length()-1;j++)
            {

                if(a.charAt(j)=='1')
                {
                    count++;
                    if(a.charAt(j)==a.charAt(j+1))
                        t++;
                }
            }
            if(a.charAt(a.length()-1)=='1'&& count==0 )
            {
                System.out.println('1');

                continue;
            }
            if(count==0)
            {
                System.out.println('0');
            }
            else
            {
                if(t==0)
                    System.out.println('1');
                else
                    System.out.println('2');
            }
        }
    }
}
