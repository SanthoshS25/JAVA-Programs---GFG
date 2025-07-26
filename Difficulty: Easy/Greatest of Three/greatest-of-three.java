//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a>b){
            if(a>c){
                System.out.print(a);
            }
            else{
                System.out.print(c);
            }
        }
        else{
            if(b>c){
                 System.out.print(b);
                
            }
            else{
                if(c>a){
                    System.out.print(c);
                }
                else{
                    System.out.print(a);
                }
            }
        }
        
    }
}