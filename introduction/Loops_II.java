package introduction;

import java.util.Scanner;

public class Loops_II {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int sum = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
//            ------------------------
            for (int j = 0; j<n;j++){
                if (j==0)
                {
                    sum += (int) (a+(Math.pow(2, j) * b));
                    System.out.print(sum + " ");
                }
                else
                {
                    sum += (int) (Math.pow(2, j) * b);
                    System.out.print(sum + " ");
                }
//                sum += (int) (Math.pow(2, j) * b);
//                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
