public class MaximumSubarray {

    // Method to find the maximum subarray sum using Kadane's Algorithm
    public int maxSubArray(int[] nums) {

        int currSum = 0;                     
        int maxSum = Integer.MIN_VALUE;     

        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {

            currSum += nums[i];

            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        MaximumSubarray obj = new MaximumSubarray();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum Subarray Sum: " + obj.maxSubArray(nums));
    }
}
