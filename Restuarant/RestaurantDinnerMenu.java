import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RestaurantDinnerMenu {
    
    public RestaurantDinnerMenu() {
        
        JFrame frame = new JFrame("Restaurant Menu for Dinner.");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 490);
        frame.getContentPane().setBackground(new Color(0xADD8E6));
        frame.setVisible(true);

        JLabel label = new JLabel("You can take a look at the breakfast menu.");
        label.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        label.setBounds(50, 20, 400, 30);
        frame.add(label);

        // here is a table creation.
        JTable Dinnerdata;
        String[][] data ={  {"burger", "28000", "1"},
                            {"steak", "32000", "1"},
                            {"soup", "22000", "1"},
                            {"grilled chicken", "26000", "1"},
                            {"pasta", "30000", "1"},
                            {"pizza", "27000", "1"},
                            {"stir-fry", "24000", "1"},
                            {"sushi", "35000", "1"},
                            {"rice bowl", "25000", "1"},
                            {"curry", "23000", "1"},
                            {"fried rice", "27000", "1"},
                            {"noodles", "23000", "1"},
                            {"salad", "20000", "1"},
                            {"dessert", "18000", "1"},};

        String[] columnNames = {"Item","Price","Quantity"};
        Dinnerdata = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(Dinnerdata);
        scrollPane.setBounds(50, 60, 400, 150);

        frame.add(scrollPane);

        // adding a few images..
        ImageIcon image1 = new ImageIcon();
        ImageIcon image3 = new ImageIcon();

        image1 = new ImageIcon("ham.png");
        image3 = new ImageIcon("ice.png");

        JLabel imageLabel1 = new JLabel(image1);
        imageLabel1.setBounds(50, 220, 250,167);
        frame.add(imageLabel1);
        
        JLabel imageLabel3 = new JLabel(image3);
        imageLabel3.setBounds(350, 199, 225, 175);
        frame.add(imageLabel3);

        JButton lunchButton = new JButton("L-Button");
        lunchButton.setBounds(170, 390, 110, 30);
        frame.add(lunchButton);

        JButton back2 = new JButton("Back-Home");
        back2.setBounds(170, 420, 110, 30);
        frame.add(back2);

        lunchButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new RestaurantLunchMenu();
            }
        });

        back2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new RajRestaurantHome();
            }
        });


    }

    public static void main(String[] args) {
        new RestaurantDinnerMenu();
    }
} 
    

