/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 *
 * https://leetcode.com/problems/valid-palindrome/description/
 *
 * algorithms
 * Easy (45.26%)
 * Likes:    8361
 * Dislikes: 7961
 * Total Accepted:    2.4M
 * Total Submissions: 5.2M
 * Testcase Example:  '"A man, a plan, a canal: Panama"'
 *
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads the
 * same forward and backward. Alphanumeric characters include letters and
 * numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric
 * characters.
 * Since an empty string reads the same forward and backward, it is a
 * palindrome.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 2 * 10^5
 * s consists only of printable ASCII characters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            char charStart = Character.toLowerCase(s.charAt(start));
            char charEnd = Character.toLowerCase(s.charAt(end));
        
            if (!Character.isLetterOrDigit(charStart)) {
                start++;
            } else if (!Character.isLetterOrDigit(charEnd)) {
                end--;
            } else if (Character.compare(charStart, charEnd) != 0) {
                return false;
            } else {
                start++;
                end--;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String s = "0P";

        var solution = new Solution();

        boolean result = solution.isPalindrome(s);
        boolean expected = true;

        assert expected == result;
        System.out.println(expected == result);
    }
}
// @lc code=end
