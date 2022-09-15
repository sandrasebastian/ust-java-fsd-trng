package Enums;
enum Signal
{Red(5),Orange(10),Green(15);
	private int x;
	private Signal(int x) {
		this.x=x;
		}
	 int getIndex(){
		return x;
	}
	}

public class enum1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Signal s= Signal.Green;
		System.out.println(Signal.Green.getIndex());
		System.out.println(s.ordinal());
		System.out.println(s.name());
		System.out.println(s.valueOf("Red"));

	}

}
