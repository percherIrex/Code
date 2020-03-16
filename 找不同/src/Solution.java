/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * <p>
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * <p>
 * 请找出在 t 中被添加的字母。
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
        System.out.println((char)101);
    }

    /***
     * 输入：
     * s = "abcd"
     * t = "abcde"
     *
     * 输出：
     * e
     *
     * 解释：
     * 'e' 是那个被添加的字母。
     * @param s
     * @param t
     * @return
     */
    public static char findTheDifference(String s, String t) {
//        char[] temp = s.toCharArray();
//        for (char c : temp) {
//            String[] str = t.split(String.valueOf(c),2);
//            String tempStr = "";
//            for (String st : str) {
//                tempStr += st;
//            }
//            t = tempStr;
//        }
//        return t.charAt(0);

        int sum1 = 0, sum2 = 0;
        for (Character c : s.toCharArray()) {
            sum1 += c;
        }
        for (Character c : t.toCharArray()) {
            sum2 += c;
        }
        //System.out.println(sum1 + "|||" + sum2);
        return (char) (sum2 - sum1);
    }
}
