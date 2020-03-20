/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999
 */
public class Solution {

    public static void main(String[] args) {
        printNumbers(2);
    }

    /***
     * 输入: n = 1
     * 输出: [1,2,3,4,5,6,7,8,9]
     */
    public static int[] printNumbers(int n) {
        int total = (int) Math.pow(10, n) - 1;
        int[] result = new int[total];

        for (int i = 0; i < total; i++) {
            result[i] = i + 1;
        }

        //System.out.println("n = " + result[total - 1]);
        return result;
    }
}
