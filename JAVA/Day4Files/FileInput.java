package Day4Files;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//creates a fileInputStream
			FileInputStream file=new FileInputStream("input.txt");
			
			//creates aBufferedInputStream
			BufferedInputStream input=new BufferedInputStream(file);
			
			//Reads first byte from file
			int i=input.read();
			
			while(i!=-1) {
				System.out.println((char)i);
				
				//Read next byte from the file
				i=input.read();
				
			}
			input.close();
			}
			catch(Exception e) {
			e.getStackTrace();
	

	}
	}
}
