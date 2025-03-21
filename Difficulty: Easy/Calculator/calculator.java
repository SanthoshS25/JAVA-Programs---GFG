//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static void utility(int a, int b, int operator){

    //write your code here
       switch (operator) {
            case 1:
                System.out.print(a + b); // Addition
                break;
            case 2:
                System.out.print(a - b); // Subtraction
                break;
            case 3:
                System.out.print(a * b); // Multiplication
                break;
            default:
            System.out.print("Invalid Input");
                return;
        }
    // switch(operator){
    //     case 1:
    //         int add = a+b;
    //         System.out.println(add);
    //         break;
    //     case 2:
    //         int sub = a-b;
    //          System.out.println(sub);
    //         break;
    //     case 3:
    //         int multi = a*b;
    //          System.out.println(multi);
    //         break;
    //     default:
    //          return ;
    // }
    
    
    
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int operator = scn.nextInt();
            utility(a, b, operator);
            System.out.println();
        }
        scn.close();
    }
}
// } Driver Code Ends