//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends

//User function Template for Java

public static void triangleWall(int s){
    
    //Write your code here
    for(int i=1;i<=s;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        // for(int k =1;k<=(s-1);k++){
        //     System.out.print(" ");
        // }
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
            triangleWall(s);
        
System.out.println("~");
}
        scn.close();
    }
}
// } Driver Code Ends