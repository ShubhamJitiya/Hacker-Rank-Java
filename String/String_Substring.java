package String;

import java.util.Scanner;

public class String_Substring {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        java.util.ArrayList <String> arr1 = new java.util.ArrayList<>();
        for (int i = 0; i<=s.length()-k;i++)
        {
            arr1.add(s.substring(i, i+k));
        }
        java.util.Collections.sort(arr1);
        smallest = arr1.get(0);
        largest = arr1.get(arr1.size()-1);

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}