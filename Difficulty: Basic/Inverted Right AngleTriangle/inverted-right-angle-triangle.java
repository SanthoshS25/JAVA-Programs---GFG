//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends

//User function Template for Java

public static void invTriangleWall(int s){
    
    //Write your code here
    for(int i=1;i<=s;i++){
        for(int j=1;j<=(s+1)-i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int s = scn.nextInt();
            invTriangleWall(s);
        
System.out.println("~");
}
        scn.close();
    }
}
// } Driver Code Ends