package HomePage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

import Admin.AdminSignIn;
import Student.StudentSignInorUp;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage {

	public JFrame frame1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.getContentPane().setBackground(new Color(30, 144, 255));
		frame1.setBounds(100, 100, 450, 300);
		frame1.setTitle("Course Advising System");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Home Page");
		lblNewLabel.setBounds(0, 0, 450, 34);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		frame1.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Admin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminSignIn adminLogin = new AdminSignIn();
				adminLogin.frame.setVisible(true);
		       frame1.dispose();
			}
		});
		
		btnNewButton.setBounds(165, 78, 117, 29);
		frame1.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Student");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentSignInorUp signUp=new StudentSignInorUp();
				signUp.studentsinginupframe.setVisible(true);
				frame1.dispose();
			}
		});
		btnNewButton_1.setBounds(165, 129, 117, 29);
		frame1.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Faculty ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(165, 170, 117, 29);
		frame1.getContentPane().add(btnNewButton_2);
	}
}
