package com.ust_switch;

public class Size1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=44;
		String size;
		
		//switch statement to check size
		switch(number) {
		
		case 29:
			size="Small";
			break;
			
			
		case 42:
			size="Medium";
			break;
		//matchthe value of week
			
		case 44:
			size="Large";
			break;
			
		case 48:
			size="Extra Large";
			break;
		default:
		size="Unknown";
		break;
		}
		System.out.println("Size:"+size);

	}

}
