package EnumDoc;

public enum Size2 {

	SMALL,MEDIUM,LARGE,EXTRALARGE;
	
	public String getSize() {
		
		//this will refer to the object SMALL
		switch(this) {
		case SMALL:
			return "small";
			
		case MEDIUM:
			return "medium";
		case LARGE:
			return "large";
		case EXTRALARGE:
			return "extra large";
		default:
			return null;
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call getSize()
		//using the object SMALL
		System.out.println("The size of the pizza is "+Size2.SMALL.getSize());

	}
	}

