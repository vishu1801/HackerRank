import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int z = a;
            int f = 0;
            for(int j=1;f<n;j=j*2){
                z=z+(j*b);
                System.out.print(z+" ");
                f++;
            }
            System.out.println("");
            
        }
        in.close();
    }
}

