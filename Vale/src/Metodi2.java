//Interfaccia grafica
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Metodi2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First");
        frame.setSize(900, 600);
        JButton button = new JButton("bottone");
        frame.getContentPane().add(button);
        frame.setVisible(true);
        JTextArea testo = new JTextArea(10, 40);
        frame.getContentPane().add(testo);
        testo.append("wow");
        button.addActionListener(e -> {
            // display/center the jdialog when the button is pressed
            JDialog d = new JDialog(frame, "Hello", true);
            d.setLocationRelativeTo(frame);
            d.setVisible(true);
        });
    }
}
