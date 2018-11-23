package objectOriented;

public class EmployeDemo {
	
	public static void demo()
	{
		Employee objEmp = new Employee();
		objEmp.setName("Sasanga");
		objEmp.setSalary(90000);
		
		System.out.println("Employee: " + objEmp.getName());
		System.out.println("Current salary: Rs. " + String.format("%.2f", objEmp.getSalary()));
		objEmp.raiseSalary(1.5);
		System.out.println("New salary: Rs. " + String.format("%.2f", objEmp.getSalary()));
	}

}
