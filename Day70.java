package Java100daysofcode;
import java.util.Scanner;

public class Day70 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println(" Enter the length of the array ");
        int length= input.nextInt();

        System.out.println(" Enter the element of the Array ");
        int arr[]=new int[length];

        for(int i=0;i<length;i++){
            arr[i]= input.nextInt();
        }
        int x = arr[arr.length - 1], i;
        for (i = arr.length - 1; i > 0; i--)
            arr[i] = arr[i - 1];
        arr[0] = x;

        System.out.println( " Array after Reversing in clockwise order ");
        for (i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

}
