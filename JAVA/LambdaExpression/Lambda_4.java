package lambdaexpression;
interface Addable1{
	int add(int a,int b);
}
public class Lambda_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lambda expression without return keyword
		Addable ad1=(a,b)->(a+b);
		System.out.println(ad1.add(10, 20));
		
		//Lambda expression with return keyword
				Addable ad2=(int a,int b)->{
					return(a+b);
				};
				System.out.println(ad1.add(100, 200));

		

	}

}
