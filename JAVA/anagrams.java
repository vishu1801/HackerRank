import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        int y = A.compareTo(B);
        if(y<1){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        System.out.print(A.substring(0,1).toUpperCase()+A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
        /* Enter your code here. Print output to STDOUT. */
        
    }
}




