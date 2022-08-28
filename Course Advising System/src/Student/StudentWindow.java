package Student;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentWindow {

	 JFrame studentWindowframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentWindow window = new StudentWindow();
					window.studentWindowframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		studentWindowframe = new JFrame();
		studentWindowframe.getContentPane().setBackground(new Color(255, 160, 122));
		studentWindowframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Window");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 0, 450, 40);
		studentWindowframe.setTitle("Course Advising System");
		studentWindowframe.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Profile ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentWindowframe.dispose();
				StudentProfile s=new StudentProfile();
				s.profileframe.setVisible(true);
			}
		});
		btnNewButton.setBounds(153, 69, 117, 29);
		studentWindowframe.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Advising Window");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advising_window aw = new Advising_window();
                aw.setVisible(true);

			}
		});
		btnNewButton_1.setBounds(137, 117, 136, 29);
		studentWindowframe.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Go  Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentWindowframe.dispose();
				StudentSignInorUp sin=new StudentSignInorUp();
				sin.studentsinginupframe.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(156, 220, 117, 29);
		studentWindowframe.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Payment Slip ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  Advising_slip as = new Advising_slip();
	                as.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(153, 172, 117, 29);
		studentWindowframe.getContentPane().add(btnNewButton_2);
		studentWindowframe.setBounds(100, 100, 450, 300);
		studentWindowframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
