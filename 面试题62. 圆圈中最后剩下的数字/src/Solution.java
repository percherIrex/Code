import java.util.ArrayList;
import java.util.List;

/**
 * 0,1,,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
 * <p>
 * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 */
public class Solution {

    public static void main(String[] args) {
        lastRemaining(5, 3);
    }

    /***
     * 示例 1：
     *
     * 输入: n = 5, m = 3
     * 输出: 3
     * 示例 2：
     *
     * 输入: n = 10, m = 17
     * 输出: 2
     * @param n
     * @param m
     * @return
     */
    public static int lastRemaining(int n, int m) {
        //赋值
        List<Integer> t = new ArrayList<>();
        //int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t.add(i);
        }
        //循环
        int index = 0;
        int len = n;
        while (len > 1) {
            index = (index + m - 1) % len;
            System.out.println(t.get(index));
            t.remove(index);
            len--;
        }

        return t.get(0);
    }
}
