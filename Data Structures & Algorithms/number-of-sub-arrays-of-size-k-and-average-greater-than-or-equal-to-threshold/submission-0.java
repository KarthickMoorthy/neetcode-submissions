class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
      int currentSum = 0;
      int result = 0;
      int L = 0;

      for(int R = 0; R<arr.length; R++){
        // Add the number to current Sum
        currentSum += arr[R];
        if(R-L + 1 > k) {
            // Remove the number from sum leaving the window
            currentSum -= arr[L];
            L++;
        } 

        if(R-L + 1 == k){
          // current sum matches or exceeds the threshold , increment the result
          if(currentSum>=threshold*k){
              result+= 1;
          }
        }
      }

      return result;
    }
}