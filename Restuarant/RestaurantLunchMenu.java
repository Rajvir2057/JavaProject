import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RestaurantLunchMenu {
    
    public RestaurantLunchMenu() {
        
        JFrame frame = new JFrame("Restaurant Menu for Lunch.");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 480);
        frame.getContentPane().setBackground(new Color(0xD8D8FF));
        frame.setVisible(true);

        JLabel label = new JLabel("You can take a look at the lunch menu.");
        label.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        label.setBounds(50, 20, 400, 30);
        frame.add(label);

        // here is a table creation.
        JTable Breakfastdata;
        String[][] data ={  {"sandwich", "24000", "1"},
                            {"salad", "26000", "1"},
                            {"soup", "24500", "1"},
                            {"wrap", "25500", "1"},
                            {"fruit", "23000", "1"},
                            {"yogurt", "27000", "1"},
                            {"pasta", "25000", "1"},
                            {"rice bowl", "25200", "1"},
                            {"roti", "24750", "2"},
                            {"dal", "23800", "1"},
                            {"sabzi", "24300", "1"},
                            {"curry", "24900", "1"},
                            {"biryani", "24800", "1"},
                            {"lassi", "25500", "1"}};

        String[] columnNames = {"Item","Price","Quantity"};
        Breakfastdata = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(Breakfastdata);
        scrollPane.setBounds(50, 60, 400, 150);

        frame.add(scrollPane);

        // adding a few images..
        ImageIcon image1 = new ImageIcon();
        ImageIcon image3 = new ImageIcon();

        image1 = new ImageIcon("soup.png");
        image3 = new ImageIcon("naan.png");

        JLabel imageLabel1 = new JLabel(image1);
        imageLabel1.setBounds(50, 220, 300,157);
        frame.add(imageLabel1);
        
        JLabel imageLabel3 = new JLabel(image3);
        imageLabel3.setBounds(350, 199, 250, 250);
        frame.add(imageLabel3);

    }

    public static void main(String[] args) {
        new RestaurantLunchMenu();
    }
} 
    

