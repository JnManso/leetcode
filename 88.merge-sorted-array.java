/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int readIndex1 = m - 1;
        int readIndex2 = n - 1;
        int writeIndex1 = m + n - 1;

        while (readIndex2 >= 0) {
            if (readIndex1 >= 0 && nums1[readIndex1] > nums2[readIndex2]) {
                nums1[writeIndex1] = nums1[readIndex1];
                readIndex1--;
            } else {
                nums1[writeIndex1] = nums2[readIndex2];
                readIndex2--;
            }

            writeIndex1--;
        }

    }
}
// @lc code=end