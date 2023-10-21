/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 *
 * https://leetcode.com/problems/rotate-array/description/
 *
 * algorithms
 * Medium (39.89%)
 * Likes:    16486
 * Dislikes: 1800
 * Total Accepted:    1.8M
 * Total Submissions: 4.4M
 * Testcase Example:  '[1,2,3,4,5,6,7]\n3'
 *
 * Given an integer array nums, rotate the array to the right by k steps, where
 * k is non-negative.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation: 
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^5
 * -2^31 <= nums[i] <= 2^31 - 1
 * 0 <= k <= 10^5
 * 
 * 
 * 
 * Follow up:
 * 
 * 
 * Try to come up with as many solutions as you can. There are at least three
 * different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 * 
 * 
 */

// @lc code=start
class Solution189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        // imagine that k split the array
        // part 1 is the left side
        // part 2 is the right side
        
        // part 1 reverse
        reverse(nums, 0, nums.length - k - 1);
        // part 2 reverse
        reverse(nums, nums.length - k, nums.length - 1);
        // complete reverse
        reverse(nums, 0, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while(start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        final int k = 3;

        var solution = new Solution189();
        solution.rotate(nums, k);

        int[] expectedNums = new int[] { 5, 6, 7, 1, 2, 3, 4 };

        assert expectedNums.length == nums.length;
        for (int i = 0; i < nums.length; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}

// @lc code=end