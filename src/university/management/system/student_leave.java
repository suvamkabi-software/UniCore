package university.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;

public class student_leave extends JFrame implements ActionListener {
    Choice choicerollno, choicetime;
    JDateChooser dateChooser;
    JButton sumit, cancel;

    student_leave() {
        super(" STUDENT   LEAVE   FORM");
        getContentPane().setBackground(new Color(210, 232, 252));

        JLabel heading = new JLabel("APPLY LEAVE (STUDENT)");
        heading.setBounds(40, 50, 350, 30);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 22));
        heading.setForeground(new Color(44, 62, 80));
        add(heading);

        JLabel rollno = new JLabel("SEARCH BY ROLL NUMBER");
        rollno.setBounds(40, 100, 250, 20);
        rollno.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(rollno);

        choicerollno = new Choice();
        choicerollno.setBounds(230, 130, 100, 100);
        choicerollno.setFont(new Font("Arial", Font.BOLD, 14));
        choicerollno.setBackground(Color.WHITE);
        add(choicerollno);


        try {
            database_connection conner = new database_connection();
            ResultSet resultSet = conner.statement.executeQuery("select  * from  student");
            while (resultSet.next()) {
                choicerollno.add(resultSet.getString("rollno"));
            }
        } catch (Exception l) {
            l.printStackTrace();
        }

        JLabel date = new JLabel("DATE");
        date.setBounds(60, 180, 200, 20);
        date.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(date);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(100, 210, 150, 25);
        dateChooser.setFont(new Font("Tahoma", Font.BOLD, 12));
        add(dateChooser);

        JLabel time = new JLabel("TIME DURATION");
        time.setBounds(60, 260, 300, 20);
        time.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(time);

        choicetime = new Choice();
        choicetime.setBounds(100, 290, 150, 20);
        choicetime.setFont(new Font("Arial", Font.BOLD, 14));
        choicetime.setBackground(Color.WHITE);
        choicetime.add("FULL DAY");
        choicetime.add("HALF DAY");
        add(choicetime);

        sumit = new JButton("CONFIRM");
        sumit.setBounds(60, 350, 100, 30);
        sumit.setBackground(new Color(40, 40, 40));
        sumit.setForeground(new Color(0, 255, 200));
        sumit.addActionListener(this);
        sumit.setFocusPainted(false);
        sumit.setBorderPainted(false);
        add(sumit);

        cancel = new JButton("RESET");
        cancel.setBounds(200, 350, 100, 30);
        cancel.setBackground(new Color(40, 40, 40));
        cancel.setForeground(new Color(0, 255, 200));
        cancel.addActionListener(this);
        cancel.setFocusPainted(false);
        cancel.setBorderPainted(false);
        add(cancel);


        setSize(500, 550);
        setLocation(550, 100);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sumit) {
            String rollno = choicerollno.getSelectedItem();
            String date = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String time = choicetime.getSelectedItem();

            String query = "insert into studentleave values('" + rollno + "','" + date + "','" + time + "')";
            try {
                database_connection conn1 = new database_connection();
                conn1.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "LEAVE CONFIRMED");
                //setVisible(false);
                System.exit(0);
            } catch (Exception i) {
                i.printStackTrace();
            }
        } else {
          setVisible(false);
        }
    }

    static void main(String[] args) {
        new student_leave();
    }
}
