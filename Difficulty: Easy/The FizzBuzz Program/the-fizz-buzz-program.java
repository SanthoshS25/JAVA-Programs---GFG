import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a%3==0 && a%5!=0){
            System.out.print("Fizz");
        }
        else if (a%5==0 && a%3!=0){
            System.out.print("Buzz");
        }
        else if(a%3==0 && a%5==0){
            System.out.print("FizzBuzz");
        }
        else{
        System.out.print(a);}
        
    }
}