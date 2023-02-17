package Java100daysofcode;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Day82 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0)
        {
            int n=input.nextInt();
            input.nextLine();
            String count="";
            for(int j=0;j<n;j++)
            {
                String s = input.nextLine();
                if(s.charAt(j)=='0')
                    count+="1";
                else
                    count+="0";
            }
            System.out.println(count);


        }
    }
}


