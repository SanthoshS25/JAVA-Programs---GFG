//{ Driver Code Starts
// Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends

// User function Template for Java
public static void triangle(int s) {
    for (int i = 1; i <= s; i++) {  // Controls the rows
        for (int j = 1; j <= i; j++) { // Controls columns
            
            // Print '*' for first column, last column of the row, and last row
            if (j == 1 || j == i || i == s) {
                System.out.print("* ");
            } else {
                System.out.print("  "); // Print space inside
            }
        }
        System.out.println();
    }
}

// public static void triangle(int s) {

//     // Write your code here
//     for(int i =1;i<=s;i++){
//         for (int j =1 ; j<=i;j++){
            
//             if(j==1 || j== i || j==s){
//                 System.out.print("* ");
//             }
//             else {
//                 System.out.print(" ");
//             }
//         }
//         // for (int j =1; j<=s-1;j++){
//         //     System.out.print(" ");
//         // }
//         System.out.println();
//     }
    
// }


//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int s = scn.nextInt();
            triangle(s);
        }
        scn.close();
    }
}
// } Driver Code Ends