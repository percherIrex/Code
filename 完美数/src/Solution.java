/**
 * 对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
 * <p>
 * 给定一个 整数 n， 如果他是完美数，返回 True，否则返回 False
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/perfect-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public static void main(String[] args) {
        if (checkPerfectNumber(28)) {
            System.out.println("完美数");
        } else {
            System.out.println("非完美数");
        }
    }

    public static boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int result = 0;
        //找因子
        for (int i = 1; i * i < num; i++) {
            if (num % i == 0) {
                //求和
                result += i + (num / i);
            }
        }
        //判断
        return result - num == num;
    }
}
