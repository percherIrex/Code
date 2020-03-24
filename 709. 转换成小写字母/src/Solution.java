/**
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 */
public class Solution {

    public static void main(String[] args) {
        //System.out.println((char) ('A' + 32));
        System.out.println(toLowerCase("LOVELY"));
    }

    /***
     * 示例 1：
     *
     * 输入: "Hello"
     * 输出: "hello"
     * 示例 2：
     *
     * 输入: "here"
     * 输出: "here"
     * 示例 3：
     *
     * 输入: "LOVELY"
     * 输出: "lovely"
     *
     * @param str
     * @return
     */
    public static String toLowerCase(String str) {
        char[] temp = str.toCharArray();
        String result = "";
        for (char c : temp) {
            if (c >= 'A' && c <= 'Z') {
                c += 32;
            }
            result += c;
        }
        return result;
    }
}
