// this is done using gui ...
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class RajRestuarant {
    public static void main(String[] args) {
        // setting up my main frame.
        JFrame frame = new JFrame();

        // how it will look like..
        frame.setTitle("RajRestuarant");
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("icon2.png");
        frame.setIconImage(image.getImage());
        
        frame.getContentPane().setBackground(new Color(0xE8F8FC));

    }

}
