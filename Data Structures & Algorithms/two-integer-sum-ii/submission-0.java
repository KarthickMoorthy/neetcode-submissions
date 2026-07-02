class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int L = 0;
        int R = numbers.length - 1;

        while (R > L) {
            int currentSum = numbers[L] + numbers[R];
            if (currentSum > target) {
                R--;
            } else if (currentSum < target) {
                L++;
            } else {
                return new int[] {L + 1, R + 1};
            }
        }

        return new int[0];
    }
}
