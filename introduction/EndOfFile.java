package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) throws IOException {
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);

//        String str = input.nextLine();
//        System.out.println(str);
//
//        boolean str1 = input.hasNext();
//        System.out.println(str1);

        int i = 1;
        while(input.hasNext())
        {
            System.out.println(i + " " + input.nextLine());
            i++;
        }

//        String a;
//        a = input.nextLine();
//        int i = 1;
//        while(a.hasNext())
//        {
//            System.out.println(i + " " + a);
//            i++;
//        }
    }
}
