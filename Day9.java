import java.util.Scanner;

public class Day9 {

    public static void main(String[] args) {

        // TO Calculate no of digits in a given number //
          int num=0;
        int counter=0;
        while(num!= 0){
            num=num/10;
            counter++;

        }
        System.out.println(counter);

    }
}

