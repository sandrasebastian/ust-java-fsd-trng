package moregenerics;
//java program to show working
//of user-defined Generic classes
//we use<>to specify parameter type
class Test1<T>{
	//An object of type T is declared
	T obj;
	Test1(T obj){this.obj=obj;}//constructor
	public T getObject() {return this.obj;
	}
		
	}

public class Genericsexample2 {

	public static void main(String[] args) {
		// instance of integer type
		Test1<Integer>iObj=new Test1<Integer>(15);
		System.out.println(iObj.getObject());
		
		
		// instance of strin type
		Test1<String>sObj=new Test1<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());
		sObj=sObj;//This results an error
		

	}

}
