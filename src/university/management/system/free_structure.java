package university.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class free_structure extends JFrame {

    free_structure() {
        super("FREE STRUCTURE PAGE");
        getContentPane().setBackground(new Color(230, 240, 255));
        JLabel heading = new JLabel("FREE STRUCTURE");
        heading.setForeground(new Color(0, 153, 153));
        heading.setBounds(350, 5, 400, 50);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 34));
        add(heading);

        JTable table = new JTable();
        table.setFont(new Font("Times New Roman", Font.BOLD, 15));
        try {
            database_connection connection = new database_connection();
            ResultSet resultSet = connection.statement.executeQuery("select  * from fee");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception r) {
            r.printStackTrace();
        }

        JScrollPane jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(0, 60, 1000, 700);
        // jScrollPane.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(jScrollPane);


        setSize(1000, 300);
        setLayout(null);
        setLocation(250, 50);
        setUndecorated(true);
        setVisible(true);
    }

    static void main(String[] args) {
        new free_structure();
    }
}
