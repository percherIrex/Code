import java.util.HashSet;
import java.util.Set;

/**
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 */
public class Solution {

    /***
     * 示例 1：
     *
     * 输入: s = "leetcode"
     * 输出: false
     * 示例 2：
     *
     * 输入: s = "abc"
     * 输出: true
     * @param astr
     * @return
     */
    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        char[] temp = astr.toCharArray();

        for (char c : temp) {
            set.add(c);
        }

        return set.size() == temp.length;
    }
}
