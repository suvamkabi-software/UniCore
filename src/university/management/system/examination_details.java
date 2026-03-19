package university.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.util.Random;

public class examination_details extends JFrame implements ActionListener {
    JTextField search;
    JButton result, back;
    JTable table;

    examination_details() {
        super("EXAM DETAILS FORM");
        getContentPane().setBackground(new Color(235, 230, 250));

        JLabel heading = new JLabel("CHECK RESULTS");
        heading.setBounds(350, 15, 400, 50);
        heading.setForeground(new Color(0, 153, 76));
        heading.setFont(new Font("Times New Roman", Font.BOLD, 28));
        add(heading);

        search = new JTextField();
        search.setBounds(80, 90, 200, 30);
        search.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(search);


        result = new JButton("RESULT");
        result.setBounds(300, 90, 120, 30);
        result.addActionListener(this);
        result.setBackground(new Color(44, 62, 80));
        result.setForeground(Color.WHITE);
        result.setFont(new Font("Tahoma", Font.BOLD, 15));
        result.setFocusPainted(false);
        result.setBorder(BorderFactory.createLineBorder(new Color(53, 58, 110), 2));
        result.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(result);


        back = new JButton("BACK");
        back.setBounds(440, 90, 120, 30);
        back.addActionListener(this);
        back.setBackground(new Color(44, 62, 80));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.setFocusPainted(false);
        back.setBorder(BorderFactory.createLineBorder(new Color(53, 58, 110), 2));
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(back);

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 130, 1000, 310);
        add(scrollPane);

        try {
            database_connection connection = new database_connection();
            ResultSet resultSet = connection.statement.executeQuery("select  * from student");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception l) {
            l.printStackTrace();
        }

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                search.setText(table.getModel().getValueAt(row, 2).toString());
            }
        });
        setSize(1000, 500);
        setLocation(300, 100);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == result) {
            setVisible(false);
            new Mark(search.getText());
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new examination_details();
    }
}
