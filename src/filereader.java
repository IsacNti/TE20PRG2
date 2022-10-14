import java.io.*;
import java.nio.charset.StandardCharsets;

public class filereader {
    public static class Main {

        public static void main(String args[]) {
            try (InputStream in = new FileInputStream("input.txt");
                 BufferedReader r = new BufferedReader( new InputStreamReader(in, StandardCharsets.UTF_8))) {
                String str = null;
                StringBuilder sb = new StringBuilder(8192);
                while ((str = r.readLine()) != null) { sb.append(str); }
                System.out.println("data from InputStream as String : " + sb.toString());
            }
            catch (IOException ioe) { ioe.printStackTrace(); }

        }
    }
}
