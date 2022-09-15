package Day4Files;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data ="This is the data in the output file";
		try{
			
			//creates a filewriter
			FileWriter file=new FileWriter("Output.txt");
			//creates a BufferedWriter
			
			 BufferedWriter output=new BufferedWriter(file);
			 
			 //writes the string to the file 
			 output.write(data);
			 
			 //close the writer 
			 output.close();
			 
		}
		catch(Exception e) {
			e.getStackTrace();
			
		}

	}

}
