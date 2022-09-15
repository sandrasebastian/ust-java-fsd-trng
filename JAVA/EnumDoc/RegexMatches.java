package EnumDoc;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexMatches {
	private static final String REGEX="\\bcat\\b";

	private static java.lang.String INPUT="cat cat cat cattie cat";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile(REGEX);
		Matcher m=p.matcher(INPUT);// get a matcher object
		int count=0;
		while(m.find());
		count++;
		System.out.println("Matcher number"+count);
		System.out.println("start():"+m.start());
		System.out.println("end():"+m.end());
		
		
				
		
		

	}

}
