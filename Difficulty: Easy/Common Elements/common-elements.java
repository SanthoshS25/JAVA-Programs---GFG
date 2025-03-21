//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // taking total count of testcases
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            // taking total count-1 of elements
            String temp[] = sc.nextLine().trim().split(" ");
            int n = temp.length;

            // Declaring and Initializing an ArrayList-1
            int a[] = new int[n];

            // adding elements to the ArrayList-1
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(temp[i]);
            }

            temp = sc.nextLine().trim().split(" ");
            int m = temp.length;

            // Declaring and Initializing an ArrayList-1
            int b[] = new int[m];

            // adding elements to the ArrayList-1
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(temp[i]);
            }
            Solution ob = new Solution();
            // calling the method common_element
            // and passing ArrayList 1, 2 as arguments
            // and storing the results in a new ArrayList
            ArrayList<Integer> ans = ob.commonElements(a, b);

            // printing the elements of the new ArrayList
            for (int i : ans) System.out.print(i + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends

// User function Template for Java


class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Store frequency of elements in 'a'
        for (int num : a) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Check elements in 'b' and add to result considering frequency
        for (int num : b) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                result.add(num);
                freqMap.put(num, freqMap.get(num) - 1); // Decrease count
            }
        }

        // Sort the result list
        Collections.sort(result);

        return result;
    }
}
    
    //     Set<Integer> array1 = new HashSet<>();
    //     ArrayList<Integer> sortedarray = new ArrayList<>();
    //     for (int num : a){
    //         array1.add(num);
            
    //     }
    //     for (int num : b){
    //         if (array1.contains(num) && !sortedarray.contains(num)){
    //             sortedarray.add(num);
    //         }
    //     }
        
    //     return sortedarray;
    // }
