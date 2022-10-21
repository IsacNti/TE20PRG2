package Kryperingsprogram;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class model {
    private String message;
    private String key;
    private String crypt;
    private String file;
    public model() throws IOException {
    }
    public void setFile(String file){
        this.file = file;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getCrypt() {
        return crypt;
    }
    public void cryptString() {
        String result = "";
        while (key.length() < message.length()) {
            key = expandKey(key);
        }
        for (int i = 0 ; i < message.length() ; i++) {
            result += (char)crypt(message.charAt(i), key.charAt(i));
        }
        crypt = result;
    }
    private int crypt(int m, int k) {
        return m ^ k;
    }


    private String expandKey(String key) {
        return key + key;
    }
    public void decryptString() {
        String result = "";
        while (key.length() < crypt.length()) {
            key = expandKey(key);
        }
        for (int i = 0; i < crypt.length(); i++) {
            result += (char) decrypt(crypt.charAt(i), key.charAt(i));
        }
        message = result;
    }
    private int decrypt(int m, int k) {
        return m ^ k;
    }
    public StringBuilder Filereader() {
        StringBuilder sb = null;
        try (InputStream in = new FileInputStream(file);
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
    public Object writeFile() throws IOException {
         FileWriter writer = new FileWriter("testout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write(crypt);
        buffer.close();
        System.out.println("Success");

        return null;
    }

    public static void main(String[] args) throws IOException {
       // String crypt = new String( "ㄈㄦW^ㄽ");
       // String message = new String("Tjena");
       // String key = new String("ㅜㅌ20");
        String m = "HEJ";
        String k = "(((";
        String f = "input.txt";


        model cryptmodel = new model();

        cryptmodel.setMessage(m);
        cryptmodel.setKey(k);
        cryptmodel.cryptString();
        cryptmodel.getCrypt();  
        cryptmodel.setFile(f);

        System.out.println(cryptmodel.getCrypt());


        cryptmodel.writeFile();

        cryptmodel.cryptString();
        cryptmodel.decryptString();


    }



}
