package Day4Files;
//importing the file class
import java.io.File;

public class File1 {
	

	public static void main(String[] args) {
		
		//try to create  object for the current location

		File file=new File("newFile.txt");
		try {
			

			//try to create file based on the object
			boolean value=file.createNewFile();
			if(value) {
				System.out.println("The new file is created.");
			}
			else {
				System.out.println("The file already exists.");
			}

		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}