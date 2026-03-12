/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int i = 0; i < arr.length; i++){
		    
		    if(CheckPalindrome(arr[i])){
		        continue;
		    }
		    else{
		        return false;
		    }
		}
		
		return true;
    }
    public static boolean CheckPalindrome(int N){
	    
	    int original = N;
	    int rev = 0;
	    
	    while (N != 0){
	         rev = rev * 10 + (N % 10);
	         N /= 10;
	    }
	    
	    return original == rev;
	}
}