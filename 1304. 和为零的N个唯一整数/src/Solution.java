/**
 * 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
 */
public class Solution {
    /***
     * 示例 1：
     *
     * 输入：n = 5
     * 输出：[-7,-1,1,3,4]
     * 解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
     * 示例 2：
     *
     * 输入：n = 3
     * 输出：[-1,0,1]
     * 示例 3：
     *
     * 输入：n = 1
     * 输出：[0]
     *
     * @param n
     * @return
     */
    public int[] sumZero(int n) {
        //暴力
        if(n==0){
            return null;
        }
        int[] res= new int[n];

        int mid = n/2;
        int v = 0;
        if(n%2==1){
            res[mid] = v;
            for(int i=mid-1;i>=0;i--){
                res[i] = --v;
            }
            v = 0;
            for(int i=mid+1;i<n;i++){
                res[i] =++v;
            }
        }else{
            for(int i=mid-1;i>=0;i--){
                res[i] = --v;
            }
            v = 0;
            for(int i=mid;i<n;i++){
                res[i] =++v;
            }
        }

        return res;
    }

}
