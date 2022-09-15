package Day4Files;
import java.io.FileOutputStream;
import java.io.OutputStream;
public class DataOutputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="This is a line of text inside the file.";
		try {
			
			OutputStream out= new FileOutputStream("Output.txt");
			
			//converts the string into bytes
			byte[] dataBytes=data.getBytes();
			
			//Writes data to the output stream
			out.write(dataBytes);
			System.out.println("Data is written to the file.");
			
			//close the out stream
			out.close();
		}
		catch(Exception e) {
			e.getStackTrace();
			
		}

	}

}
