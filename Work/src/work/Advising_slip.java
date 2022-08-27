package work;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Advising_slip extends JFrame {

    private Container c;
    private JLabel label;
    private ImageIcon img;

    Advising_slip() {
        initComponents();
    }

    public void initComponents() {

        this.setTitle("Payment Slip");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(50, 50, 1000, 1000);
        c = this.getContentPane();

        img = new ImageIcon(getClass().getResource("slip.JPG"));
        label = new JLabel(img);
        label.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        c.add(label);
    }

}
