package university.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class update_teacher extends JFrame implements ActionListener {
    JTextField textaddress, textphone, emailno, textaddhar, textcourse, textbranch;
    JLabel emptext;
    Choice cempid;
    JButton update, cancal;

    update_teacher() {
        super("UPDATE DETAILS PAGE");
        getContentPane().setBackground(new Color(230, 240, 255));
        JLabel heading = new JLabel("UPDATE TEACHER DETAILS");
        heading.setForeground(new Color(101, 18, 199));
        heading.setBounds(50, 30, 500, 50);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(heading);

        JLabel empid = new JLabel("SELECT EMPLOYEE ID");
        empid.setBounds(50, 100, 270, 30);
        empid.setFont(new Font("serif", Font.PLAIN, 25));
        add(empid);

        cempid = new Choice();
        cempid.setBounds(320, 105, 100, 20);
        add(cempid);

        try {
            database_connection connection = new database_connection();
            ResultSet resultSet = connection.statement.executeQuery("select  * from teacher");
            while (resultSet.next()) {
                cempid.add(resultSet.getString("empid"));
            }
        } catch (Exception p) {
            p.printStackTrace();

        }


        JLabel name = new JLabel("NAME");
        name.setBounds(50, 150, 100, 30);
        name.setFont(new Font("Segoe UI", Font.BOLD, 20));
        name.setForeground(new Color(0, 51, 153));
        add(name);

        JLabel textname = new JLabel();
        textname.setBounds(200, 150, 150, 30);
        textname.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        add(textname);


        JLabel father_name = new JLabel("FATHER NAME");
        father_name.setBounds(450, 150, 200, 30);
        father_name.setFont(new Font("Segoe UI", Font.BOLD, 20));
        father_name.setForeground(new Color(0, 51, 153));
        add(father_name);

        JLabel textfather = new JLabel();
        textfather.setBounds(650, 150, 150, 30);
        textfather.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        add(textfather);


        JLabel empid1 = new JLabel("EMPLOYEE ID");
        empid1.setBounds(50, 200, 200, 30);
        empid1.setFont(new Font("Segoe UI", Font.BOLD, 20));
        empid1.setForeground(new Color(0, 51, 153));
        add(empid1);

        emptext = new JLabel();
        emptext.setBounds(200, 200, 200, 30);
        emptext.setFont(new Font("Segoe UI", Font.BOLD, 20));
        add(emptext);


        JLabel dob = new JLabel("DATH OF BIRTH");
        dob.setBounds(450, 200, 200, 30);
        dob.setFont(new Font("Segoe UI", Font.BOLD, 20));
        dob.setForeground(new Color(0, 51, 153));
        add(dob);


        JLabel birth = new JLabel();
        birth.setBounds(650, 200, 150, 30);
        birth.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        add(birth);


        JLabel address = new JLabel("ADDRESS");
        address.setBounds(50, 250, 200, 30);
        address.setFont(new Font("Segoe UI", Font.BOLD, 20));
        address.setForeground(new Color(0, 51, 153));
        add(address);

        textaddress = new JTextField();
        textaddress.setBounds(200, 250, 200, 30);
        textaddress.setBorder(null);
        textaddress.setBackground(new Color(240, 240, 240));
        textaddress.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        add(textaddress);


        JLabel phone = new JLabel("PHONE");
        phone.setBounds(450, 250, 200, 30);
        phone.setFont(new Font("Segoe UI", Font.BOLD, 20));
        phone.setForeground(new Color(0, 51, 153));
        add(phone);

        textphone = new JTextField();
        textphone.setBounds(630, 250, 200, 30);
        textphone.setBorder(null);
        textphone.setBackground(new Color(240, 240, 240));
        textphone.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        add(textphone);


        JLabel email = new JLabel("EMAIL");
        email.setBounds(50, 300, 200, 30);
        email.setFont(new Font("Segoe UI", Font.BOLD, 20));
        email.setForeground(new Color(0, 51, 153));
        add(email);

        emailno = new JTextField();
        emailno.setBounds(200, 300, 210, 30);
        emailno.setBorder(null);
        emailno.setBackground(new Color(240, 240, 240));
        emailno.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(emailno);

        JLabel c10 = new JLabel("CLASS  X (%)");
        c10.setBounds(450, 300, 200, 30);
        c10.setFont(new Font("Segoe UI", Font.BOLD, 20));
        c10.setForeground(new Color(0, 51, 153));
        add(c10);

        JLabel textm10 = new JLabel();
        textm10.setBounds(650, 300, 150, 30);
        textm10.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        add(textm10);


        JLabel c12 = new JLabel("CLASS  XII (%)");
        c12.setBounds(50, 350, 200, 30);
        c12.setFont(new Font("Segoe UI", Font.BOLD, 20));
        c12.setForeground(new Color(0, 51, 153));
        add(c12);

        JLabel textm12 = new JLabel();
        textm12.setBounds(270, 350, 150, 30);
        textm12.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        add(textm12);


        JLabel addhar = new JLabel("AADHAAR NO");
        addhar.setBounds(450, 350, 200, 30);
        addhar.setFont(new Font("Segoe UI", Font.BOLD, 20));
        addhar.setForeground(new Color(0, 51, 153));
        add(addhar);

        JLabel textaddhar = new JLabel();
        textaddhar.setBounds(630, 350, 200, 30);
        textaddhar.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        add(textaddhar);


        JLabel qualifaction = new JLabel("QUALIFICATION");
        qualifaction.setBounds(50, 400, 200, 30);
        qualifaction.setFont(new Font("Segoe UI", Font.BOLD, 20));
        qualifaction.setForeground(new Color(0, 51, 153));
        add(qualifaction);

        textcourse = new JTextField();
        textcourse.setBounds(220, 400, 170, 30);
        textcourse.setBorder(null);
        textcourse.setBackground(new Color(240, 240, 240));
        textcourse.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        add(textcourse);


        JLabel department = new JLabel("DEPARTMENT");
        department.setBounds(450, 400, 200, 30);
        department.setFont(new Font("Segoe UI", Font.BOLD, 20));
        department.setForeground(new Color(0, 51, 153));
        add(department);

        textbranch = new JTextField();
        textbranch.setBounds(630, 400, 200, 30);
        textbranch.setBorder(null);
        textbranch.setBackground(new Color(240, 240, 240));
        textbranch.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(textbranch);

        try {
            database_connection connection1 = new database_connection();
            String query = "select  * from teacher where empid='" + cempid.getSelectedItem() + "'";
            ResultSet resultSet = connection1.statement.executeQuery(query);
            while (resultSet.next()) {
                textname.setText(resultSet.getString("name"));
                textfather.setText(resultSet.getString("fname"));
                birth.setText(resultSet.getString("dob"));
                textaddress.setText(resultSet.getString("address"));
                textphone.setText(resultSet.getString("phone"));
                emailno.setText(resultSet.getString("email"));
                textm10.setText(resultSet.getString("class_X"));
                textm12.setText(resultSet.getString("class_Xii"));
                textaddhar.setText(resultSet.getString("aadhar"));
                emptext.setText(resultSet.getString("empid"));
                textcourse.setText(resultSet.getString("education"));
                textbranch.setText(resultSet.getString("department"));
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
        cempid.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try {
                    database_connection connection1 = new database_connection();
                    String query = "select  * from teacher where empid='" + cempid.getSelectedItem() + "'";
                    ResultSet resultSet = connection1.statement.executeQuery(query);
                    while (resultSet.next()) {
                        textname.setText(resultSet.getString("name"));
                        textfather.setText(resultSet.getString("fname"));
                        birth.setText(resultSet.getString("dob"));
                        textaddress.setText(resultSet.getString("address"));
                        textphone.setText(resultSet.getString("phone"));
                        emailno.setText(resultSet.getString("email"));
                        textm10.setText(resultSet.getString("class_X"));
                        textm12.setText(resultSet.getString("class_Xii"));
                        textaddhar.setText(resultSet.getString("aadhar"));
                        emptext.setText(resultSet.getString("empid"));
                        textcourse.setText(resultSet.getString("education"));
                        textbranch.setText(resultSet.getString("department"));
                    }
                } catch (Exception k) {
                    k.printStackTrace();
                }
            }
        });

        cancal = new JButton("CANCEL");
        cancal.setBounds(150, 510, 120, 30);
        cancal.setBackground(new Color(40, 40, 40));
        cancal.setForeground(new Color(0, 255, 200));
        cancal.addActionListener(this);
        cancal.setFocusPainted(false);
        cancal.setBorderPainted(false);
        add(cancal);


        update = new JButton("UPDATE");
        update.setBounds(320, 510, 120, 30);
        update.setBackground(new Color(40, 40, 40));
        update.setForeground(new Color(0, 255, 200));
        update.addActionListener(this);
        update.setFocusPainted(false);
        update.setBorderPainted(false);
        add(update);

        setSize(860, 600);
        setLocation(350, 50);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == update) {
            String empid = emptext.getText();
            String address = textaddress.getText();
            String phone = textphone.getText();
            String email = emailno.getText();
            String course = textcourse.getText();
            String branch = textbranch.getText();
            try {
                String query = "update teacher set address ='" + address + "',phone='" + phone + "',email='" + email + "',education='" + course + "',department='" + branch + "' where empid ='" + empid + "'";
                database_connection connection = new database_connection();
                connection.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULLY");
                setVisible(false);
            } catch (Exception h) {
                h.printStackTrace();
            }
        } else {
            setVisible(false);
        }

    }

    static void main(String[] args) {
        new update_teacher();
    }
}
