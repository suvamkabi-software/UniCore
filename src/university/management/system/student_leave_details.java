package university.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class student_leave_details extends JFrame implements ActionListener {

    JTable table;
    JButton search, cancal, print;
    Choice choicerollno;

    student_leave_details() {
        super("STUDENT LEAVE DETAILS FORM");
        getContentPane().setBackground(new Color(235, 230, 250));
        JLabel heading = new JLabel("SEARCH BY ROLL NO.");
        heading.setBounds(70, 20, 160, 20);
        add(heading);

        choicerollno = new Choice();
        choicerollno.setBounds(230, 20, 100, 20);
        choicerollno.setFont(new Font("Arial", Font.BOLD, 14));
        choicerollno.setBackground(Color.WHITE);
        add(choicerollno);

        try {

            database_connection touch = new database_connection();
            ResultSet resultSet = touch.statement.executeQuery("select * from  student");
            while (resultSet.next()) {
                choicerollno.add(resultSet.getString("rollno"));
            }
        } catch (Exception k) {
            k.printStackTrace();
        }

        table = new JTable();
        try {
            database_connection c = new database_connection();
            ResultSet resultSet = c.statement.executeQuery("select * from studentleave");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception err) {
            err.printStackTrace();
        }

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 100, 900, 600);
        add(scrollPane);

        search = new JButton("SEARCH");
        search.setBounds(20, 60, 90, 30);
        search.addActionListener(this);
        search.setBackground(new Color(143, 13, 87));
        search.setForeground(Color.WHITE);
        search.setFont(new Font("Tahoma", Font.BOLD, 14));
        search.setFocusPainted(false);
        search.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 170), 2));
        search.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(search);

        print = new JButton("PRINT");
        print.setBounds(125, 60, 90, 30);
        print.addActionListener(this);
        print.setBackground(new Color(143, 13, 87));
        print.setForeground(Color.WHITE);
        print.setFont(new Font("Tahoma", Font.BOLD, 14));
        print.setFocusPainted(false);
        print.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 170), 2));
        print.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(print);

        cancal = new JButton("CANCEL");
        cancal.setBounds(230, 60, 90, 30);
        cancal.addActionListener(this);
        cancal.setBackground(new Color(143, 13, 87));
        cancal.setForeground(Color.WHITE);
        cancal.setFont(new Font("Tahoma", Font.BOLD, 14));
        cancal.setFocusPainted(false);
        cancal.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 170), 2));
        cancal.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(cancal);


        setSize(900, 700);
        setLocation(300, 100);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search) {
            String query = "select * from studentleave where rollno= '" + choicerollno.getSelectedItem() + "'";
            try {
                database_connection connection = new database_connection();
                ResultSet resultSet = connection.statement.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            } catch (Exception m) {
                m.printStackTrace();
            }

        } else if (e.getSource() == print) {
            try {
                table.print();
            } catch (Exception b) {
                b.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    static void main(String[] args) {
        new student_leave_details();
    }
}
