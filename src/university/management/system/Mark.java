package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mark extends JFrame implements ActionListener {
    String rollno;
    JButton cancal;

    Mark(String rollno) {
        super("DETAILS PAGE");
        this.rollno = rollno;
        getContentPane().setBackground(new Color(230, 240, 255));

        JLabel heading = new JLabel("Indian Institute of Technology ODISHA");
        heading.setBounds(40, 10, 500, 25);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel subheading = new JLabel("Result of Examination 2023");
        subheading.setBounds(100, 50, 500, 20);
        subheading.setFont(new Font("Tahoma", Font.BOLD, 18));
        subheading.setForeground(new Color(34, 139, 34));
        add(subheading);

        JLabel lblrollno = new JLabel("Roll Number " + rollno);
        lblrollno.setBounds(60, 100, 500, 20);
        lblrollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblrollno.setForeground(Color.green);

        add(lblrollno);

        JLabel lblsemester = new JLabel();
        lblsemester.setBounds(60, 130, 500, 20);
        lblsemester.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblsemester);

        JLabel sub1 = new JLabel();
        sub1.setBounds(100, 200, 500, 20);
        sub1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub1);

        JLabel sub2 = new JLabel();
        sub2.setBounds(100, 230, 500, 20);
        sub2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub2);

        JLabel sub3 = new JLabel();
        sub3.setBounds(100, 260, 500, 20);
        sub3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub3);

        JLabel sub4 = new JLabel();
        sub4.setBounds(100, 290, 500, 20);
        sub4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub4);

        JLabel sub5 = new JLabel();
        sub5.setBounds(100, 320, 500, 20);
        sub5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub5);

        try {
            database_connection c = new database_connection();

            ResultSet rs1 = c.statement.executeQuery("select * from subject where rollno = '" + rollno + "'");
            while (rs1.next()) {
                sub1.setText(rs1.getString("subj1"));
                sub2.setText(rs1.getString("subj2"));
                sub3.setText(rs1.getString("subj3"));
                sub4.setText(rs1.getString("subj4"));
                sub5.setText(rs1.getString("subj5"));
            }

            ResultSet rs2 = c.statement.executeQuery("select * from marks where rollno = '" + rollno + "'");
            while (rs2.next()) {
                sub1.setText(sub1.getText() + "===" + rs2.getString("mark1"));
                sub2.setText(sub2.getText() + "===" + rs2.getString("mark2"));
                sub3.setText(sub3.getText() + "===" + rs2.getString("mark3"));
                sub4.setText(sub4.getText() + "===" + rs2.getString("mark4"));
                sub5.setText(sub5.getText() + "===" + rs2.getString("mark5"));
                lblsemester.setText("Semester " + rs2.getString("semester"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        cancal = new JButton("CANCEL");
        cancal.setBounds(250, 400, 120, 30);
        cancal.addActionListener(this);
        cancal.setBackground(new Color(44, 62, 80));
        cancal.setForeground(Color.WHITE);
        cancal.setFont(new Font("Tahoma", Font.BOLD, 14));
        cancal.setFocusPainted(false);
        cancal.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 170), 2));
        cancal.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(cancal);


        setSize(500, 500);
        setLocation(500, 100);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new Mark("");
    }
}
