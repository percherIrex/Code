/***
 * 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k 个字符，
 * 则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-string-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }

    /***
     * 输入: s = "abcdefg", k = 2
     * 输出: "bacdfeg"
     * @param s
     * @param k
     * @return
     */
    public static String reverseStr(String s, int k) {
        String result = "";
        //String reverse = new StringBuffer(string).reverse().toString();
        int loop = s.length() / (2 * k);
        for (int i = 0; i < loop; i++) {
            //每2k段
            String str = s.substring(i * 2 * k, (i + 1) * 2 * k);
            //前k个反转
            String str_temp = new StringBuffer(str.substring(0, k)).reverse().toString();
            //拼接
            result = result + str_temp + str.substring(k);
        }

        String last = s.substring(loop * 2 * k);
        if (last.length() < k) {
            result = result + new StringBuffer(last).reverse().toString();
        } else {
            result = result + new StringBuffer(last.substring(0, k)).reverse().toString() + last.substring(k);
        }

        return result;

    }
}
