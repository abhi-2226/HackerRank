package HackerRank;
//Sample input: helloworld
//3
//7
//sample output: 
//lowo

import java.util.Scanner;
public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Word : ");
        String S = in.next();
        System.out.println("Enter starting index : ");
        int start = in.nextInt();
        System.out.println("Enter ending index : ");
        int end = in.nextInt();
        String res =  S.substring(start,end);
        System.out.println(res);
    }
}