/**
 * 给你一个 n 行 m 列的矩阵，最开始的时候，每个单元格中的值都是 0。
 *
 * 另有一个索引数组 indices，indices[i] = [ri, ci] 中的 ri 和 ci 分别表示指定的行和列（从 0 开始编号）。
 *
 * 你需要将每对 [ri, ci] 指定的行和列上的所有单元格的值加 1。
 *
 * 请你在执行完所有 indices 指定的增量操作后，返回矩阵中 「奇数值单元格」 的数目。
 */
public class Solution {

    /***
     * 示例 1：
     *
     *
     *
     * 输入：n = 2, m = 3, indices = [[0,1],[1,1]]
     * 输出：6
     * 解释：最开始的矩阵是 [[0,0,0],[0,0,0]]。
     * 第一次增量操作后得到 [[1,2,1],[0,1,0]]。
     * 最后的矩阵是 [[1,3,1],[1,3,1]]，里面有 6 个奇数。
     * @param n
     * @param m
     * @param indices
     * @return
     */
    public int oddCells(int n, int m, int[][] indices) {
        //暴力
        int[][] temp = new int[n][m];
        int count = 0;
        for (int[] index : indices) {
            for (int i = 0; i < m; i++) {
                temp[index[0]][i]++;
            }
            for (int i = 0; i < n; i++) {
                temp[i][index[1]]++;
            }
        }

        for (int[] ints : temp) {
            for (int anInt : ints) {
                if(anInt%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}
