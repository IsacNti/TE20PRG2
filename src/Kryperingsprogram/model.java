package Kryperingsprogram;

public class model {
    public static void main(String[] args) {

        int teck = 'a';
        int key = '-';
        String getbinaryKey = Integer.toBinaryString(key);
        String getBinaryTeck = Integer.toBinaryString(teck);
        int IntBinaryTeck = Integer.parseInt(getbinaryKey,2);
        int IntBinaryKey = Integer.parseInt(getBinaryTeck,2);
        int xorTeck = IntBinaryTeck^IntBinaryKey;
        System.out.println(xorTeck);
    }





}
