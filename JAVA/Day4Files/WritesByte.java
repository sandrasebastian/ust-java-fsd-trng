package Day4Files;
import java.io.FileOutputStream;
public class WritesByte {

	public static void main(String[] args) {
		
		String data="This is a line of text inside the file.";
		try {
			FileOutputStream output=new FileOutputStream("output.txt");
			byte[]array=data.getBytes();
			//writes byte to the file
			output.write(array);
			output.close();
			
		} 
		catch(Exception e) {
			e.getStackTrace();
			
		}

	}

}
