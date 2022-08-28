package HomePage;


import java.io.*;
public class tesr { public static void main(String[]args){
        fileWriter();
}
    static void fileWriter(){
        String name= "Admiin",id="12345";

        String filePath1="/Course Advising System/src/HomePage/Admin.txt";
        File file1=new File(filePath1);
        try{
            file1.createNewFile();
            FileWriter myWriter=new FileWriter(filePath1,true);
            BufferedWriter p=new BufferedWriter(myWriter);
            PrintWriter b=new PrintWriter(p);
            b.print("Name : ");
            b.println(name);
            b.print("ID: ");
            b.println(id);
            b.close();
            myWriter.close();
        }catch (FileNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
            FileReader input = new FileReader(filePath1);
            try {
                int i;
                while((i = input.read()) != -1) {
                    System.out.print((char)i);
                }
            } finally {
                input.close();
            }
        }
        catch(IOException e) {
            e.getStackTrace();
        }
    }
}
