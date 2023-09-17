/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution27 {
    public int removeElement(int[] nums, int val) {
        int positionToWrite = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[positionToWrite] = nums[i];
                positionToWrite++;
            }
        }

        return positionToWrite;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;

        var solution = new Solution27();
        int k = solution.removeElement(nums, val);
        System.out.println(k);
    }
}
// @lc code=end
