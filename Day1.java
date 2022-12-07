package Java100daysofcode;
import java.util.Scanner;
public class Day1 {

        public static void main(String[] args) {

            Scanner inp=new Scanner(System.in);
            char c=((inp.nextLine()).charAt(0));
            char z=Character.toUpperCase(c); //Changing Value to UpperCase for uniformity.

            if(z=='A' || z=='E' || z=='I' || z=='O' || z=='U') {   //Checking if Vowel
                System.out.println("Vowel");
            }
            else {
                System.out.println("Consonant");
            }
        }
    }
