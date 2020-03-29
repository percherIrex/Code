import java.util.Arrays;

/**
 * 给定一个单词列表，我们将这个列表编码成一个索引字符串 S 与一个索引列表 A。
 *
 * 例如，如果这个列表是 ["time", "me", "bell"]，我们就可以将其表示为 S = "time#bell#" 和 indexes = [0, 2, 5]。
 *
 * 对于每一个索引，我们可以通过从字符串 S 中索引的位置开始读取字符串，直到 "#" 结束，来恢复我们之前的单词列表。
 *
 * 那么成功对给定单词列表进行编码的最小字符串长度是多少呢？
 *
 */
public class Solution {

    /***
     * 示例：
     *
     * 输入: words = ["time", "me", "bell"]
     * 输出: 10
     * 说明: S = "time#bell#" ， indexes = [0, 2, 5] 。
     *  
     *
     * 提示：
     *
     * 1 <= words.length <= 2000
     * 1 <= words[i].length <= 7
     * 每个单词都是小写字母 。
     *
     * @param words
     * @return
     */
    public int minimumLengthEncoding(String[] words) {
        //找单词是否某单词后缀，或者用Trie树\字典树（官方解，个人不会）


        int N = words.length;
        // 反转每个单词
        String[] reversed_words = new String[N];
        for (int i = 0; i < N; i++) {
            String word = words[i];
            String rword = new StringBuilder(word).reverse().toString();
            reversed_words[i] = rword;
        }
        // 字典序排序
        Arrays.sort(reversed_words);

        int res = 0;
        for (int i = 0; i < N; i++) {
            if (i + 1 < N && reversed_words[i + 1].startsWith(reversed_words[i])) {
                // 当前单词是下一个单词的前缀，丢弃
            } else {
                res += reversed_words[i].length() + 1; // 单词加上一个 '#' 的长度
            }
        }
        return res;
    }
}
