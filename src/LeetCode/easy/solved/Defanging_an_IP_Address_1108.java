package LeetCode.easy.solved;

/**
 * Date-8/13/2023
 * Time-12:49 AM
 */
public class Defanging_an_IP_Address_1108 {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }
}
