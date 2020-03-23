/**
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 * <p>
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 * <p>
 * 返回可以通过分割得到的平衡字符串的最大数量。
 */
public class Solution {

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        String s1 = "RLLLLRRRLR";
        String s2 = "LLLLRRRR";
        System.out.println(balancedStringSplit(s));
        System.out.println(balancedStringSplit(s1));
        System.out.println(balancedStringSplit(s2));
    }

    /***
     * 示例 1：
     *
     * 输入：s = "RLRRLLRLRL"
     * 输出：4
     * 解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
     * 示例 2：
     *
     * 输入：s = "RLLLLRRRLR"
     * 输出：3
     * 解释：s 可以分割为 "RL", "LLLRRR", "LR", 每个子字符串中都包含相同数量的 'L' 和 'R'。
     * 示例 3：
     *
     * 输入：s = "LLLLRRRR"
     * 输出：1
     * 解释：s 只能保持原样 "LLLLRRRR".
     * @param s
     * @return
     */
    public static int balancedStringSplit(String s) {
        //关键是对称，要平衡合计应该为0
        int count = 0;
        int banlance = 0;

        char[] temp = s.toCharArray();
        for (char c : temp) {
            if(c=='R'){
                banlance++;
            }else {
                banlance--;
            }

            if(banlance == 0){
                count++;
            }
        }
        return count;
    }
}
