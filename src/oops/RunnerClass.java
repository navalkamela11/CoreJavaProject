package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee("Camilla",1234, 12333);
//		emp1.Name = "Camilla";
//		emp1.EmpNo = 1234;
//		emp1.Salary = 12333;
		emp1.DisplayEmp();
		
		Employee emp2 = new Employee("Nel", 111, 33333);
//		emp2.Name = "Nel";
//		emp2.EmpNo = 111;
//		emp2.Salary = 33333;
		emp2.DisplayEmp();
		
		ParentClass P1 = new ParentClass();
		P1.grade = 10;
		P1.name = "Sheila";
		P1.studNum = 3000;
		
		ChildClass C1 = new ChildClass();
		C1.grade = 90;
		C1.name = "Keila";
		C1.studNum = 4000;

	}

}
