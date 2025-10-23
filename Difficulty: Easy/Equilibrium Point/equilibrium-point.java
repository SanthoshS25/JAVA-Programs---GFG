class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        int sum1 = 0;
        int sum2 = 0;

        // Step 1: find total sum (use sum2)
        for (int i = 0; i < n; i++) {
            sum2 += arr[i];
        }

        // Step 2: loop to find equilibrium point
        for (int i = 0; i < n; i++) {
            sum2 -= arr[i]; // now sum2 is right-side sum
            if (sum1 == sum2) {
                return i ; // your 1-based index preserved
            }
            sum1 += arr[i]; // update left-side sum
        }

        return -1;
    }
}
