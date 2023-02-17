package Java100daysofcode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String s = input.next();
            System.out.println(minOpsToSort(n, s));
        }
    }
    public static int minOpsToSort(int n, String s) {
        int count = 0;
        for (int i =s.length();  i >=2 ;i--) {
            if (s.substring(i-2,i).equals("10")) {
                count++;
            }
        }
        return count;
    }
}