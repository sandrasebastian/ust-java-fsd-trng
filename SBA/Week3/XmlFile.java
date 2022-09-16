package SBA3;
import java.io.FileOutputStream;

import java.io.FileReader;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class XmlFile {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		JSONParser p2=new JSONParser();
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet= workbook.createSheet("test");
		
		//------------------HEADER WRITTING----------------------------------//
		HSSFRow rowh=sheet.createRow(0);
		rowh.createCell(0).setCellValue("ID");
		rowh.createCell(1).setCellValue("Name");
		rowh.createCell(2).setCellValue("Email");
		rowh.createCell(3).setCellValue("Password");
		rowh.createCell(4).setCellValue("About");
		rowh.createCell(5).setCellValue("Token");
		rowh.createCell(6).setCellValue("Country");
		rowh.createCell(7).setCellValue("Location");
		rowh.createCell(8).setCellValue("Lng");
		rowh.createCell(9).setCellValue("Lat");
		rowh.createCell(10).setCellValue("Dob");
		rowh.createCell(11).setCellValue("Gender");
		//----------------------------------------
		
		OutputStream out= new FileOutputStream("C:\\Users\\ustjavafsdb202\\Downloads\\testt.xls");
				
		try {
			JSONArray arr=(JSONArray)p2.parse(new FileReader("C:\\Users\\ustjavafsdb202\\Downloads\\EmployeeData.json"));

			for(int j=1;j<=(arr.size()+1);j++) {
			for(int i=0;i<arr.size();j++){
				JSONObject obj=(JSONObject) arr.get(i);
				long id=(long) obj.get("id");
				String name=(String) obj.get("name");
				name=name.toUpperCase();
				String email=(String) obj.get("email");
				String password=(String) obj.get("password");
				String about=(String) obj.get("about");
				String token=(String) obj.get("token");
				String country=(String) obj.get("country");
				String location=(String) obj.get("location");
				long lng=(long) obj.get("lng");
				long lat=(long) obj.get("lat");
				String dob=(String) obj.get("dob");
				long gender=(long) obj.get("gender");
				HSSFRow rowh1=sheet.createRow(1+1);//create cells to add read values
				
				rowh1.createCell(0).setCellValue(id);
				rowh1.createCell(1).setCellValue(name);
				rowh1.createCell(2).setCellValue(email);
				rowh1.createCell(3).setCellValue(password);
				rowh1.createCell(4).setCellValue(about);
				rowh1.createCell(5).setCellValue(token);
				rowh1.createCell(6).setCellValue(country);
				rowh1.createCell(7).setCellValue(location);
				rowh1.createCell(8).setCellValue(lng);
				rowh1.createCell(9).setCellValue(lat);
				rowh1.createCell(10).setCellValue(dob);
				rowh1.createCell(11).setCellValue(gender);
				
				
				
			}
			
			workbook.write(out);//writing the accessed to the Xls file
			}
			System.out.println("Data is written successfully");//writing the accessed to the Xls file

	}
		catch(Exception e) {
			e.printStackTrace();
		}

}
}
