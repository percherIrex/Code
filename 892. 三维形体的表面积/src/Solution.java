/**
 * 在 N * N 的网格上，我们放置一些 1 * 1 * 1  的立方体。
 *
 * 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。
 *
 * 请你返回最终形体的表面积。
 *
 */
public class Solution {

    /***
     * 示例 1：
     *
     * 输入：[[2]]
     * 输出：10
     * 示例 2：
     *
     * 输入：[[1,2],[3,4]]
     * 输出：34
     * 示例 3：
     *
     * 输入：[[1,0],[0,2]]
     * 输出：16
     * 示例 4：
     *
     * 输入：[[1,1,1],[1,0,1],[1,1,1]]
     * 输出：32
     * 示例 5：
     *
     * 输入：[[2,2,2],[2,1,2],[2,2,2]]
     * 输出：46
     *
     * @param grid
     * @return
     */
    public int surfaceArea(int[][] grid) {

        //也可用三视图的方法，与该方法相似，但略复杂。
        /**
         * 1、垂直累加上去的；
         * 这部分特别好计算，只要是当前单元格的值严格大于 11，就有重叠的部分，重叠的部分是当前单元格的值 - 1−1。
         *
         * 2、一行一行看，重叠的部分；
         * 重叠的部分是相邻两个单元格在行的视角的值的最小值。
         *
         * 3、一列一列看，重叠的部分
         * 重叠的部分是相邻两个单元格在列的视角的值的最小值。
         *
         */

        int rows = grid.length;
        if (rows == 0) {
            return 0;
        }

        int cols = grid[0].length;
        if (cols == 0) {
            return 0;
        }

        // 总的单位立方体的个数
        int sum = 0;
        // 垂直重叠
        int verticalOverlap = 0;
        // 行重叠
        int rowOverlap = 0;
        // 列重叠
        int colOverlap = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += grid[i][j];

                if (grid[i][j] > 0) {
                    verticalOverlap += (grid[i][j] - 1);
                }

                if (j > 0) {
                    rowOverlap += Math.min(grid[i][j - 1], grid[i][j]);
                }

                if (i > 0) {
                    colOverlap += Math.min(grid[i - 1][j], grid[i][j]);
                }
            }
        }
        return sum * 6 - (verticalOverlap + rowOverlap + colOverlap) * 2;
    }
}
