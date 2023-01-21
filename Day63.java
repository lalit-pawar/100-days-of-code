package Java100daysofcode;
import java.util.Scanner;

public class Day63 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        for(int i=0;i<t;i++){
            int w1=input.nextInt();
            int w2=input.nextInt();
            int x1=input.nextInt();
            int x2=input.nextInt();
            int m=input.nextInt();
            if((w2>=w1+(x1*m))&&(w2<=w1+(x2*m)))
                System.out.println("1");
            else
                System.out.println("0");

        }
    }
}
