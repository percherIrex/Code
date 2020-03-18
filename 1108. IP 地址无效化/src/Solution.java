/**
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 *
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 */

public class Solution {

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println("defangIPaddr(address) = " + defangIPaddr(address));
    }
    /***
     * 输入：address = "1.1.1.1"
     * 输出："1[.]1[.]1[.]1"
     * 输入：address = "255.100.50.0"
     * 输出："255[.]100[.]50[.]0"
     * @param address
     * @return
     */
    public static String defangIPaddr(String address) {
        //address.replaceAll("\\.","[.]");
        //System.out.println(address);
        return address.replaceAll("\\.","[.]");
    }
}
