package DataStructure.ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList[] al = new ArrayList[20000];

        for (int i = 0; i < n; i++) {
            al[i] = new al();
            int d = scanner.nextInt();

            for (int j = 0; j < d; j++) {
                int value = scanner.nextInt();
                al[i].add(value);
            }
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            System.out.println(al[row-].get(col-));
        }
    }
}
