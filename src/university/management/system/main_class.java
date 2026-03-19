package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
    main_class() {
        super("");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/third.png"));
        Image i2 = i1.getImage().getScaledInstance(1800, 950, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        JMenuBar mb = new JMenuBar();

        JMenu newinfo = new JMenu("NEW INFORMATION");
        newinfo.setBackground(Color.black);
        newinfo.setForeground(new Color(0, 128, 0));
        mb.add(newinfo);

        JMenuItem factinfo = new JMenuItem("New Faculty Information");
        factinfo.setBackground(new Color(0, 102, 204));
        factinfo.setForeground(Color.white);
        factinfo.addActionListener(this);
        factinfo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        factinfo.setFont(new Font("Segoe UI", Font.BOLD, 13));
        newinfo.add(factinfo);

        JMenuItem studentinfo = new JMenuItem("New Student Information");
        studentinfo.setBackground(new Color(0, 102, 204));
        studentinfo.setForeground(Color.white);
        studentinfo.addActionListener(this);
        studentinfo.setFont(new Font("Segoe UI", Font.BOLD, 13));
        studentinfo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        newinfo.add(studentinfo);


        JMenu details = new JMenu("VIEW DETAILS ");
        details.setForeground(Color.black);
        details.setForeground(new Color(0, 128, 0));
        mb.add(details);

        JMenuItem factdetails = new JMenuItem("View Faculty Information");
        factdetails.setBackground(new Color(0, 102, 204));
        factdetails.setForeground(Color.white);
        factdetails.setCursor(new Cursor(Cursor.HAND_CURSOR));
        factdetails.setFont(new Font("Segoe UI", Font.BOLD, 13));
        factdetails.addActionListener(this);
        details.add(factdetails);

        JMenuItem studentdetais = new JMenuItem("View Student Information");
        studentdetais.setBackground(new Color(0, 102, 204));
        studentdetais.setForeground(Color.white);
        studentdetais.setFont(new Font("Segoe UI", Font.BOLD, 13));
        studentdetais.setCursor(new Cursor(Cursor.HAND_CURSOR));
        studentdetais.addActionListener(this);
        details.add(studentdetais);


        JMenu leave = new JMenu("APPLY LEAVE");
        leave.setForeground(Color.black);
        leave.setForeground(new Color(0, 128, 0));
        mb.add(leave);

        JMenuItem factleave = new JMenuItem("Faculty Leave");
        factleave.setBackground(new Color(0, 102, 204));
        factleave.setForeground(Color.white);
        factleave.setCursor(new Cursor(Cursor.HAND_CURSOR));
        factleave.setFont(new Font("Segoe UI", Font.BOLD, 13));
        factleave.addActionListener(this);
        leave.add(factleave);

        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setBackground(new Color(0, 102, 204));
        studentLeave.setForeground(Color.white);
        studentLeave.setFont(new Font("Segoe UI", Font.BOLD, 13));
        studentLeave.setCursor(new Cursor(Cursor.HAND_CURSOR));
        studentLeave.addActionListener(this);
        leave.add(studentLeave);


        JMenu leaveDetails = new JMenu("LEAVE DETAILS");
        leaveDetails.setForeground(Color.black);
        leaveDetails.setForeground(new Color(0, 128, 0));
        mb.add(leaveDetails);

        JMenuItem factleavedetails = new JMenuItem("Faculty Leave Details");
        factleavedetails.setBackground(new Color(0, 102, 204));
        factleavedetails.setForeground(Color.white);
        factleavedetails.setCursor(new Cursor(Cursor.HAND_CURSOR));
        factleavedetails.setFont(new Font("Segoe UI", Font.BOLD, 13));
        factleavedetails.addActionListener(this);
        leaveDetails.add(factleavedetails);

        JMenuItem studentLeaveDetails = new JMenuItem("Student Leave Details");
        studentLeaveDetails.setBackground(new Color(0, 102, 204));
        studentLeaveDetails.setForeground(Color.white);
        studentLeaveDetails.setFont(new Font("Segoe UI", Font.BOLD, 13));
        studentLeaveDetails.setCursor(new Cursor(Cursor.HAND_CURSOR));
        studentLeaveDetails.addActionListener(this);
        leaveDetails.add(studentLeaveDetails);


        JMenu exam = new JMenu("EXAMINATION");
        exam.setForeground(Color.black);
        exam.setForeground(new Color(0, 128, 0));
        mb.add(exam);

        JMenuItem factexam = new JMenuItem("Examination Results");
        factexam.setBackground(new Color(0, 102, 204));
        factexam.setForeground(Color.white);
        factexam.setCursor(new Cursor(Cursor.HAND_CURSOR));
        factexam.setFont(new Font("Segoe UI", Font.BOLD, 13));
        factexam.addActionListener(this);
        exam.add(factexam);

        JMenuItem studentexam = new JMenuItem("Enter Marks");
        studentexam.setBackground(new Color(0, 102, 204));
        studentexam.setForeground(Color.white);
        studentexam.addActionListener(this);
        studentexam.setFont(new Font("Segoe UI", Font.BOLD, 13));
        studentexam.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exam.add(studentexam);


        JMenu updateinfo = new JMenu("UPDATE DETAILS");
        updateinfo.setForeground(Color.black);
        updateinfo.setForeground(new Color(0, 128, 0));
        mb.add(updateinfo);

        JMenuItem factupadte = new JMenuItem("Update Faculty Details");
        factupadte.setBackground(new Color(0, 102, 204));
        factupadte.setForeground(Color.white);
        factupadte.setCursor(new Cursor(Cursor.HAND_CURSOR));
        factupadte.setFont(new Font("Segoe UI", Font.BOLD, 13));
        factupadte.addActionListener(this);
        updateinfo.add(factupadte);

        JMenuItem studentupdate = new JMenuItem("Update Student Details");
        studentupdate.setBackground(new Color(0, 102, 204));
        studentupdate.setForeground(Color.white);
        studentupdate.setFont(new Font("Segoe UI", Font.BOLD, 13));
        studentupdate.setCursor(new Cursor(Cursor.HAND_CURSOR));
        studentupdate.addActionListener(this);
        updateinfo.add(studentupdate);


        JMenu fess = new JMenu("FEE DETAILS");
        fess.setForeground(Color.black);
        fess.setForeground(new Color(0, 128, 0));
        mb.add(fess);

        JMenuItem factfess = new JMenuItem("Fee Structure");
        factfess.setBackground(new Color(0, 102, 204));
        factfess.setForeground(Color.white);
        factfess.setCursor(new Cursor(Cursor.HAND_CURSOR));
        factfess.setFont(new Font("Segoe UI", Font.BOLD, 13));
        factfess.addActionListener(this);
        fess.add(factfess);

        JMenuItem studentfess = new JMenuItem("Student Fee  Form");
        studentfess.setBackground(new Color(0, 102, 204));
        studentfess.setForeground(Color.white);
        studentfess.setFont(new Font("Segoe UI", Font.BOLD, 13));
        studentfess.setCursor(new Cursor(Cursor.HAND_CURSOR));
        studentfess.addActionListener(this);
        fess.add(studentfess);


        JMenu utlity = new JMenu("UTILITY");
        utlity.setForeground(Color.black);
        utlity.setForeground(new Color(0, 128, 0));
        mb.add(utlity);

        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setBackground(new Color(0, 102, 204));
        calculator.setForeground(Color.white);
        calculator.setCursor(new Cursor(Cursor.HAND_CURSOR));
        calculator.addActionListener(this);
        calculator.setFont(new Font("Segoe UI", Font.BOLD, 13));
        utlity.add(calculator);

        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(new Color(0, 102, 204));
        notepad.setForeground(Color.white);
        notepad.addActionListener(this);
        notepad.setFont(new Font("Segoe UI", Font.BOLD, 13));
        notepad.setCursor(new Cursor(Cursor.HAND_CURSOR));
        utlity.add(notepad);


        JMenu about = new JMenu("ABOUT");
        about.setForeground(Color.black);
        about.setForeground(new Color(0, 128, 0));
        mb.add(about);

        JMenuItem calculator1 = new JMenuItem("About");
        calculator1.setBackground(new Color(0, 102, 204));
        calculator1.setForeground(Color.white);
        calculator1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        calculator1.setFont(new Font("Segoe UI", Font.BOLD, 13));
        calculator1.addActionListener(this);
        about.add(calculator1);


        JMenu exit = new JMenu("EXIT");
        exit.setForeground(Color.black);
        exit.setForeground(new Color(0, 128, 0));
        mb.add(exit);

        JMenuItem exit1 = new JMenuItem("Exit");
        exit1.setBackground(new Color(0, 102, 204));
        exit1.setForeground(Color.white);
        exit1.addActionListener(this);
        exit1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exit1.setFont(new Font("Segoe UI", Font.BOLD, 13));
        exit.add(exit1);


        setJMenuBar(mb);
        setSize(1540, 850);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.equals("Exit")) {
            System.exit(2020);
        } else if (button.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception l) {
                l.printStackTrace();
            }
        } else if (button.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception n) {
                n.printStackTrace();
            }

        } else if (button.equals("New Faculty Information")) {
            new Add_teacher();
        } else if (button.equals("New Student Information")) {
            new Add_student();

        } else if (button.equals("View Faculty Information")) {
            new teacher_details();

        } else if (button.equals("View Student Information")) {
            new student_details();
        } else if (button.equals("Faculty Leave")) {
            new teacher_leave();
        } else if (button.equals("Student Leave")) {
            new student_leave();
        } else if (button.equals("Faculty Leave Details")) {
            new teacher_leave_details();
        } else if (button.equals("Student Leave Details")) {
            new student_leave_details();
        } else if (button.equals("Update Faculty Details")) {
            new update_teacher();
        } else if (button.equals("Update Student Details")) {
            new update_student();
        } else if (button.equals("Enter Marks")) {
            new entermarks_student();
        } else if (button.equals("Examination Results")) {
            new examination_details();
        } else if (button.equals("Fee Structure")) {
            new free_structure();
        } else if (button.equals("Student Fee  Form")) {
            new student_fee_form();
        } else if (button.equals("About")) {
            new about();
        }
    }

    public static void main(String[] args) {
        new main_class();
    }
}
