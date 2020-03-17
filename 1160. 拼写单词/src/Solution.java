import java.util.Arrays;

/**
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 * <p>
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 * <p>
 * 注意：每次拼写时，chars 中的每个字母都只能用一次。
 * <p>
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {

    public static void main(String[] args) {
        String[] words = {"cat", "cat"};
        String chars = "cat";
        System.out.println(countCharacters(words, chars));
    }

    /***
     * 输入：words = ["cat","bt","hat","tree"], chars = "atach"
     * 输出：6
     * 解释：
     * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6
     *
     * 输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
     * 输出：10
     * 解释：
     * 可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
     *
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param words
     * @param chars
     * @return
     */
    public static int countCharacters(String[] words, String chars) {
        //统计chars中字母数量
        int[] has = new int[26];
        char[] _chars = chars.toCharArray();
        for (int i = 0; i < chars.length(); i++) {
            has[_chars[i] - 'a']++;
        }

        int result = 0;

        int[] map = new int[26];

        for (String word : words) {
            char[] c = word.toCharArray();
            boolean flag = true;
            Arrays.fill(map, 0);
            //统计单词中字母数量
            for (int i = 0; i < word.length(); i++) {
                map[c[i] - 'a']++;
                //超额
                if (map[c[i] - 'a'] > has[c[i] - 'a']) {
                    flag = false;
                }
            }
            if (flag) {
                result += word.length();
            }
        }
        return result;
    }
}
