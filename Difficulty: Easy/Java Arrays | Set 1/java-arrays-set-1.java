
class Solution {
    public String average(int arr[]) {
        // code here
        int avg=0;
        
        for(int i:arr){
            avg+=i;
        }
        double average = (double)avg/(arr.length);
        return String.format("%.2f",average);
        
    }
}