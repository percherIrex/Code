import java.util.Arrays;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素
 */

public class Solution {

    public static void main(String[] args) {
        int[] a = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(a));
//        for (int i = 0; i < 3; i += 2) {
//            System.out.println(i);
//        }
    }

    /***
     * 输入: [2,2,1]
     * 输出: 1
     *
     * 输入: [4,1,2,1,2]
     * 输出: 4
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i += 2) {
            //System.out.println(i);
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}
