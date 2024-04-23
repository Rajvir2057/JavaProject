import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RestaurantBreakfastMenu {
    
    public RestaurantBreakfastMenu() {
        
        JFrame frame = new JFrame("Restaurant Menu for Breakfast.");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 480);
        frame.getContentPane().setBackground(new Color(0xD8D8FF));
        frame.setVisible(true);

        JLabel label = new JLabel("You can take a look at the breakfast menu.");
        label.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        label.setBounds(50, 20, 400, 30);
        frame.add(label);

        // here is a table creation.
        JTable Breakfastdata;
        String[][] data ={{"sandwitch","5000","2_pieces"},
                          {"Chappati","2000","2_pieces"},
                          {"springroll","8000","3_pieces"},
                          {"cupcakes","2500","1_pieces"},
                          {"samosas","9000","2_pieces"},
                          {"cinamon rolls","3000","3_pieces"},
                          {"dora cakes","4000","2_pieces"},
                          {"apple_pies","10,000","4_pieces"},};

        String[] columnNames = {"Item","Price","Quantity"};
        Breakfastdata = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(Breakfastdata);
        scrollPane.setBounds(50, 60, 400, 150);

        frame.add(scrollPane);

        // adding a few images..
        ImageIcon image1 = new ImageIcon();
        ImageIcon image3 = new ImageIcon();

        image1 = new ImageIcon("sand.png");
        image3 = new ImageIcon("cup.png");

        JLabel imageLabel1 = new JLabel(image1);
        imageLabel1.setBounds(50, 220, 300,157);
        frame.add(imageLabel1);
        
        JLabel imageLabel3 = new JLabel(image3);
        imageLabel3.setBounds(350, 199, 250, 250);
        frame.add(imageLabel3);

        JButton back1 = new JButton("BACK");
        back1.setBounds(50, 400, 100, 30);
        frame.add(back1);

        JButton lunchButton = new JButton("L-Menu");
        lunchButton.setBounds(300, 400, 100, 30);
        frame.add(lunchButton);

        back1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource() == back1){
                    
                    new RajRestaurantHome();
                    
                }
            }
    
        });

        lunchButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource() == lunchButton){
                    
                    new RestaurantLunchMenu();
                    
                }
            }
    
        });

    }

    public static void main(String[] args) {
        new RestaurantBreakfastMenu();
    }
} 
    

