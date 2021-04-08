package introduction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE) //Byte
                {
                    System.out.println("* byte");
                }
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)//Short
                {
                    System.out.println("* short");
                }
                if(x>=Integer.MIN_VALUE && x<= Integer.MAX_VALUE)//Int
                {
                    System.out.println("* int");
                }
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)//Long
                {
                    System.out.println("* long");
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
/*
try
            {
                long x=sc.nextLong();
                if(x>=Math.pow(-2,8-1) && x<=Math.pow(2,8-1)-1) //Byte
                {
                    System.out.println(x+" can be fitted in:");
                    System.out.println("* Byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(x>=Math.pow(-2,16-1) && x<=Math.pow(2,16-1)-1)//Short
                {
                    System.out.println(x+" can be fitted in:");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(x>=Math.pow(-2,32-1) && x<=Math.pow(2,32-1)-1)//Int
                {
                    System.out.println(x+" can be fitted in:");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(x>=Math.pow(-2,64-1) && x<=Math.pow(2,64-1)-1)//Long
                {
                    System.out.println(x+" can be fitted in:");
                    System.out.println("* long");
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
 */