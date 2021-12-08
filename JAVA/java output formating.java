import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int y=s1.length();
                if(y<=10){
                    if(y==1){        
                        if(x>99 && x<1000){
                            System.out.println(s1+"              "+x);
                        }
                        else if(x==0){
                            System.out.println(s1+"              "+"00"+x);
                        }
                        else{
                            System.out.println(s1+"              "+"0"+x);
                        }
                    }
                    if(y==2){        
                        if(x>99 && x<1000){
                            System.out.println(s1+"             "+x);
                        }
                        else if(x==0){
                            System.out.println(s1+"             "+"00"+x);
                        }
                        else{
                            System.out.println(s1+"             "+"0"+x);
                        }
                    }
                    if(y==3){        
                        if(x>99 && x<1000){
                            System.out.println(s1+"            "+x);
                        }
                        else if(x==0){
                            System.out.println(s1+"            "+x);
                        }
                        else{
                            System.out.println(s1+"            "+"0"+x);
                        }
                    }
                    if(y==4){        
                        if(x>99 && x<1000){
                            System.out.println(s1+"           "+x);
                        }
                        else if(x==0){
                            System.out.println(s1+"           "+"00"+x);
                        }
                        else{
                            System.out.println(s1+"           "+"0"+x);
                        }
                    }
                    if(y==5){        
                        if(x>99 && x<1000){
                            System.out.println(s1+"          "+x);
                        }
                        else if(x==0){
                            System.out.println(s1+"          "+"00"+x);
                        }
                        else{
                            System.out.println(s1+"          "+"0"+x);
                        }
                    }
                    if(y==6){        
                        if(x>99 && x<1000){
                            System.out.println(s1+"         "+x);
                        }
                        else if(x==0){
                            System.out.println(s1+"         "+"00"+x);
                        }
                        else{
                            System.out.println(s1+"         "+"0"+x);
                        }
                    }
                    if(y==7){        
                        if(x>99 && x<1000){
                            System.out.println(s1+"        "+x);
                        }
                        else if(x==0){
                            System.out.println(s1+"        "+"00"+x);
                        }
                        else{
                            System.out.println(s1+"        "+"0"+x);
                        }
                    }
                    if(y==8){        
                        if(x>99 && x<1000){
                            System.out.println(s1+"       "+x);
                        }
                       else if(x==0){
                            System.out.println(s1+"       "+"00"+x);
                        }
                        else{
                            System.out.println(s1+"       "+"0"+x);
                        }
                    }
                    if(y==9){        
                        if(x>99 && x<1000){
                            System.out.println(s1+"      "+x);
                        }
                        else if(x==0){
                            System.out.println(s1+"      "+"00"+x);
                        }
                        else{
                            System.out.println(s1+"      "+"0"+x);
                        }
                    }
                    if(y==10){        
                        if(x>99 && x<1000){
                            System.out.println(s1+"     "+x);
                        }
                        else if(x==0){
                            System.out.println(s1+"     "+"00"+x);
                        }
                        else{
                            System.out.println(s1+"     "+"0"+x);
                        }
                    }

                }

            }

            System.out.println("================================");

    }
}




