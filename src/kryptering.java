public class kryptering {
    public static void main(String[] args) {
        char m = 123;
        int k = 3456787;
        int c = m^k;
        System.out.println(Integer.toBinaryString(c));
        System.out.println(c^k);


    }
}
