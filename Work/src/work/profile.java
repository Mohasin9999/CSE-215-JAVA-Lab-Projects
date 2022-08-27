package work;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class profile extends JFrame {

    private Container c;
    private JLabel s1, s2, s3, s4;
    private JLabel s1_name,s1_id,s1_Department,s1_blood,s1_guardian;
    private JLabel s2_name,s2_id,s2_Department,s2_blood,s2_guardian;
    private JLabel s3_name,s3_id,s3_Department,s3_blood,s3_guardian;
    private JLabel s4_name,s4_id,s4_Department,s4_blood,s4_guardian;
    private Font s, i;

    profile() {

        initComponents();
    }

    public void initComponents() {

        this.setBounds(0, 0, 1500, 950);
        this.setResizable(false);
        this.setTitle("Profile");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        s = new Font("Arial", Font.BOLD, 30);
        i = new Font("Arial", Font.BOLD, 25);
        s1 = new JLabel("Student 1 info");
        s1.setBounds(0, 30, 250, 50);
        s1.setFont(s);
        s1.setForeground(Color.white);
        c.add(s1);
        s1_name = new JLabel("Name: John Doe");
        s1_name.setBounds(0, 100, 250, 50);
        s1_name.setFont(i);
        s1_name.setForeground(Color.blue);
        c.add(s1_name);
        s1_id = new JLabel("ID: 1914568042");
        s1_id.setBounds(0, 150, 250, 50);
        s1_id.setFont(i);
        s1_id.setForeground(Color.blue);
        c.add(s1_id);
        s1_Department = new JLabel("Department: ECE");
        s1_Department.setBounds(0, 200, 250, 50);
        s1_Department.setFont(i);
        s1_Department.setForeground(Color.blue);
        c.add(s1_Department);
        s1_blood = new JLabel("Blood Group: A+");
        s1_blood.setBounds(0, 250, 250, 50);
        s1_blood.setFont(i);
        s1_blood.setForeground(Color.blue);
        c.add(s1_blood);
        s1_guardian = new JLabel("Guardian: Father(01713558469)");
        s1_guardian.setBounds(0, 300, 380, 50);
        s1_guardian.setFont(i);
        s1_guardian.setForeground(Color.blue);
        c.add(s1_guardian);
        s2 = new JLabel("Student 2 info");
        s2.setBounds(0, 400, 250, 50);
        s2.setFont(s);
        s2.setForeground(Color.white);
        c.add(s2);
        s2_name = new JLabel("Name: Alex Abraham");
        s2_name.setBounds(0, 470, 250, 50);
        s2_name.setFont(i);
        s2_name.setForeground(Color.blue);
        c.add(s2_name);
        s2_id = new JLabel("ID: 1925895042");
        s2_id.setBounds(0, 520, 250, 50);
        s2_id.setFont(i);
        s2_id.setForeground(Color.blue);
        c.add(s2_id);
        s2_Department = new JLabel("Department: ECE");
        s2_Department.setBounds(0, 570, 250, 50);
        s2_Department.setForeground(Color.BLUE);
        s2_Department.setFont(i);
        c.add(s2_Department);
        s2_blood = new JLabel("Blood Group: B+");
        s2_blood.setBounds(0, 620, 250, 50);
        s2_blood.setFont(i);
        s2_blood.setForeground(Color.blue);
        c.add(s2_blood);
        s2_guardian = new JLabel("Guardian: Mother(01712952369)");
        s2_guardian.setBounds(0, 670, 380, 50);
        s2_guardian.setFont(i);
        s2_guardian.setForeground(Color.blue);
        c.add(s2_guardian);
        s3 = new JLabel("Student 3 info");
        s3.setBounds(700, 30, 250, 50);
        s3.setFont(s);
        s3.setForeground(Color.white);
        c.add(s3);
        s3_name = new JLabel("Name: Neil Broom");
        s3_name.setBounds(700, 100, 250, 50);
        s3_name.setFont(i);
        s3_name.setForeground(Color.blue);
        c.add(s3_name);
        s3_id = new JLabel("ID: 1714859042");
        s3_id.setBounds(700, 150, 250, 50);
        s3_id.setFont(i);
        s3_id.setForeground(Color.blue);
        c.add(s3_id);
        s3_Department = new JLabel("Department: ECE");
        s3_Department.setBounds(700, 200, 250, 50);
        s3_Department.setForeground(Color.BLUE);
        s3_Department.setFont(i);
        c.add(s3_Department);
        s3_blood = new JLabel("Blood Group: O+");
        s3_blood.setBounds(700,250 , 250, 50);
        s3_blood.setFont(i);
        s3_blood.setForeground(Color.blue);
        c.add(s3_blood);
        s3_guardian = new JLabel("Guardian: Mother(01725689636)");
        s3_guardian.setBounds(700, 300, 380, 50);
        s3_guardian.setFont(i);
        s3_guardian.setForeground(Color.blue);
        c.add(s3_guardian);
        s4 = new JLabel("Student 4 info");
        s4.setBounds(700, 400, 250, 50);
        s4.setFont(s);
        s4.setForeground(Color.white);
        c.add(s4);
        s4_name = new JLabel("Name: Leah Gotti");
        s4_name.setBounds(700, 470, 250, 50);
        s4_name.setFont(i);
        s4_name.setForeground(Color.blue);
        c.add(s4_name);
        s4_id = new JLabel("ID: 1812563642");
        s4_id.setBounds(700, 520, 250, 50);
        s4_id.setFont(i);
        s4_id.setForeground(Color.blue);
        c.add(s4_id);
        s4_Department = new JLabel("Department: ECE");
        s4_Department.setBounds(700, 570, 250, 50);
        s4_Department.setForeground(Color.BLUE);
        s4_Department.setFont(i);
        c.add(s4_Department);
        s4_blood = new JLabel("Blood Group: B+");
        s4_blood.setBounds(700,620 , 250, 50);
        s4_blood.setFont(i);
        s4_blood.setForeground(Color.blue);
        c.add(s4_blood);
        s4_guardian = new JLabel("Guardian: Father(01689190126)");
        s4_guardian.setBounds(700, 670, 380, 50);
        s4_guardian.setFont(i);
        s4_guardian.setForeground(Color.blue);
        c.add(s4_guardian);
        
        
        

    }


}
