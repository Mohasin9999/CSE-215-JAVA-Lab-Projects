package work;

import java.util.*;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;
import work.profile;

class DashBoardFrame extends JFrame {

    private static final String center = null;

    Container Container = getContentPane();

    JButton Button01 = new JButton("Profile");
    JButton Button02 = new JButton("Advising Window");
    JButton Button03 = new JButton("Payment SLip");
    JButton Button04 = new JButton("Logout");

    DashBoardFrame() {

        this.setTitle(" Dashboard");
        this.setBounds(500, 100, 400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);

        // this.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Movies\\icon.png"));
        Initialize();

    }

    public void Initialize() {
        // TODO Auto-generated method stub

        Container.setLayout(null);
        Container.setBackground(Color.DARK_GRAY);

        Button01.setBounds(42, 120, 300, 30);
        Button01.setHorizontalTextPosition(SwingConstants.CENTER);
        Button01.setVerticalTextPosition(SwingConstants.CENTER);
        Button01.setFont(new Font("KAIGE", Font.BOLD, 17));
        Button01.setBackground(Color.WHITE);
        Container.add(Button01);

        Button02.setBounds(42, 195, 300, 30);
        Button02.setHorizontalTextPosition(SwingConstants.CENTER);
        Button02.setVerticalTextPosition(SwingConstants.CENTER);
        Button02.setFont(new Font("KAIGE", Font.BOLD, 17));
        Button02.setBackground(Color.WHITE);
        Container.add(Button02);

        Button03.setBounds(42, 270, 300, 30);
        Button03.setHorizontalTextPosition(SwingConstants.CENTER);
        Button03.setVerticalTextPosition(SwingConstants.CENTER);
        Button03.setFont(new Font("KAIGE", Font.BOLD, 17));
        Button03.setBackground(Color.WHITE);
        Container.add(Button03);

        Button04.setBounds(42, 345, 300, 30);
        Button04.setHorizontalTextPosition(SwingConstants.CENTER);
        Button04.setVerticalTextPosition(SwingConstants.CENTER);
        Button04.setFont(new Font("KAIGE", Font.BOLD, 17));
        Button04.setBackground(Color.WHITE);
        Container.add(Button04);
        Button01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                profile p = new profile();
                p.setVisible(true);

            }

        });
        Button04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Registration r = null;
                try {
                    r = new Registration();
                } catch (IOException ex) {
                    Logger.getLogger(DashBoardFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                r.setVisible(true);
                r.setResizable(false);
                dispose();

            }

        });
        Button02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Advising_window aw = new Advising_window();
                aw.setVisible(true);

            }

        });
        Button03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Advising_slip as = new Advising_slip();
                as.setVisible(true);

            }

        });

    }

}
