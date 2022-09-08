import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.util.ArrayList;

public class filereader {
    public static void main(String[] args) {
        BufferedWriter inFile = openTextFileReadning ("info.text");
        ArrayList<String> fileContent = readAllText(inFile);
        DataOutputStream outFile = openBinaryFileForWriting("info.dat");
        writeTextAsBinary(fileContent);
    }


    private static BufferedWriter openTextFileReadning(String fileName) {
        BufferedReader in = null;
        try{
    }

    private static ArrayList<String> readAllText(BufferedWriter inFile) {
    }

    private static DataOutputStream openBinaryFileForWriting(String s) {
    }

    private static void writeTextAsBinary(ArrayList<String> fileContent) {
    }
}
}
