package String;

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int l=0,r=A.length();
        while(l<r){
            if(A.at(l)!=A.at(r)){
                f=1;
                break;
            }
            l++;
            r--;
        }
        if(f==1){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
