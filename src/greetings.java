import javax.swing.*;
import java.io.StringReader;

public class greetings {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("say hej");

        int antal= 0;
        int i;
        for (i=0; i<s.length(); i=i+1)
            if (s.charAt(i) == ' '){
                antal = antal + 1;
            }
        System.out.println(antal);
        //String[] found = s.split("");

        //System.out.println(found);


        //System.out.println("h"+ p +"y");
    }
}
