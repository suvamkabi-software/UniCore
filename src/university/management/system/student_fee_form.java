package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class student_fee_form extends JFrame implements ActionListener {
    Choice rollscroll;
    JComboBox courseBox, department1, semisterscreoll;
    JLabel totalamount;
    JButton pay, update, cancal;

    student_fee_form() {
        super("STUDENT FREE STRUCTURE PAGE");
        getContentPane().setBackground(new Color(230, 240, 255));
        JLabel heading = new JLabel("FREE STRUCTURE");
        heading.setForeground(new Color(0, 153, 153));
        heading.setBounds(300, 5, 400, 50);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 34));
        add(heading);

        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("image/fee.png"));
        Image image = icon1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(image);
        JLabel imageicon = new JLabel(icon2);
        imageicon.setBounds(400, 60, 470, 300);
        add(imageicon);

        JLabel rollnumber = new JLabel("SELECT ROLL NUMBER");
        rollnumber.setBounds(40, 60, 180, 20);
        rollnumber.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(rollnumber);

        rollscroll = new Choice();
        rollscroll.setBounds(230, 60, 100, 20);
        rollscroll.setFont(new Font("Tahoma", Font.BOLD, 12));
        add(rollscroll);

        try {
            database_connection connection = new database_connection();
            ResultSet resultSet = connection.statement.executeQuery("select * from student");
            while (resultSet.next()) {
                rollscroll.add(resultSet.getString("rollno"));
            }
        } catch (Exception h) {
            h.printStackTrace();
        }
        JLabel name = new JLabel("NAME");
        name.setBounds(40, 100, 150, 20);
        name.setForeground(new Color(0, 51, 153));
        name.setFont(new Font("Segoe UI", Font.BOLD, 15));
        add(name);

        JLabel textname = new JLabel();
        textname.setBounds(230, 100, 150, 20);
        textname.setFont(new Font("Tohoma", Font.BOLD, 15));
        add(textname);

        JLabel fname = new JLabel("FATHER NAME");
        fname.setBounds(40, 140, 150, 20);
        fname.setForeground(new Color(0, 51, 153));
        fname.setFont(new Font("Segoe UI", Font.BOLD, 15));
        add(fname);

        JLabel textfname = new JLabel();
        textfname.setBounds(230, 140, 150, 20);
        textfname.setFont(new Font("Tohoma", Font.BOLD, 15));
        add(textfname);

        try {
            database_connection connection1 = new database_connection();
            String query = "select * from student where rollno='" + rollscroll.getSelectedItem() + "'";
            ResultSet resultSet1 = connection1.statement.executeQuery(query);
            while (resultSet1.next()) {
                textname.setText(resultSet1.getString("name"));
                textfname.setText(resultSet1.getString("fname"));
            }
        } catch (Exception n) {
            n.printStackTrace();
        }

        rollscroll.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try {
                    database_connection connection1 = new database_connection();
                    String query = "select * from student where rollno='" + rollscroll.getSelectedItem() + "'";
                    ResultSet resultSet1 = connection1.statement.executeQuery(query);
                    while (resultSet1.next()) {
                        textname.setText(resultSet1.getString("name"));
                        textfname.setText(resultSet1.getString("fname"));
                    }
                } catch (Exception n) {
                    n.printStackTrace();
                }
            }
        });

        JLabel qualifaction = new JLabel("COURSE");
        qualifaction.setBounds(40, 180, 150, 20);
        qualifaction.setFont(new Font("Segoe UI", Font.BOLD, 15));
        qualifaction.setForeground(new Color(0, 51, 153));
        add(qualifaction);

        String course[] = {"BTech", "Bsc", "BCA", "MTech", "MSc", "Bcom", "Mcom"};
        courseBox = new JComboBox(course);
        courseBox.setBounds(180, 180, 150, 30);
        courseBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        courseBox.setBackground(new Color(245, 245, 245));
        courseBox.setForeground(Color.BLACK);
        add(courseBox);

        JLabel department = new JLabel("BRANCH");
        department.setBounds(40, 220, 150, 20);
        department.setFont(new Font("Segoe UI", Font.BOLD, 15));
        department.setForeground(new Color(0, 51, 153));
        add(department);

        String department12[] = {"CSE", "E&C", "MECHANICAL", "civil", "Information Technology", "AI/Machine Learning"};
        department1 = new JComboBox(department12);
        department1.setBounds(180, 220, 150, 30);
        department1.setFont(new Font("Tahoma", Font.BOLD, 14));
        department1.setBackground(new Color(245, 245, 245));
        department1.setForeground(Color.BLACK);
        add(department1);

        JLabel semister = new JLabel("SEMESTER");
        semister.setBounds(40, 260, 150, 20);
        semister.setFont(new Font("Segoe UI", Font.BOLD, 15));
        semister.setForeground(new Color(0, 51, 153));
        add(semister);

        String semister1[] = {"semester1", "semester2", "semester3", "semester4", "semester5", "semester6", "semester7", "semester8"};
        semisterscreoll = new JComboBox(semister1);
        semisterscreoll.setBounds(180, 260, 120, 20);
        semisterscreoll.setFont(new Font("Tahoma", Font.BOLD, 14));
        semisterscreoll.setBackground(new Color(245, 245, 245));
        semisterscreoll.setForeground(Color.BLACK);
        add(semisterscreoll);

        JLabel total = new JLabel("TOTAL PAYABLE");
        total.setBounds(40, 300, 150, 20);
        total.setFont(new Font("Segoe UI", Font.BOLD, 15));
        total.setForeground(new Color(0, 51, 153));
        add(total);

        totalamount = new JLabel();
        totalamount.setBounds(210, 300, 150, 20);
        totalamount.setFont(new Font("Tohoma", Font.BOLD, 15));
        add(totalamount);


        update = new JButton("UPDATE");
        update.setBounds(150, 380, 100, 25);
        update.setBackground(new Color(40, 40, 40));
        update.setForeground(new Color(0, 255, 200));
        update.addActionListener(this);
        update.setFocusPainted(false);
        update.setBorderPainted(false);
        add(update);


        pay = new JButton("PAY");
        pay.setBounds(300, 380, 100, 25);
        pay.setBackground(new Color(40, 40, 40));
        pay.setForeground(new Color(0, 255, 200));
        pay.addActionListener(this);
        pay.setFocusPainted(false);
        pay.setBorderPainted(false);
        add(pay);


        cancal = new JButton("CANCEL");
        cancal.setBounds(450, 380, 100, 25);
        cancal.setBackground(new Color(40, 40, 40));
        cancal.setForeground(new Color(0, 255, 200));
        cancal.addActionListener(this);
        cancal.setFocusPainted(false);
        cancal.setBorderPainted(false);
        add(cancal);

        setSize(890, 500);
        setLayout(null);
        setLocation(300, 100);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == update) {
            String course = (String) courseBox.getSelectedItem();
            String semester = (String) semisterscreoll.getSelectedItem();
            try {
                database_connection connection = new database_connection();
                ResultSet resultSet = connection.statement.executeQuery("select  * from fee where course='" + course + "'");
                while (resultSet.next()) {
                    totalamount.setText(resultSet.getString(semester));
                }
            } catch (Exception error) {
                error.printStackTrace();
            }
        } else if (e.getSource() == pay) {
            String rollno = rollscroll.getSelectedItem();
            String cousre = (String) courseBox.getSelectedItem();
            String semester = (String) semisterscreoll.getSelectedItem();
            String branch = (String) department1.getSelectedItem();
            String total = totalamount.getText();
            try {
                database_connection connection = new database_connection();
                String query = "insert into feeecollege values('" + rollno + "','" + cousre + "','" + branch + "','" + semester + "','" + total + "')";
                connection.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "FEE SUBMITTED SUCCESSFULLY");
            } catch (Exception b) {
                b.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new student_fee_form();
    }
}
