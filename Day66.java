package Java100daysofcode;

import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while(t-->0){
            String a=input.next();
            String b=input.next();
            int count=0;
            for (int i=0;i<a.length() ;i++ ){
                for(int j=0;j<b.length();j++){
                    if(a.charAt(i)==b.charAt(j)){
                        count=1;
                        break;

                    }
                }
                if(count==1){
                    break;
                }
            }
            if(count==1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
