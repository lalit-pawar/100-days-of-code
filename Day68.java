package Java100daysofcode;
import java.util.*;

public class Day68 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        Set<Integer> query = new LinkedHashSet<Integer>();
        for(int i=1 ; i<=t ; i++)
        {
            int n = input.nextInt();
            int a = input.nextInt();
            if(n==1){
                query.add(a);
            }
            else if(n==2){
                if(query.contains(a))
                    query.remove(a);
            }
            else if(n==3){
                if(query.contains(a))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
