/**
 * 给你一个整数数组 nums，请你将该数组升序排列。
 */
public class Solution {

    public static void main(String[] args) {

        int[] r = sortArray(new int[]{5, 6, 3, 1, 6, 3, 4, 9, 1, 6, 0, 8, 7});

        for (int i : r) {
            System.out.print(i);
        }
    }

    /***
     * 示例 1：
     *
     * 输入：nums = [5,2,3,1]
     * 输出：[1,2,3,5]
     * 示例 2：
     *
     * 输入：nums = [5,1,1,2,0,0]
     * 输出：[0,0,1,1,2,5]
     *
     * @param nums
     * @return
     */
    public static int[] sortArray(int[] nums) {
        int l = 0;
        int r = nums.length - 1;


        quickSort(nums, l, r);

        return nums;
    }

    public static void quickSort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }

        int left = l;
        int right = r;
        int t = nums[l];

        while (left < right) {
            //右
            while (nums[right] >= t && left < right) {
                right--;
            }
            //左指针
            while (nums[left] <= t && left < right) {
                left++;
            }


            if (left < right) {
                swap(nums, left, right);
            }
        }

        //System.out.println(nums[left]);
        swap(nums, l, left);

        //开始递归
        quickSort(nums, l, right - 1);
        quickSort(nums, right + 1, r);

    }


    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
