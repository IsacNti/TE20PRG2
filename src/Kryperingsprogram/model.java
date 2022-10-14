package Kryperingsprogram;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class model {

    private String message;
    private String key;
    private String crypt;


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


    public String decryptString(String crypt, String key){
        String result = "";
        while (key.length() < crypt.length()){
            key = deexpandkey(key);
        }
        for (int i = 0 ; i < crypt.length(); i++){
            result += (char)decrypt(crypt.charAt(i), key.charAt(i));
        }
        return result;
    }

    private int decrypt(int m, int k) {
        return m^k;
    }


    private String deexpandkey(String key) {
        return key+key;
    }


     public StringBuilder cryptString(String input) {
         StringBuilder sb = null;
         try (InputStream in = new FileInputStream(input);
              BufferedReader r = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {
             String str = null;
             sb = new StringBuilder(8192);
             while ((str = r.readLine()) != null) {
                 sb.append(str);
             }
         } catch (IOException ioe) {
             ioe.printStackTrace();
         }
         return sb;
     }

   // FileWriter writer = new FileWriter("testout.txt");
   // BufferedWriter buffer = new BufferedWriter(writer);
     //   buffer.write(filcrypt);
       // buffer.close();
      //  System.out.println("Success");

    public static void main(String[] args) throws IOException {
        String crypt = new String( "ㄈㄦW^ㄽ");
        String message = new String("Tjena");
        String key = new String("ㅜㅌ20");

        model cryptmodel = new model();
        String Crypterat = cryptmodel.cryptString(message,key);
        System.out.println(Crypterat);

        model decryptmodel = new model();
        String Decrypterat = decryptmodel.cryptString(crypt,key);
        System.out.println(Decrypterat);

        model inputmodel = new model();
        String input = "input.txt";
        StringBuilder x = inputmodel.cryptString(input);
        System.out.println(x);

        String filkeyinput = "key.txt";
        StringBuilder filkey = inputmodel.cryptString(filkeyinput);
        System.out.println(filkey);


        message = String.valueOf(x);
        key = String.valueOf(filkey);
        String filcrypt = cryptmodel.cryptString(message,key);
        System.out.println(filcrypt);

       // model writemodel = new model();
       // Object write = writemodel.(filcrypt);

    }
}
