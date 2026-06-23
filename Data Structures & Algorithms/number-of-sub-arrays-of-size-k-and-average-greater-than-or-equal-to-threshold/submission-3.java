class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int[] prefixSum = new int[arr.length + 1];
        // Using prefix Sum and sliding window 

        // Create prefix sum array
        for(int i =0; i<arr.length; i++){
          // All the previous sum + current array element
           prefixSum[i+1] += prefixSum[i] + arr[i];
        }

        int l = 0, res = 0;

        // loop for the size of the window
        for (int r = k-1; r<arr.length; r++ ){
          int sum = prefixSum[r+1] - prefixSum[l];
          if (sum / k >= threshold) {
                res++;
            }
            l++;
        }

        return res;
    }
}