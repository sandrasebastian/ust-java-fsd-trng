package Day4Files;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class OutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="This is a line of text inside the file";
		try {
			//creates a fileoutputstream
			FileOutputStream file=new FileOutputStream("output.txt");
			
			//creates a BufferedOutputStream
			BufferedOutputStream output= new BufferedOutputStream(file);
			byte[]array=data.getBytes();
			//write data to the output stream
			output.write(array);
			output.close();
			
		}
		catch(Exception e)
		{e.getStackTrace();
		
		}

	}

}
