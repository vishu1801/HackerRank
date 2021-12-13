import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String g="";
        char[] c=A.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            g=g+c[i];
        }
        if(A.equals(g)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}




