
package Student;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
class Courses
{
  String course_name;
  String section;
  String Faculty;
  String Routine;
  
  public Courses(String cn, String s, String f, String r)
  {
    this.course_name = cn;
    this.section = s;
    this.Faculty = f;
    this.Routine = r;
  }
  
  public String toString()
  {
    return this.course_name+" "+this.section+" "+this.Faculty+" "+this.Routine+"\n";
  }
}
public class Advising_window extends JFrame implements ActionListener{
  
  int n;
  Courses myCourses[] = new Courses[n];
  
  String path = "CourseList.txt";
  
  Container con = getContentPane();
  
  JTextField searchBox = new JTextField();
  JButton searchButton = new JButton("Search");
  
  DefaultTableModel model = new DefaultTableModel();
  JTable courseTable = new JTable(model);
  JScrollPane scroll = new JScrollPane(courseTable);
  
  Advising_window()
  {
    
        this.setTitle("Advising Window");
        this.setBounds(300, 100, 800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
        countLines();
        Load();
        
        LoadTable();
        
        Initialize();
        addActionEvent();
  }
  
  public void Initialize()
  { 
    
    
    searchBox.setBounds(250, 50, 250, 25);
    searchBox.setToolTipText("Search here");
    searchBox.setFont(new Font("San Francisco", Font.PLAIN, 16));
        con.add(searchBox);
        
        searchButton.setBounds(500, 50, 95, 25);
        searchButton.setBackground(new Color(41, 232, 242));
        searchButton.setFont(new Font("San Francisco", Font.BOLD, 17));
        con.add(searchButton);
        
    con.setLayout(null);
    con.setBackground(Color.DARK_GRAY);
    scroll.setBounds(100, 100, 500, 200);
      con.add(scroll);
  }
  
  public void addActionEvent()
  {
    searchButton.addActionListener(this);
    searchBox.addActionListener(this);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub

    if(e.getSource() == searchButton)
    {
      String text = searchBox.getText();
      model.setRowCount(0);
      
      for(int i=0; i<n; i++)
      {
        if(text.equalsIgnoreCase(myCourses[i].course_name) || text.equalsIgnoreCase(myCourses[i].section) || text.equalsIgnoreCase(myCourses[i].Faculty) || text.equalsIgnoreCase(myCourses[i].Routine))
        {
          model.addRow(new Object[]{myCourses[i].course_name,myCourses[i].section,myCourses[i].Faculty,myCourses[i].Routine});      
        }
        else if(text.equals(""))
        {
          model.addRow(new Object[]{myCourses[i].course_name,myCourses[i].section,myCourses[i].Faculty,myCourses[i].Routine});
        }
      }
    }
  }
  public int countLines()
  {
    int count=0;
    try {
      Scanner get = new Scanner(new File(path));
      
          while(get.hasNextLine())
          {
              get.nextLine();
              count++;
          }
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
    
    n = count;
    myCourses = new Courses[n];
    
        return count;
  }
  
  public void Load()
  {
    try
      {
      
      Scanner get = new Scanner(new File(path));
          String line, arr[];
          
          for(int i=0; i<n; i++)
          {
            line = get.nextLine();
            arr = line.split(" ");
            myCourses[i] = new Courses(arr[0], arr[1], arr[2], arr[3]);
          }
      }
      catch (Exception ep) {
      System.out.println("ERROR 404! File-Not-Found");
          //ep.printStackTrace();
      }
  }
  public void LoadTable()
  {
    //add header
    model.addColumn("Course Name");
    model.addColumn("Section");
    model.addColumn("Faculty");
    model.addColumn("Time");
    
    //add data
    for(int i=0; i<n; i++)
    {
      model.addRow(new Object[]{myCourses[i].course_name,myCourses[i].section,myCourses[i].Faculty,myCourses[i].Routine});      
    }
    
  }
  

}