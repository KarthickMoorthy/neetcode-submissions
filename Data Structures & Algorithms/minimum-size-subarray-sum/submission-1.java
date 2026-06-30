class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       //  Prefix sum solution
       int n = nums.length;
       int minLength = n+1;
       int[] prefixSum = new int[n+1];
    
       for (int i = 0; i<n; i++){
         prefixSum[i+1] = prefixSum[i] + nums[i];
       }

       // Binary Search
       for (int i = 0; i<n; i++){
         int l = i; 
         int r = n;

         while(r>l){
           int mid = (l+r)/2;
           int currentSum = prefixSum[mid+1] - prefixSum[i];
           if(currentSum >= target){
                  r = mid;
           }  else {
                  l = mid + 1;
           }
 }
           if (l != n) {
                minLength = Math.min(minLength, l - i + 1);
            }
            
        
          
       }
       return minLength % (n + 1); 
    }
}