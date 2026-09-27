

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

        while (k > 0) {

            // Find the smallest number
            int minIndex = 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            }

            // Flip the smallest number
            nums[minIndex] = -nums[minIndex];

            k--;
        }

        // Calculate sum
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum;
    }
}
