package university.management.system;

import javax.swing.*;
import java.awt.*;

public class about extends JFrame {
    about() {
        super("ABOUT FORM");
        getContentPane().setBackground(new Color(235, 230, 250));
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/about.png"));
        Image i2 = i1.getImage().getScaledInstance(450, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(260, 10, 600, 300);
        add(image);


        JLabel heading = new JLabel("<html><center>Indian Institute of Technology<br>ODISHA</center></html>");
        heading.setBounds(25, 50, 350, 130);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 30));
        heading.setForeground(new Color(0, 51, 153));
        add(heading);


        JLabel name = new JLabel("SUVAM code");
        name.setBounds(280, 380, 550, 40);
        name.setFont(new Font("Courier New", Font.BOLD, 20));
        name.setForeground(new Color(0, 102, 204));
        add(name);

        JLabel content = new JLabel("github.com/suvamkabi-software");
        content.setBounds(200, 420, 550, 40);
        content.setForeground(new Color(36, 41, 46));
        content.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        add(content);


        setSize(700, 500);
        setLocation(400, 150);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    static void main(String[] args) {
        new about();
    }
}
