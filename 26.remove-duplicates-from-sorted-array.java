/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution26 {
    public int removeDuplicates(int[] nums) {
        int writePoint = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[writePoint++] = nums[i];
            }
        }

        return writePoint;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] expectedNums = new int[] { 0, 1, 2, 3, 4 }; // The expected answer with correct length

        var solution = new Solution26();
        int k = solution.removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
// @lc code=end
