/**
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
    /***
     * 输入：n = 234
     * 输出：15
     * 解释：
     * 各位数之积 = 2 * 3 * 4 = 24
     * 各位数之和 = 2 + 3 + 4 = 9
     * 结果 = 24 - 9 = 15
     *
     * 输入：n = 4421
     * 输出：21
     * 解释：
     * 各位数之积 = 4 * 4 * 2 * 1 = 32
     * 各位数之和 = 4 + 4 + 2 + 1 = 11
     * 结果 = 32 - 11 = 21
     * @param n
     * @return
     */
    public static int subtractProductAndSum(int n) {
        //得到各位数字
        int sum = 0;
        int sub = 1;

        char[] nums = Integer.toString(n).toCharArray();
        for (int c : nums) {
            sum += (c-'0');
            sub *= (c-'0');
        }
        return sub - sum;
    }
}
