/**
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * <p>
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

    /***
     * 输入:
     * "abccccdd"
     *
     * 输出:
     * 7
     *
     * 解释:
     * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
     * @param s
     * @return
     */
    public static int longestPalindrome(String s) {
        //偶数次字母必定在回文，奇数-1也是偶数
        if (s.length() == 1) {
            return 1;
        }

        int result = 0;
        //最后字母z为122
        int[] counts = new int[123];
        char[] chars = s.toCharArray();
        boolean flag = false; //判断是否出现过单数
        for (char c : chars) {
            counts[c]++;
        }
        for (int count : counts) {
            if (count % 2 == 0) {
                result += count;
            } else {
                result += (count - 1);
                flag = true;
            }
        }

        return flag ? result + 1 : result;
    }
}
