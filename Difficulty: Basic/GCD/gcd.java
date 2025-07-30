// User function Template for Java
class Solution {
    public static int gcd(int a, int b) {
        int min = Math.min(a,b);
        int gcd = 1;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
                
            }
            
        }
        return gcd;
        

        // code here to calculate and return gcd of a and b
    }
}