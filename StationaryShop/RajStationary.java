
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RajStationary{
    public static void main(String[] args) {

        JLabel label = new JLabel("Welcome to Raj stationary :]");

        ImageIcon image = new ImageIcon("logo2.png");
        label.setIcon(image);

        // setting up my main frame.
        JFrame frame = new JFrame();

        frame.setTitle("RajStationary");
        frame.setSize(500, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);

        frame.setVisible(true);

        frame.getContentPane().setBackground(new Color(0XFCF0F8));

        // creating labels for the frame.
        
    }


}