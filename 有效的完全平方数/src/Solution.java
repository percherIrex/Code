/**
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    /***
     * 输入：16
     * 输出：True
     * 输入：14
     * 输出：False
     * @param num
     * @return
     */
    public static boolean isPerfectSquare(int num) {
        if (num < 3) {
            return true;
        }
        long left = 1, right = num / 2 , mid;
        while (left <=right) {
            mid = (left + right) / 2;
            if (num == mid * mid) {
                return true;
            } else if (num > mid * mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
