package Student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import HomePage.HomePage;
import Main.Student;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class StudentSignInorUp {

	public JFrame studentsinginupframe;
	private JTextField firstNametextField;
	private JTextField lastNametextField;
	private JTextField agetextField;
	private JTextField addresstextField;
	private JTextField gendertextField;
	private JTextField numbertextField;
	private JTextField deptextField;
	private JTextField idtextField;
	private JTextField emailtextField;
	private JPasswordField passwordField;
	private JTextField emailtextField2;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		String filePath1="StudentInfo.text";
		String filePath2="SrudentInfoKepear.text";
		File file1=new File(filePath1);
		File file2=new File(filePath1);
		try{
			file1.createNewFile();

		}catch(IOException e){
			System.out.println(e);
		}
		try{
			file2.createNewFile();

		}catch(IOException e){
			System.out.println(e);
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSignInorUp window = new StudentSignInorUp();
					window.studentsinginupframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentSignInorUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		studentsinginupframe = new JFrame();
		studentsinginupframe.getContentPane().setBackground(new Color(255, 160, 122));
		studentsinginupframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student ");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 0, 515, 43);
		studentsinginupframe.setTitle("Course Advising System");
		studentsinginupframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(16, 55, 84, 16);
		studentsinginupframe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(16, 88, 74, 16);
		studentsinginupframe.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age:");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(16, 116, 61, 16);
		studentsinginupframe.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address ");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(16, 144, 61, 16);
		studentsinginupframe.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender:");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(16, 175, 61, 16);
		studentsinginupframe.getContentPane().add(lblNewLabel_5);
		
		firstNametextField = new JTextField();
		firstNametextField.setBounds(102, 50, 130, 26);
		studentsinginupframe.getContentPane().add(firstNametextField);
		firstNametextField.setColumns(10);
		
		lastNametextField = new JTextField();
		lastNametextField.setBounds(102, 83, 130, 26);
		studentsinginupframe.getContentPane().add(lastNametextField);
		lastNametextField.setColumns(10);
		
		agetextField = new JTextField();
		agetextField.setBounds(102, 111, 130, 26);
		studentsinginupframe.getContentPane().add(agetextField);
		agetextField.setColumns(10);
		
		addresstextField = new JTextField();
		addresstextField.setBounds(102, 139, 130, 26);
		studentsinginupframe.getContentPane().add(addresstextField);
		addresstextField.setColumns(10);
		
		gendertextField = new JTextField();
		gendertextField.setBounds(102, 170, 130, 26);
		studentsinginupframe.getContentPane().add(gendertextField);
		gendertextField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email Address:");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(254, 144, 98, 16);
		studentsinginupframe.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Mobile Number:");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(256, 55, 109, 16);
		studentsinginupframe.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Department:");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(254, 88, 98, 16);
		studentsinginupframe.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("ID:");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBounds(254, 116, 61, 16);
		studentsinginupframe.getContentPane().add(lblNewLabel_9);
		
		numbertextField = new JTextField();
		numbertextField.setBounds(364, 50, 130, 26);
		studentsinginupframe.getContentPane().add(numbertextField);
		numbertextField.setColumns(10);
		
		deptextField = new JTextField();
		deptextField.setBounds(364, 83, 130, 26);
		studentsinginupframe.getContentPane().add(deptextField);
		deptextField.setColumns(10);
		
		idtextField = new JTextField();
		idtextField.setBounds(364, 111, 130, 26);
		studentsinginupframe.getContentPane().add(idtextField);
		idtextField.setColumns(10);
		
		emailtextField = new JTextField();
		emailtextField.setBounds(364, 139, 130, 26);
		studentsinginupframe.getContentPane().add(emailtextField);
		emailtextField.setColumns(10);
		
		
		JLabel lblNewLabel_10 = new JLabel("Set Password:");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBounds(254, 175, 98, 16);
		studentsinginupframe.getContentPane().add(lblNewLabel_10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(364, 170, 130, 26);
		studentsinginupframe.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_11 = new JLabel("Email Address:");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setBounds(128, 269, 104, 16);
		studentsinginupframe.getContentPane().add(lblNewLabel_11);
		
		emailtextField2 = new JTextField();
		emailtextField2.setBounds(235, 264, 130, 26);
		studentsinginupframe.getContentPane().add(emailtextField2);
		emailtextField2.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Password:");
		lblNewLabel_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_12.setBounds(128, 312, 104, 16);
		studentsinginupframe.getContentPane().add(lblNewLabel_12);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(235, 307, 130, 26);
		studentsinginupframe.getContentPane().add(passwordField_1);
		JButton btnNewButton = new JButton("Signup");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String firstName=firstNametextField.getText();
			String lastName=lastNametextField.getText();
			String age=agetextField.getText();
			String address=addresstextField.getText();
			String gender=gendertextField.getText();
			String number=numbertextField.getText();
			String department=deptextField.getText();
			String id=idtextField.getText();
			String email=emailtextField.getText();
			String password=passwordField.getText();
			Student student=new Student(firstName, lastName, age, address, email,number, gender, password,id,department);
			try{
				FileWriter writer=new FileWriter("StudentInfo.text",true);
				BufferedWriter b=new BufferedWriter(writer);
				PrintWriter out=new PrintWriter(b);
	
				out.println(student);
				out.println("\n\n\n");
				
				out.close();

			}catch(IOException f){
				System.out.println(f);
			}
			firstNametextField.setText(null);
			lastNametextField.setText(null);
			agetextField.setText(null);
			addresstextField.setText(null);
			gendertextField.setText(null);
			numbertextField.setText(null);
			deptextField.setText(null);
			idtextField.setText(null);
			emailtextField.setText(null);
			passwordField.setText(null);
			
			}
		});
		btnNewButton.setBounds(192, 210, 117, 29);
		studentsinginupframe.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign in ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean matched=false;
				String email=emailtextField2.getText();
				String password=passwordField_1.getText();
				try {
					FileReader fr=new FileReader("StudentInfo.text");
					BufferedReader br=new BufferedReader(fr);
					String line;
					while ((line=br.readLine())!=null) {
						if(line.equals("Email: " + email+"\t"+"Password: "+password)) {
							matched=true;
							break;
						}
						
						fr.close();
						
					}
				} catch(FileNotFoundException f) {
					f.printStackTrace();
				}
					
					catch (IOException e1) {
				
			
					e1.printStackTrace();
			}
				if(matched) {
					Scanner in = null;
					try{
						
						File file=new File("StudentInfo.text");
						in = new Scanner(file);
						FileWriter writer=new FileWriter("SrudentInfoKepear.text");
						BufferedWriter b=new BufferedWriter(writer);
						PrintWriter out=new PrintWriter(b);
						 String line=in.nextLine();
						 if(line.contains("Email: " + email+"\t"+"Password: "+password))
			              
				               line=in.nextLine();
				              out.println(line);
				               line=in.nextLine();
				               out.println(line);
				               line=in.nextLine();
				               out.println(line);
				               line=in.nextLine();
				               out.println(line);
				               line=in.nextLine();
				               out.println(line);
				               line=in.nextLine();
				               out.println(line);
				               line=in.nextLine();
				               out.println(line);
				               line=in.nextLine();
				               out.println(line);
				               
						
                       b.close();
					}catch(IOException f){
						System.out.println(f);
					}
							studentsinginupframe.dispose();
							StudentWindow studentWindow=new StudentWindow();
							studentWindow.studentWindowframe.setVisible(true);
						}
						else {
							JOptionPane.showMessageDialog(null, "Invalid User Name or Password", "Login Error", JOptionPane.ERROR_MESSAGE);
							emailtextField2.setText(null);
							passwordField_1.setText(null);
						}
			}
		});
		btnNewButton_1.setBounds(192, 345, 117, 29);
		studentsinginupframe.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Go back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentsinginupframe.dispose();
				HomePage h=new HomePage();
				h.frame1.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(192, 394, 117, 29);
		studentsinginupframe.getContentPane().add(btnNewButton_2);
		studentsinginupframe.setBackground(new Color(255, 160, 122));
		studentsinginupframe.setBounds(100, 100, 515, 468);
		studentsinginupframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
