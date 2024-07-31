//Given a large integer n , use the Java BigInteger class isProbablePrime method to determine and print whether it's prime or not prime.
package HackerRank;
import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BigInteger n = new BigInteger(scn.next());
        System.out.println(n.isProbablePrime(10)?"Prime":"not prime");
    }
}
