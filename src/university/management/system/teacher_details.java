package university.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class teacher_details extends JFrame implements ActionListener {

    Choice choice;
    JTable table;
    JButton search, print, update, add, cancal;


    teacher_details() {
        super("TEACHER DETAILS FORM");

        getContentPane().setBackground(new Color(235, 230, 250));
        JLabel heading = new JLabel("SEARCH BY EMPLOYEE ID");
        heading.setBounds(20, 20, 170, 20);
        add(heading);

        choice = new Choice();
        choice.setBounds(190, 20, 100, 20);
        choice.setFont(new Font("Arial", Font.BOLD, 14));
        choice.setBackground(Color.WHITE);
        add(choice);

        try {
            database_connection connecter = new database_connection();
            ResultSet resultSet = connecter.statement.executeQuery("select * from teacher");
            while (resultSet.next()) {
                choice.add(resultSet.getString("empID"));
            }
        } catch (Exception c) {
            c.printStackTrace();
        }

        table = new JTable();
        try {
            database_connection conn = new database_connection();
            ResultSet resultSet = conn.statement.executeQuery("select * from teacher");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception a) {

            a.printStackTrace();

        }

        JScrollPane js = new JScrollPane(table);
        js.setBounds(0, 100, 1300, 600);
        add(js);


        search = new JButton("SEARCH");
        search.setBounds(20, 60, 90, 30);
        search.addActionListener(this);
        search.setBackground(new Color(46, 204, 113));
        search.setForeground(Color.WHITE);
        search.setFont(new Font("Tahoma", Font.BOLD, 14));
        search.setFocusPainted(false);
        search.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 170), 2));
        search.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(search);

        print = new JButton("PRINT");
        print.setBounds(120, 60, 90, 30);
        print.addActionListener(this);
        print.setBackground(new Color(46, 204, 113));
        print.setForeground(Color.WHITE);
        print.setFont(new Font("Tahoma", Font.BOLD, 14));
        print.setFocusPainted(false);
        print.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 170), 2));
        print.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(print);

        add = new JButton("ADD");
        add.setBounds(220, 60, 90, 30);
        add.addActionListener(this);
        add.setBackground(new Color(46, 204, 113));
        add.setForeground(Color.WHITE);
        add.setFont(new Font("Tahoma", Font.BOLD, 14));
        add.setFocusPainted(false);
        add.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 170), 2));
        add.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(add);

        update = new JButton("UPDATE");
        update.setBounds(320, 60, 90, 30);
        update.addActionListener(this);
        update.setBackground(new Color(46, 204, 113));
        update.setForeground(Color.WHITE);
        update.setFont(new Font("Tahoma", Font.BOLD, 14));
        update.setFocusPainted(false);
        update.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 170), 2));
        update.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(update);

        cancal = new JButton("CANCEL");
        cancal.setBounds(420, 60, 90, 30);
        cancal.addActionListener(this);
        cancal.setBackground(new Color(46, 204, 113));
        cancal.setForeground(Color.WHITE);
        cancal.setFont(new Font("Tahoma", Font.BOLD, 14));
        cancal.setFocusPainted(false);
        cancal.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 170), 2));
        cancal.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(cancal);


        setSize(1300, 700);
        setLayout(null);
        setLocation(150, 100);
        setUndecorated(true);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search) {
            String query = "select * from teacher where empID ='" + choice.getSelectedItem() + "'";
            try {
                database_connection conne = new database_connection();
                ResultSet resultSet = conne.statement.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            } catch (Exception err) {
                err.printStackTrace();
            }
        } else if (e.getSource() == print) {
            try {
                table.print();
            } catch (Exception t) {
                t.printStackTrace();
            }
        } else if (e.getSource() == add) {
            setVisible(false);
            new Add_teacher();
        } else if (e.getSource() == update) {

        } else {

            setVisible(false);
        }

    }


    public static void main(String[] args) {
        new teacher_details();
    }
}
