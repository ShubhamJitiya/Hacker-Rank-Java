/*
    Problem statement is given at the end
 */
package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops_I {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = Integer.parseInt(input.readLine());
            for (int i=1;i<=10;i++){
                System.out.println(num + " x " + i + " = " + num * i);
            }
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }
}

/*Problem:
Objective
    In this challenge, we're going to use loops to help us do some simple math.
---------------
Task
    Given an integer, N
        ,print its first 10 multiples. Each multiple (where 1<=i<=10) should be printed on a new line in the form: N x i = result.
---------------
Input Format
    A single integer, N.

---------------
Constraints
    2<=N<=20

---------------
Output Format
    Print 10 lines of output;
    each line (where 1<=i<=10) contains the result of Nxi in the form:
    N x i = result.
 */