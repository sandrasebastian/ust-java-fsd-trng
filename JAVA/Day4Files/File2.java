package Day4Files;
//importing the FileReader class
import java.io.FileReader;
public class File2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]array=new char[100];
		try {
			//creates a reader using the file reader
			FileReader input=new FileReader("input.txt");
			
			//Reads characters
			input.read(array);
			System.out.println("Data in the file.");
			System.out.println("array");
			//close the reader
			input.close();
				
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
