import java.util.ArrayList;
import java.util.List;

/**
 * 自除数 是指可以被它包含的每一位数除尽的数。
 * <p>
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * <p>
 * 还有，自除数不允许包含 0 。
 * <p>
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/self-dividing-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22));
        //System.out.println(isSelfDividingNumber(20));
    }

    /***
     * 输入：
     * 上边界left = 1, 下边界right = 22
     * 输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
     * @param left
     * @param right
     * @return
     */
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        //枚举
        for (int i = left; i <= right; i++) {
            if(isSelfDividingNumber(i)){
                result.add(i);
            }
        }
        return result;
    }
    public static boolean isSelfDividingNumber(int num) {
        if (num == 0) {
            return false;
        }
        //判断
        int loop = num;
        while (loop != 0) {
            //十的倍数一定不是自除数 ||
            if (loop % 10 == 0 || num % (loop % 10) != 0) {
                return false;
            }
            loop = loop / 10;
        }
        return true;
        
    }
}
