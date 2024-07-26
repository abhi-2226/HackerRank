package HackerRank;
import java.util.Scanner;
public class StringToken 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine().trim();
        
        if(s.length()!=0)
        {
            // Split the string using regex that matches one or more non-alphanumeric characters
        String[] arr = s.split("[ !,?._'@]+");
        
        // Print the number of tokens
        System.out.println(arr.length);
        
        // Print the tokens
        for (String token : arr) {
            if (!token.isEmpty()) { // Print only non-empty tokens
                System.out.println(token);
            }
        }
        }
        else
        System.out.println("0");
    }
    
}
