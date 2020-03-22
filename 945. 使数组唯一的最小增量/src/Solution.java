import java.util.Arrays;

/**
 * 给定整数数组 A，每次 move 操作将会选择任意 A[i]，并将其递增 1。
 * <p>
 * 返回使 A 中的每个值都是唯一的最少操作次数。
 */
public class Solution {

    public static void main(String[] args) {
        int[] A = {3, 2, 1, 2, 1, 7};
        //int[] A = {1, 2, 2};
        System.out.println(minIncrementForUnique(A));
    }

    /***
     * 示例 1:
     *
     * 输入：[1,2,2]
     * 输出：1
     * 解释：经过一次 move 操作，数组将变为 [1, 2, 3]。
     * 示例 2:
     *
     * 输入：[3,2,1,2,1,7]
     * 输出：6
     * 解释：经过 6 次 move 操作，数组将变为 [3, 4, 1, 2, 5, 7]。
     * 可以看出 5 次或 5 次以下的 move 操作是不能让数组的每个值唯一的。
     * @param A
     * @return
     */
    public static int minIncrementForUnique(int[] A) {
        int count = 0;
        //int len = A.length;
        Arrays.sort(A);
        //暴力
//        for (int i = 0; i < len - 1; i++) {
//            for (int j = i + 1; j < len; j++) {
//                if(A[i] == A[j]){
//                    //System.out.println(A[i]);
//                    A[j]++;
//                    count++;
//                }
//            }
//        }

        //max = 0 d
        int max = -1;
        for (int i = 0; i < A.length; i++) {
            int v = A[i];

            if (max >= v) {
                //每次改变到最大值
                count += (max + 1) - v;
                A[i] = max + 1;
            }

            max = A[i];
        }

        return count;
    }
}
