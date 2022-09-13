package SBA2;
abstract class Empolyee{
	abstract void calculateSalary(int HRA, int TA, int DA);
	
    abstract void fetchDepartment(); 
    	
}
class Engineer extends Empolyee{
	void calculateSalary(int HRA, int TA, int DA) {
		int Salary=HRA+TA+DA;
		System.out.println("Salary: "+Salary);
	}
		
	
	void fetchDepartment() { 
		System.out.println("Department: Civil");
	}
}
class Doctor extends Empolyee{
	void calculateSalary(int HRA, int TA, int DA) {
		int Salary=HRA+TA+DA;
		System.out.println("Salary: "+Salary);
	}
		
	
	void fetchDepartment() { 
		System.out.println("Department: Ortho");
	}
}

public class Abstract {
	

	public static void main(String[] args) {// TODO Auto-generated method stub
		Doctor d = new Doctor();
		System.out.println("Doctor");
		
		d.calculateSalary(100, 200,300);
		d.fetchDepartment();
		Engineer e = new Engineer();
		System.out.println("Engineer");
		
		e.calculateSalary(1000, 2000,3000);
		e.fetchDepartment();
	}

}
