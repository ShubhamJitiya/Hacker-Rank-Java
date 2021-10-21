package BigNumber;

import java.util.Scanner;

public class BigInteger {
    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner scan = new Scanner(System.in);

            java.math.BigInteger num1 = scan.nextBigInteger();
            java.math.BigInteger num2 = scan.nextBigInteger();
        
            scan.close();
            // It's a good practice to close the resources after using it.

            java.math.BigInteger sum = num1.add(num2);
            java.math.BigInteger mul = num1.multiply(num2);

            System.out.println(sum);
            System.out.println(mul);


    }
}
