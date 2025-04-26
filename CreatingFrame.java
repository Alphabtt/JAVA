import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);                                                                                  //If want to use without different classes, for that this quotationed code 
        frame.setSize(400,400);
        frame.setTitle("Sadman's Frame");

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\ragib\\Downloads\\logo.png");
               frame.setIconImage(imageIcon.getImage());
               frame.getContentPane().setBackground(new Color(0x123456));*/

        MyFrame myframe = new MyFrame();


    }
}

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame()
    {

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(400,400);
        this.setTitle("Sadman's this");

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\ragib\\Downloads\\logo.png");
        this.setIconImage(imageIcon.getImage());
        this.getContentPane().setBackground(new Color(0x123456));
    }


}

