package Java100daysofcode;
import java.util.Scanner;
public class Day2 {

    public static void main(String[] args) {

        // To check whether given vhar is alphabet or not.
        Scanner in= new Scanner(System.in);
        char c = in.next().charAt(0);

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            System.out.println( "Alphabet ");

        }
        else{
            System.out.println("Not an Alphabet");
        }
    }
}

