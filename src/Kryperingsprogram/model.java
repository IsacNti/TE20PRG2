package Kryperingsprogram;

public class model {


    public String cryptString(String message, String key){
        String result = "";
        while (key.length() < message.length()){
            key = expandkey(key);
        }
        for (int i = 0 ; i < message.length(); i++){
            result += (char)crypt(message.charAt(i), key.charAt(i));
        }
        return result;
    }

    private int crypt(int m, int k) {
        return m^k;
    }


    private String expandkey(String key) {
        return key+key;
    }


    public String decryptString(String message, String key){
        String result = "";
        while (key.length() < message.length()){
            key = deexpandkey(key);
        }
        for (int i = 0 ; i < message.length(); i++){
            result += (char)decrypt(message.charAt(i), key.charAt(i));
        }
        return result;
    }

    private int decrypt(int m, int k) {
        return m^k;
    }


    private String deexpandkey(String key) {
        return key+key;
    }

    public static void main(String[] args) {
        String message = "Tjena";
        String key = "ㅜㅌ20";
        model cryptmodel = new model();
        System.out.println(cryptmodel.cryptString(message, key));
        model decryptmodel = new model();

    }





}
