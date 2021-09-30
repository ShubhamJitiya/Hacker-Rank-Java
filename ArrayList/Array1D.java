package DataStructure.ArrayList;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        for (int j = 0; j < n; j++)
        {
            a[j] = scan.nextInt();
        }
        scan.close();
        // Prints each sequential element in array a
        for (int i : a) {
            System.out.println(i);
        }
    }
}
