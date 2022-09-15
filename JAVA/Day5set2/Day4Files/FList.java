package Day4Files;

import java.io.File;
public class FList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creates file object
		File file=new File("C:\\Users\\ustjavafsdb202\\eclipse-workspace\\Java examples");
				
		//returns an array of all file
		String[]fileList=file.list();
		for(String str:fileList) {
			System.out.println(str);
		}
			
		

	}

}
