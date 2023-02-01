package Java100daysofcode;
import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while (T-- > 0) {
            int N = input.nextInt();
            int K = input.nextInt();
            for (int i = 1; i <= T; i++) {

                if (N % K == 0)
                    System.out.println(N / K);
                else
                    System.out.println(-1);
            }
        }
    }
}
