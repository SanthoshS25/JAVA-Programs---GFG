//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Solution oj = new Solution();
            oj.swap(a, b);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public void swap(int a, int b) {
        // code here
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a + " " + b);
    }
}
