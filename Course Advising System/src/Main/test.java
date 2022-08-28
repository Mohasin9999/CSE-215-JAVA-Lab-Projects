package Main;

import java.io.FileReader;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            FileReader input = new FileReader("CourseList.txt");
            try {
                int i;
                while((i = input.read()) != -1) {
                    System.out.print((char)i);
                }
            } finally {
                input.close();
            }
        }
        catch(Exception e) {
            e.getStackTrace();
        }
	}

	}
