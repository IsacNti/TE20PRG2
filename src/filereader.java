import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class filereader {



    public static void main(String[] args) {
        BufferedReader inFile = openTextFileReadning ("info.text");
        ArrayList<String> fileContent = readAllText(inFile);
       // DataOutputStream outFile = openBinaryFileForWriting("info.dat");
       // writeTextAsBinary(fileContent);
        System.out.println(inFile);
    }


    private static BufferedReader openTextFileReadning(String fileName) {
        BufferedReader in = null;
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader inFil = new BufferedReader(fr);
            return inFil;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
        private static ArrayList<String> readAllText(BufferedReader inFile) {

            ArrayList<String> File = new ArrayList<String>();
            try {
                while (inFile.readLine() != null)
                {
                    File.add(inFile.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(File);
            return File;
    }

    /*private static DataOutputStream openBinaryFileForWriting(String s) {
    }

    private static void writeTextAsBinary(ArrayList<String> fileContent) {
    }

     */
}
//}
