//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static void difference(int n1, int n2){
    
    //Write your code here
    	int[] a = new int[11];
		int[] b = new int[11];
		int temp[] = new int[11];
		for (int i = 1 ; i < a.length; i++){
		    a[i] = n1 * i;
		    b[i] = n2 * i;
		    
		}
// 		for (int i = 1 ; i <=10; i++){
// 		    System.out.print(a[i]+" ");
// 		  //   System.out.println(b[i]);
		    
// 		}
// 		for (int i = 1 ; i <=10; i++){
// 		    //System.out.print(a[i]);
// 		     System.out.println(b[i]+" ");
		    
// 		}
		for (int i = 1 ; i <=10; i++){
		   if (n1>n2){
		       temp[i]= a[i] - b[i];
		       System.out.print(temp[i]+" ");
		       
		   }
		   else{
		       temp[i]= b[i] - a[i];
		       System.out.print(temp[i]+" ");
		       
		   }
		    
		}
		
    
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            difference(n1, n2);
            System.out.println();
        
System.out.println("~");
}
        scn.close();
    }
}
// } Driver Code Ends