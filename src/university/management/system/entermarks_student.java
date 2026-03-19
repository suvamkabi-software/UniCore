package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Random;

public class entermarks_student extends JFrame implements ActionListener {
    JComboBox comboBox;
    Choice choicerollno;
    JButton sumit, cancal;
    JTextField subject1, subject2, sub3, sub4, sub5, marks1, marks2, marks3, marks4, marks5;

    entermarks_student() {
        super("STUDENT MARKS DETAILS FORM");
        getContentPane().setBackground(new Color(235, 230, 250));

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("image/exam.png"));
        Image image1 = image.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(image1);
        JLabel labelimage = new JLabel(imageIcon);
        labelimage.setBounds(500, 40, 400, 300);
        add(labelimage);

        JLabel heading = new JLabel("ENTER MARKS OF STUDENT");
        heading.setBounds(50, 0, 500, 50);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 25));
        heading.setForeground(new Color(0, 102, 204));
        add(heading);

        JLabel rollno = new JLabel("SELECT ROLL NUMBER");
        rollno.setBounds(50, 70, 200, 20);
        rollno.setFont(new Font("Arial", Font.BOLD, 15));
        rollno.setForeground(new Color(255, 94, 77));
        add(rollno);

        choicerollno = new Choice();
        choicerollno.setBounds(250, 70, 100, 20);
        choicerollno.setFont(new Font("Arial", Font.BOLD, 14));
        choicerollno.setBackground(Color.WHITE);
        add(choicerollno);

        try {
            database_connection connection = new database_connection();
            ResultSet resultSet = connection.statement.executeQuery("select  * from  student");
            while (resultSet.next()) {
                choicerollno.add(resultSet.getString("rollno"));
            }
        } catch (Exception err) {
            err.printStackTrace();
        }

        JLabel sem = new JLabel("SELECT  SEMESTER");
        sem.setForeground(new Color(255, 94, 77));
        sem.setFont(new Font("Arial", Font.BOLD, 15));
        sem.setBounds(50, 110, 200, 20);
        add(sem);
        String semester[] = {"1 semester", "2 semester", "3 semester", "4 semester"
                , "5 semester", "6 semester", "7 semester", "8 semester"};
        comboBox = new JComboBox(semester);
        comboBox.setFont(new Font("Arial", Font.BOLD, 14));
        comboBox.setBounds(250, 110, 110, 20);
        add(comboBox);

        JLabel entersub = new JLabel("ENTER SUBJECT");
        entersub.setBounds(80, 150, 200, 40);
        entersub.setFont(new Font("Segoe UI", Font.BOLD, 10));
        add(entersub);

        subject1 = new JTextField();
        subject1.setBounds(50, 200, 150, 20);
        add(subject1);

        subject2 = new JTextField();
        subject2.setBounds(50, 230, 150, 20);
        add(subject2);

        sub3 = new JTextField();
        sub3.setBounds(50, 260, 150, 20);
        add(sub3);

        sub4 = new JTextField();
        sub4.setBounds(50, 290, 150, 20);
        add(sub4);

        sub5 = new JTextField();
        sub5.setBounds(50, 320, 150, 20);
        add(sub5);


        JLabel enterMarks = new JLabel("ENTER MARKS  ");
        enterMarks.setBounds(280, 150, 200, 40);
        enterMarks.setFont(new Font("Segoe UI", Font.BOLD, 10));
        add(enterMarks);


        marks1 = new JTextField();
        marks1.setBounds(250, 200, 150, 20);
        add(marks1);

        marks2 = new JTextField();
        marks2.setBounds(250, 230, 150, 20);
        add(marks2);

        marks3 = new JTextField();
        marks3.setBounds(250, 260, 150, 20);
        add(marks3);

        marks4 = new JTextField();
        marks4.setBounds(250, 290, 150, 20);
        add(marks4);

        marks5 = new JTextField();
        marks5.setBounds(250, 320, 150, 20);
        add(marks5);

        sumit = new JButton("SUMIT");
        sumit.setBounds(110, 370, 100, 30);
        sumit.addActionListener(this);
        sumit.setBackground(new Color(44, 62, 80));
        sumit.setForeground(Color.WHITE);
        sumit.setFont(new Font("Tahoma", Font.BOLD, 15));
        sumit.setFocusPainted(false);
        sumit.setBorder(BorderFactory.createLineBorder(new Color(53, 58, 110), 2));
        sumit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(sumit);

        cancal = new JButton("CANCEL");
        cancal.setBounds(250, 370, 100, 30);
        cancal.addActionListener(this);
        cancal.setBackground(new Color(44, 62, 80));
        cancal.setForeground(Color.WHITE);
        cancal.setFont(new Font("Tahoma", Font.BOLD, 15));
        cancal.setFocusPainted(false);
        cancal.setBorder(BorderFactory.createLineBorder(new Color(53, 58, 110), 2));
        cancal.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(cancal);


        setSize(1000, 500);
        setLayout(null);
        setLocation(300, 150);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sumit) {
            try {
                database_connection connection = new database_connection();
                String query = "insert into subject values ('" + choicerollno.getSelectedItem() + "','" + comboBox.getSelectedItem() + "','" + subject1.getText() + "','" + subject2.getText() + "','" + sub3.getText() + "','" + sub4.getText() + "','" + sub5.getText() + "')";
                String query1 = "insert into marks values ('" + choicerollno.getSelectedItem() + "','" + comboBox.getSelectedItem() + "','" + marks1.getText() + "','" + marks2.getText() + "','" + marks3.getText() + "','" + marks4.getText() + "','" + marks5.getText() + "')";
                connection.statement.executeUpdate(query);
                connection.statement.executeUpdate(query1);
                JOptionPane.showMessageDialog(null, "INSERTED DATA SUCCESSFULLY");
                setVisible(false);
            } catch (Exception o) {
                o.printStackTrace();
            }
        } else {
            setVisible(false);
        }

    }

    static void main(String[] args) {
        new entermarks_student();
    }
}
