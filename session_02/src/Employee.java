
public class Employee {
	private int empId;
	private String empName;
	private float empSal;
	
	public void setEmployee() {
		empId = 111;
		empName = "Rahul";
		empSal = 10000.89f;
	}
	
	public void displayEmployee() {
		System.out.println("Employee = [" +empId+" "+empName+" "+empSal+"]");
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.empId+" "+e.empName+" "+e.empSal);
		e.setEmployee();
		e.displayEmployee();
	}
}
