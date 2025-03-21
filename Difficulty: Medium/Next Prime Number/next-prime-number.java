//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends

//User function Template for Java

public static int nextPrime(int n){
      
        
    //code here to find next prime number
    //return next prime number
    // outerloop:
    for(int i=n+1;i>0;i++){
        // innerloop:
        boolean isprime = true;
        for(int j=2;j<i;j++){
            if(i%j==0){
                isprime=false;
                break;
            }
            
        }
        if(isprime){
            return i;
        }
        
    }
    return 0;
    
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int ans = nextPrime(n);
            System.out.println(ans);
        
System.out.println("~");
}
        scn.close();
    }
}
// } Driver Code Ends