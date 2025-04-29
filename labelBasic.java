import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\ragib\\Downloads\\download.png");
        Border border = BorderFactory.createLineBorder(Color.RED,3);

        JLabel label = new JLabel();
        label.setText("This the logo for team Alphabet");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.RED); // text color
        label.setFont(new Font("Mv Boli",Font.BOLD,20));
        label.setIconTextGap(30); // to set the gap between logo and text
        label.setBackground(Color.BLACK); //to set background color
        label.setOpaque(true); //to display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100,100,200,200);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        //frame.setSize(500,500);
        frame.add(label);
        //frame.setLayout(null);
        frame.pack();//to set label automaticlly to with the size of the logo, Not extra boundaries
    }
}
