

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg", 2));
        System.out.println(reverseLeftWords("lrloseumgh", 6));
    }


    /***
     * 输入: s = "abcdefg", k = 2
     * 输出: "cdefgab"
     *
     * 输入: s = "lrloseumgh", k = 6
     * 输出: "umghlrlose"
     * @param s
     * @param n
     * @return
     */
    public static String reverseLeftWords(String s, int n) {
        //String str = s.substring(n)+s.substring(0,n)
        return s.substring(n) + s.substring(0, n);
    }
}
