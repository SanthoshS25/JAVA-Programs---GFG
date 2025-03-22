//{ Driver Code Starts
// Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends

// User function Template for Java

public static int[] decrementArrayElements(int[] arr) {

    // Write your code here
    //n=arr.length;
    int temp[]= new int[arr.length];
    for(int i=0;i<arr.length;i++){
        temp[i]=arr[i]-1;
    }
    return temp;
}


//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            int[] res = decrementArrayElements(arr);

            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();

            System.out.println("~");
        }
        scn.close();
    }
}
// } Driver Code Ends