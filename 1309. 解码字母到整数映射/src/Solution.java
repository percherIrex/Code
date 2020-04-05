import java.util.Stack;

/**
 * 给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：
 * <p>
 * 字符（'a' - 'i'）分别用（'1' - '9'）表示。
 * 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
 * 返回映射之后形成的新字符串。
 * <p>
 * 题目数据保证映射始终唯一。
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }

    /***
     * 示例 1：
     *
     * 输入：s = "10#11#12"
     * 输出："jkab"
     * 解释："j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
     * 示例 2：
     *
     * 输入：s = "1326#"
     * 输出："acz"
     * 示例 3：
     *
     * 输入：s = "25#"
     * 输出："y"
     * 示例 4：
     *
     * 输入：s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
     * 输出："abcdefghijklmnopqrstuvwxyz"
     *
     * @param s
     * @return
     */
    public static String freqAlphabets(String s) {
        if (s.length() == 0) {

            return null;
        }

        char[] temp = s.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (int i = temp.length - 1; i >= 0; i--) {
            char con = temp[i];
            if (con == '#') {
                int c = (temp[i - 1] - '0') + (temp[i - 2] - '0') * 10;
                //System.out.println("c = " + c);
                stack.push(c);
                i -= 2;
            } else {
                stack.push(con - '0');
            }
        }

        StringBuilder ret = new StringBuilder();
        while (!stack.isEmpty()) {
            ret.append((char) (stack.pop() - 1 + 'a'));
        }

        return ret.toString();
    }
}
