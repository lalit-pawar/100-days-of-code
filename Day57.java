package Java100daysofcode;
import java.util.Scanner;
public class Day57 {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int t[] = new int[n];
        int c[] = new int[n];
        int m[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            t[i] = input.nextInt();
            c[i] = input.nextInt();
            m[i] = input.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (((c[i] * 4) - t[i]) >= m[i]) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }
}

