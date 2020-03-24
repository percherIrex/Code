/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * <p>
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(1 ^ 4);
    }

    /***
     * 示例:
     *
     * 输入: x = 1, y = 4
     *
     * 输出: 2
     *
     * 解释:
     * 1   (0 0 0 1)
     * 4   (0 1 0 0)
     *        ↑   ↑
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {

        return Integer.bitCount(x ^ y);
    }
}
