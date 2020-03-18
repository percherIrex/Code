import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个以行程长度编码压缩的整数列表 nums 。
 * <p>
 * 考虑每对相邻的两个元素 freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），
 * 每一对都表示解压后子列表中有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。
 * <p>
 * 请你返回解压后的列表。
 */
public class Solution {

    public static void main(String[] args) {
        //int[] nums = {1, 2, 3, 4};
        int[] nums = {1, 1, 2, 3};

        decompressRLElist(nums);
    }

    /***
     * 输入：nums = [1,2,3,4]
     * 输出：[2,4,4,4]
     *
     * 输入：nums = [1,1,2,3]
     * 输出：[1,3,3]
     * @param nums
     * @return
     */
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                result.add(nums[i + 1]);
            }
        }

        //result.forEach(System.out::print);
        return result.stream().mapToInt(Integer::valueOf).toArray();

    }
}
