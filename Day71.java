package Java100daysofcode;

import java.util.Arrays;
import java.util.Scanner;
public class Day71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while(T-->0){
            int n = input.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = input.nextInt();
            }
            Arrays.sort(a);
            int cnt=n/2;
            while(cnt>0 && a[cnt-1]==a[cnt]){

                cnt--;
            }
            System.out.println(n-cnt);
        }


    }

    }


