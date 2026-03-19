package university.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Add_student extends JFrame implements ActionListener {
    JTextField textname, ftextfiled, textaddress, textphone, emailno, textc10, textc12, textaddhar;
    JLabel emptext;
    JDateChooser dobath;
    JComboBox courseBox, department1;
    JButton sumbit, cancal;

    Random ran = new Random();
    long f4 = Math.abs((ran.nextLong() % 9000L) + 1000L);

    Add_student() {
        super("STUDENT DETAILS PAGE");
        getContentPane().setBackground(new Color(230, 240, 255));
        JLabel heading = new JLabel("NEW STUDENT DETAILS");
        heading.setForeground(new Color(0, 153, 153));
        heading.setBounds(240, 30, 600, 50);
        heading.setFont(new Font("Calibri", Font.BOLD, 34));
        add(heading);
        JSeparator line = new JSeparator();
        line.setBounds(210, 70, 390, 3);
        line.setForeground(new Color(25, 55, 109));
        add(line);

        JLabel name = new JLabel("NAME");
        name.setBounds(50, 150, 100, 30);
        name.setFont(new Font("Segoe UI", Font.BOLD, 20));
        name.setForeground(new Color(0, 51, 153));
        add(name);

        textname = new JTextField();
        textname.setBounds(200, 150, 200, 30);
        textname.setBorder(null);
        textname.setBackground(new Color(240, 240, 240));
        textname.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(textname);


        JLabel father_name = new JLabel("FATHER NAME");
        father_name.setBounds(450, 150, 200, 30);
        father_name.setFont(new Font("Segoe UI", Font.BOLD, 20));
        father_name.setForeground(new Color(0, 51, 153));
        add(father_name);

        ftextfiled = new JTextField();
        ftextfiled.setBounds(630, 150, 200, 30);
        ftextfiled.setBorder(null);
        ftextfiled.setBackground(new Color(240, 240, 240));
        ftextfiled.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(ftextfiled);


        JLabel rollNo = new JLabel("ROLL NO");
        rollNo.setBounds(50, 200, 200, 30);
        rollNo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        rollNo.setForeground(new Color(0, 51, 153));
        add(rollNo);

        emptext = new JLabel("2207" + f4);
        emptext.setBounds(200, 200, 200, 30);
        emptext.setFont(new Font("Segoe UI", Font.BOLD, 20));
        add(emptext);


        JLabel dob = new JLabel("DEATH OF BIRTH");
        dob.setBounds(450, 200, 200, 30);
        dob.setFont(new Font("Segoe UI", Font.BOLD, 20));
        dob.setForeground(new Color(0, 51, 153));
        add(dob);


        dobath = new JDateChooser();
        dobath.setBounds(630, 200, 150, 30);
        add(dobath);


        JLabel address = new JLabel("ADDRESS");
        address.setBounds(50, 250, 200, 30);
        address.setFont(new Font("Segoe UI", Font.BOLD, 20));
        address.setForeground(new Color(0, 51, 153));
        add(address);

        textaddress = new JTextField();
        textaddress.setBounds(200, 250, 200, 30);
        textaddress.setBorder(null);
        textaddress.setBackground(new Color(240, 240, 240));
        textaddress.setFont(new Font("Segoe UI", Font.PLAIN, 16));
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
        textphone.setFont(new Font("Segoe UI", Font.PLAIN, 16));
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

        textc10 = new JTextField();
        textc10.setBounds(630, 300, 200, 30);
        textc10.setBorder(null);
        textc10.setBackground(new Color(240, 240, 240));
        textc10.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(textc10);


        JLabel c12 = new JLabel("CLASS  XII (%)");
        c12.setBounds(50, 350, 200, 30);
        c12.setFont(new Font("Segoe UI", Font.BOLD, 20));
        c12.setForeground(new Color(0, 51, 153));
        add(c12);

        textc12 = new JTextField();
        textc12.setBounds(210, 350, 200, 30);
        textc12.setBorder(null);
        textc12.setBackground(new Color(240, 240, 240));
        textc12.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(textc12);


        JLabel addhar = new JLabel("AADHAAR NO");
        addhar.setBounds(450, 350, 200, 30);
        addhar.setFont(new Font("Segoe UI", Font.BOLD, 20));
        addhar.setForeground(new Color(0, 51, 153));
        add(addhar);

        textaddhar = new JTextField();
        textaddhar.setBounds(630, 350, 200, 30);
        textaddhar.setBorder(null);
        textaddhar.setBackground(new Color(240, 240, 240));
        textaddhar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        add(textaddhar);


        JLabel department = new JLabel("BRANCH");
        department.setBounds(50, 400, 200, 30);
        department.setFont(new Font("Segoe UI", Font.BOLD, 20));
        department.setForeground(new Color(0, 51, 153));
        add(department);

        String department12[] = {"Computer Science Engineering", "Electronics & Communication", "MECHANICAL", "civil", "Information Technology", "AI/Machine Learning"};
        department1 = new JComboBox(department12);
        department1.setBounds(190, 400, 230, 35);
        department1.setFont(new Font("Tahoma", Font.BOLD, 14));
        department1.setBackground(new Color(245, 245, 245));
        department1.setForeground(Color.BLACK);
        add(department1);

        JLabel qualifaction = new JLabel("COURSE");
        qualifaction.setBounds(450, 400, 200, 30);
        qualifaction.setFont(new Font("Segoe UI", Font.BOLD, 20));
        qualifaction.setForeground(new Color(0, 51, 153));
        add(qualifaction);

        String course[] = {"BTech", "Bsc", "MTech", "BCA", "MBA", "Mcom", "Mcom", "Msc", "BA"};
        courseBox = new JComboBox(course);
        courseBox.setBounds(630, 400, 100, 35);
        courseBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        courseBox.setBackground(new Color(245, 245, 245));
        courseBox.setForeground(Color.BLACK);
        add(courseBox);


        cancal = new JButton("CANCEL");
        cancal.setBounds(150, 510, 120, 30);
        cancal.setBackground(new Color(40, 40, 40));
        cancal.setForeground(new Color(0, 255, 200));
        cancal.addActionListener(this);
        cancal.setFocusPainted(false);
        cancal.setBorderPainted(false);
        add(cancal);


        sumbit = new JButton("SUMIT");
        sumbit.setBounds(320, 510, 120, 30);
        sumbit.setBackground(new Color(40, 40, 40));
        sumbit.setForeground(new Color(0, 255, 200));
        sumbit.addActionListener(this);
        sumbit.setFocusPainted(false);
        sumbit.setBorderPainted(false);
        add(sumbit);

        setSize(860, 600);
        setLocation(350, 50);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sumbit) {
            String name = textname.getText();
            String fname = ftextfiled.getText();
            String rollno = emptext.getText();
            String dob = ((JTextField) dobath.getDateEditor().getUiComponent()).getText();
            String address = textaddress.getText();
            String phone = textphone.getText();
            String email = emailno.getText();
            String x = textc10.getText();
            String xii = textc12.getText();
            String aadhar = textaddhar.getText();
            String branch = (String) department1.getSelectedItem();
            String course = (String) courseBox.getSelectedItem();

            try {
                String query = "insert into student values('" + name + "','" + fname + "','" + rollno + "','" + dob + "','" + address + "','" + phone + "','" + email + "','" + x + "','" + xii + "','" + aadhar + "','" + branch + "','" + course + "')";
                database_connection connecter = new database_connection();
                connecter.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "DETAILS INSERTED");
                setVisible(false);

            } catch (Exception m) {
                m.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Add_student();
    }
}
