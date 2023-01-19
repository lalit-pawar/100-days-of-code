package Java100daysofcode;
import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
             int t;
             Scanner input = new Scanner(System.in);
             t = input.nextInt();
             int n[] = new int[t];
             int k[] = new int[t];
             int x[] = new int[t];
             int i;
            for (i = 0; i < t; i++) {

               k[i] = input.nextInt();
               x[i] = input.nextInt();
               n[i] = k[i]-x[i];
            }
            for(i=0;i<t;i++)
          {
            System.out.println(n[i]=k[i]-x[i]);
         }
    }
}
