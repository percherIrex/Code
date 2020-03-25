/**
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * <p>
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * <p>
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 */
public class Solution {


    public static void main(String[] args) {

    }

    /***
     * 示例 1:
     *
     * 输入: [[1,1,0],[1,0,1],[0,0,0]]
     * 输出: [[1,0,0],[0,1,0],[1,1,1]]
     * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
     *      然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
     * 示例 2:
     *
     * 输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
     * 输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     * 解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
     *      然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     *
     * @param A
     * @return
     */
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] temp = new int[A.length][A[0].length];

        //翻转每一行
        for (int i = 0; i < A.length; i++) {
            temp[i] = helper(A[i]);
        }

        return temp;
    }

    public int[] helper(int[] arr) {
        int index = 0;
        int[] res = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                res[index] = 1;
            } else {
                res[index] = 0;
            }
            index++;
        }

        return res;
    }
}
