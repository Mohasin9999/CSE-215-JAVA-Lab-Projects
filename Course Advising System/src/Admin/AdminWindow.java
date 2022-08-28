package Admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import HomePage.HomePage;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminWindow {

 JFrame adminWindowFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminWindow window = new AdminWindow();
					window.adminWindowFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		adminWindowFrame = new JFrame();
		adminWindowFrame.getContentPane().setBackground(new Color(100, 149, 237));
		adminWindowFrame.getContentPane().setForeground(new Color(0, 0, 0));
		adminWindowFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Window ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		lblNewLabel.setBounds(0, 27, 450, 33);
		adminWindowFrame.setTitle("Course Advising System");
		adminWindowFrame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Student Information ");
		btnNewButton.setBounds(137, 72, 163, 29);
		adminWindowFrame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Singup student List");
		btnNewButton_1.setBounds(137, 123, 171, 29);
		adminWindowFrame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Go Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSignIn si=new AdminSignIn();
				si.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(186, 173, 75, 20);
		adminWindowFrame.getContentPane().add(btnNewButton_2);
		adminWindowFrame.setBounds(100, 100, 450, 300);
		adminWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
