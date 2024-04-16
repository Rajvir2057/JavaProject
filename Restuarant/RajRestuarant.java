// this is done using gui ...
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RajRestuarant {
    public static void main(String[] args) {

        // forming a labels 
        JLabel logolabel = new JLabel();
        logolabel.setText("Welcome to Raj Restuarant :)");

        // setting up an image..
        ImageIcon image = new ImageIcon("rest1.png");
        logolabel.setIcon(image);

        // setting up my main frame.
        JFrame frame = new JFrame();

        // how it will look like..
        frame.setTitle("RajRestuarant");
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0xE8F8FC));

        // ImageIcon image2 = new ImageIcon("icon2.png");
        // frame.setIconImage(image2.getImage());
        
        // setting labels
        frame.add(logolabel);
        frame.setVisible(true);

        

        

    }

}
