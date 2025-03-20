//{ Driver Code Starts
// Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
// User function Template for Java

public static int countDigits(int n) {
    int c = Math.abs(n); // Handle negative numbers
    int cnt = 0; 

    while (c > 0) {  // Loop until c becomes 0
        c = c / 10;
        cnt++;
    }

    return (n == 0) ? 1 : cnt; // Return 1 if n is 0
}
     
    // write your code here
    // return number of digits in n


//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            System.out.println(countDigits(n));

            System.out.println("~");
        }
        scn.close();
    }
}
// } Driver Code Ends