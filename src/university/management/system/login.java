package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JTextField textfiledname;
    JPasswordField passwordfield;
    JButton login, back;

    login() {
        super("University Login Portal");
        JLabel labelname = new JLabel("Username");
        labelname.setBounds(40, 20, 100, 20);
        labelname.setForeground(new Color(0, 255, 200));
        labelname.setFont(new Font("Segoe UI", Font.BOLD, 16));
        add(labelname);

        textfiledname = new JTextField();
        textfiledname.setBounds(150, 20, 150, 20);
        textfiledname.setFont(new Font("Segoe UI", Font.BOLD, 13));
        add(textfiledname);

        JLabel labelpass = new JLabel("Password");
        labelpass.setForeground(new Color(0, 255, 200)); // Neon cyan
        labelpass.setFont(new Font("Segoe UI", Font.BOLD, 16));
        labelpass.setBounds(40, 70, 100, 20);
        add(labelpass);

        passwordfield = new JPasswordField();
        passwordfield.setBounds(150, 70, 150, 20);
        add(passwordfield);

        login = new JButton("ACCESS");
        login.setBounds(60, 140, 100, 30);
        login.setBackground(new Color(40, 40, 40));
        login.setForeground(new Color(0, 255, 200));
        login.addActionListener(this);
        login.setFocusPainted(false);
        login.setBorderPainted(false);
        add(login);
        back = new JButton("GO BACK");
        back.setBounds(220, 140, 100, 30);
        back.setBackground(new Color(40, 40, 40));
        back.setForeground(new Color(0, 255, 200));
        back.addActionListener(this);
        back.setFocusPainted(false);
        back.setBorderPainted(false);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/second.png"));
        Image i2 = i1.getImage().getScaledInstance(180, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(350, 10, 230, 200);
        add(img);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("image/loginback.png"));
        Image i22 = i11.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel image = new JLabel(i33);
        image.setBounds(0, 0, 600, 300);
        add(image);


        setSize(600, 300);
        setLocation(500, 250);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String username = textfiledname.getText();
            String password = passwordfield.getText();
            String quary = "select * from login where username='" + username + "' and  password = '" + password + "'";
            try {
                database_connection con = new database_connection();
                ResultSet resultSet = con.statement.executeQuery(quary);
                if (resultSet.next()) {
                    setVisible(false);
                    new main_class();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
            } catch (Exception o) {
                o.printStackTrace();
            }
        } else {
            //  setVisible(false);
            System.exit(0);


        }
    }

    public static void main(String[] args) {
        new login();
    }
}
