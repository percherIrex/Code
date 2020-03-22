import java.util.ArrayList;
import java.util.List;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
        System.out.println("We%20are%20happy.");
    }
    /***
     *
     * 输入：s = "We are happy."
     * 输出："We%20are%20happy."
     * @param s
     * @return
     */
    public static String replaceSpace(String s) {
        List<Character> temp = new ArrayList<>();
        char[] data = s.toCharArray();
        for (char c : data) {
            if(c==' '){
                temp.add('%');temp.add('2');temp.add('0');
            }else {
                temp.add(c);
            }
        }

        String result ="";
        for (Character character : temp) {
            result+=character;
        }

        return result;
    }
}
