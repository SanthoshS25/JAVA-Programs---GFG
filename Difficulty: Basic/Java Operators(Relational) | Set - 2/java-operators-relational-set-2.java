//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int A=sc.nextInt();
            int B=sc.nextInt();

            Solution ob = new Solution();
            ob.relationalOperators(A,B);
            
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void relationalOperators(int A,int B){
        if (A>B) System.out.println(A+" is greater than "+B);
        if (A<B) System.out.println(A+" is less than "+B);
        if (A==B) System.out.println(A+" is equal to "+B);
        // code here
    }
}