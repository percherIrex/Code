import java.util.ArrayList;
import java.util.List;

/**
 * 给定一副牌，每张牌上都写着一个整数。
 * <p>
 * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
 * <p>
 * 每组都有 X 张牌。
 * 组内所有的牌上都写着相同的整数。
 * 仅当你可选的 X >= 2 时返回 true。
 */
public class Solution {


    /***
     * 示例 1：
     *
     * 输入：[1,2,3,4,4,3,2,1]
     * 输出：true
     * 解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
     * 示例 2：
     *
     * 输入：[1,1,1,2,2,2,3,3]
     * 输出：false
     * 解释：没有满足要求的分组。
     * 示例 3：
     *
     * 输入：[1]
     * 输出：false
     * 解释：没有满足要求的分组。
     * 示例 4：
     *
     * 输入：[1,1]
     * 输出：true
     * 解释：可行的分组是 [1,1]
     * 示例 5：
     *
     * 输入：[1,1,2,2,2,2]
     * 输出：true
     * 解释：可行的分组是 [1,1]，[2,2]，[2,2]
     *
     * 0 <= deck[i] < 10000
     * @param deck
     * @return
     */
    public boolean hasGroupsSizeX(int[] deck) {

        //每种卡牌数必须是X的倍数 ---》 X为数量的公约数，即求最大公约数
        int[] count = new int[10000];
        for (int c : deck) {
            count[c]++;
        }

        int x = 0;
        for (int i : count) {
            if (i > 0) {
                x = x == 0 ? i : gcd(x, i);
            }
        }

        return x > 1;
    }

    public int gcd(int x, int y) {
        int l = x % y;
//        if (l == 0) {
//            return y;
//        } else {
//            return gcd(y, l);
//        }

        return l == 0 ? y : gcd(y, l);
    }
}
