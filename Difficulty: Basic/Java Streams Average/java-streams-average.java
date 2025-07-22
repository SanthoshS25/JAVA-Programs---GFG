// User function Template for Java
class Solution {
    public static double avgUsingStreams(int[] arr) {
        // Your code here
        double avg =0.0;
        
        for(int i=0;i<arr.length;i++){
              avg +=arr[i];
        }
        double average = avg/(arr.length);
        return average;

        // Use stream().average().getAsDouble()
        // Just return and don't typecase anything.
    }
}