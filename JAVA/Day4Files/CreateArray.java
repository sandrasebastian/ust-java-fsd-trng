package Day4Files;
import java.io.FileReader;
import java.io.BufferedReader;

public class CreateArray {

	public static void main(String[] args) {
		//creates an array of the character
		char[]array=new char[100];
		try {
			//creates a FileReader
			FileReader file=new FileReader("input.txt");

		//creates a bufferedReader
		BufferedReader input=new BufferedReader(file);
		
		//Reads characters
		input.read(array);
		System.out.println("Data in the file:");
		System.out.println(array);
		
		//close the reader
		input.close();

	}
		catch(Exception e) {
			e.getStackTrace();
		}

}
}
