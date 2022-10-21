package Kryperingsprogram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class view {
    private JPanel panel;
    private JButton cryptButton;
    private JTextField key;
    private JTextField message;
    private JLabel crypterat;

    public view(){
    }
    public JPanel getPanel(){
        return panel;
    }
    public String getMessage (){
        return message.getText();
    }
    public String getKey(){
        return key.getText();
    }
    public void setCrypt(String c){
        crypterat.setText(c);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("View");
        frame.setContentPane(new view().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void setCryptListener(ActionListener cryptListener) {
        cryptButton.addActionListener(cryptListener);
    }

}
