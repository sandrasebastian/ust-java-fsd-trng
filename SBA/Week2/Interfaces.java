package SBA2;
interface Empolyee1{
	abstract void calculateSalary(int HRA, int TA, int DA);
	
    abstract void fetchDepartment(); 
    	
}
class Engineer1 implements Empolyee1{
	public void calculateSalary(int HRA, int TA, int DA) {
		int Salary=HRA+TA+DA;
		System.out.println("Salary: "+Salary);
	}
		
	
	public void fetchDepartment() { 
		System.out.println("Department: Civil");
	}
}
class Doctor1 implements Empolyee1{
	public void calculateSalary(int HRA, int TA, int DA) {
		int Salary=HRA+TA+DA;
		System.out.println("Salary: "+Salary);
	}
		
	
	public void fetchDepartment() { 
		System.out.println("Department: Ortho");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor1 d = new Doctor1();
		System.out.println("Doctor");
		
		d.calculateSalary(100, 200,300);
		d.fetchDepartment();
		Engineer1 e = new Engineer1();
		System.out.println("Engineer");
		
		e.calculateSalary(1000, 2000,3000);
		e.fetchDepartment();

	}

}
