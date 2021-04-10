package BigNumber;

import java.util.Scanner;

public class JavaPrimality {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String n = scanner.nextLine();
        java.math.BigInteger n = scanner.nextBigInteger();
//        String result = BigInteger.isProbablePrime(n)?"Prime":"Not Prime";
        scanner.close();
        System.out.println();
    }
}
