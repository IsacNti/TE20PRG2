import java.util.Scanner;
public class kryptering {
    public static void main(String[] args) {
        char m = 'H';
        int num = m;
        int k = 40;
        int c = m^k;
        String result = Integer.toBinaryString(c);
        int decimal=Integer.parseInt(result,2);
        System.out.println(result);
        System.out.println(decimal);
        String Hex = Integer.toHexString(Integer.parseInt(result));
        System.out.println(Hex);

    }
}
