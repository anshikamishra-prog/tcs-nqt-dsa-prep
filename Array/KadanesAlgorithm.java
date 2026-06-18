package Array;
public class KadanesAlgorithm {
    public static int maxSubArraySum(int[] nums) {
        int max = nums[0];   // overall maximum
        int currentMax = nums[0]; // max ending at current position

        for (int i = 1; i < nums.length; i++) {
           
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            max = Math.max(max, currentMax);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum = " + maxSubArraySum(arr));
    }
}
