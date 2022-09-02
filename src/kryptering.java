import java.util.Scanner;
public class kryptering {
    public static void main(String[] args) {
        int num = 72;
        int k = 40;
        String result = Integer.toBinaryString(num);
        int decimal=Integer.parseInt(result,2);
        System.out.println(result);
        System.out.println(decimal);
        String Hex = Integer.toHexString(Integer.parseInt(result));
        System.out.println(Hex);

    }
}
