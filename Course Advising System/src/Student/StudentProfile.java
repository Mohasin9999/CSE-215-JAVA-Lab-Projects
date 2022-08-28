package Student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class StudentProfile {

	 JFrame profileframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentProfile window = new StudentProfile();
					window.profileframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentProfile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		profileframe = new JFrame();
		profileframe.getContentPane().setBackground(new Color(255, 160, 122));
		profileframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Profile ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 0, 450, 50);
		profileframe.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Go Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profileframe.dispose();
				StudentWindow s=new StudentWindow();
				s.studentWindowframe.setVisible(true);
			}
		});
		btnNewButton.setBounds(177, 230, 117, 29);
		profileframe.getContentPane().add(btnNewButton);
		
		JTextArea profiletextArea = new JTextArea();
		profiletextArea.setBounds(0, 55, 450, 163);
		profileframe.getContentPane().add(profiletextArea);
		
		try{
			FileReader reader=new FileReader("SrudentInfoKepear.text");
			profiletextArea.read(reader,null);
			reader.close();
			profiletextArea.requestFocus();
		}catch (IOException p){
			System.out.println(p);
		}
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 217, 450, -161);
		profileframe.getContentPane().add(scrollPane);
		profileframe.setBounds(100, 100, 450, 300);
		profileframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
