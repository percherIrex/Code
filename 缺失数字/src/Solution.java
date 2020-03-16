import java.util.Arrays;


/**
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数
 */
public class Solution {

    public static void main(String[] args) {
        //int[] a = {3, 0, 1};
        int[] a = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(a));
    }

    /***
     * 输入: [3,0,1]
     * 输出: 2
     *
     * 输入: [9,6,4,2,3,5,7,0,1]
     * 输出: 8
     * @param nums
     * @return
     */
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        //暴力
        int i;
        for (i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return i;
    }
}
