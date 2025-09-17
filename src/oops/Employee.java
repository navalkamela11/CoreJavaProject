package oops;

public class Employee {
	
	String Name;
	int EmpNo;
	int Salary;
	
	public Employee (String p1, int p2, int p3) {
		
		Name = p1;
		EmpNo = p2;
		Salary =p3;
		
	}
	
	public void DisplayEmp() {
		
		System.out.println(Name);
		System.out.println(EmpNo);
		System.out.println(Salary);
	}
	

}
