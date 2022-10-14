package Kryperingsprogram;

public class controller {
    public static void main(String[] args) {
        String crypt = "ㄈㄦW^ㄽ";
        String message = "Tjena";
        String key = "ㅜㅌ20";

        model cryptmodel = new model();
        String Crypterat = cryptmodel.cryptString(message, key);
        System.out.println(Crypterat);

        model decryptmodel = new model();
        String Decrypterat = decryptmodel.cryptString(crypt, key);
        System.out.println(Decrypterat);

        model inputmodel = new model();
        String input = "input.txt";
        StringBuilder x = inputmodel.cryptString(input);
        System.out.println(x);

        message = String.valueOf(x);
        String filcrypt = cryptmodel.cryptString(message,key);
        System.out.println(filcrypt);
    }
}
