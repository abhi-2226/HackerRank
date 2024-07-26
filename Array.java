package HackerRank;
import java.util.*;
public class Array
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many nos you want to enter : ");
        int n = scan.nextInt();
        int []a = new int[n];

        System.out.println("Enter the nos : ");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.print("The Numbers entered are : ");
        // Prints each sequential element in array a
         for (int i = 0; i < n; i++) {
             System.out.print(a[i]);
        }

    }
    
}
