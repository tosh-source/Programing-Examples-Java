package nFactorial;

import java.math.BigInteger;
import java.util.Scanner;

public class nFactorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println(factorial);
    }
}
