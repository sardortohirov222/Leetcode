package LeetCode.easy.todo.reverse_linked_lst;

public class Low_proj {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.2.3.4.5"));
    }
    public static String defangIPaddr(String address) {
        address=address.replaceAll("\\.","[.]");
        return address;
    }
}
