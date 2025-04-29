import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\ragib\\Downloads\\Screenshot 2025-04-30 023104.png");

        JLabel label = new JLabel();
        label.setText("Like");
        label.setIcon(image);
        //label.setHorizontalAlignment(JLabel.CENTER);
        //label.setVerticalAlignment(JLabel.CENTER);
        label.setBounds(50,50,200,200);


        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0,0,250,250);
        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(250,0,250,250);
        JPanel yellowpanel = new JPanel();
        yellowpanel.setBackground(Color.YELLOW);
        yellowpanel.setBounds(0,250,500,250);
        greenpanel.setLayout(null);


        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(700,700);
        frame.setLayout(null);
        frame.add(redpanel);
        frame.add(greenpanel);
        frame.add(yellowpanel);
        greenpanel.add(label);

    }
}
