/**
 * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    /***
     * 输入：nums = [12,345,2,6,7896]
     * 输出：2
     * 解释：
     * 12 是 2 位数字（位数为偶数） 
     * 345 是 3 位数字（位数为奇数）  
     * 2 是 1 位数字（位数为奇数） 
     * 6 是 1 位数字 位数为奇数） 
     * 7896 是 4 位数字（位数为偶数）  
     * 因此只有 12 和 7896 是位数为偶数的数字
     *
     * @param nums
     * @return
     */
    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            //判断位数
            int temp = String.valueOf(num).length();
            if (temp % 2 == 0) {
                result++;
            }

        }
        return result;
    }
}
