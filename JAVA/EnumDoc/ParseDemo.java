package EnumDoc;
import java.time.Period;
public class ParseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here is the age string in format to parse
		String age="P17Y9M5D";
		
		//Converting strings into period value
		//using parse() method
		Period p=Period.parse(age);
		System.out.println("the age is:");
		System.out.println(p.getYears()+"Years\n"+p.getMonths()+"Months\n"+p.getDays()+"Days\n");

	}

}