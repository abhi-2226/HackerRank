package HackerRank;
//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward
import java.util.Scanner;
public class Pelindrome 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Word to check : ");
        String a = scn.nextLine();
        String rev = "";
        char ch;
        for(int i = 0;i<a.length();i++)
        {
           ch = a.charAt(i);
           rev = ch+rev;
        }
       if(rev.equals(a))
       System.out.println("true");
       else
       System.out.println("false");
    }
    
}
