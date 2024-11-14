package practice.q02;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setName("山田");
		employee.setAge(20);
		String employeeName = employee.getName();
		int employeeAge = employee.getAge();
		System.out.println("氏名: "+employeeName);
		System.out.println("年齢: "+employeeAge);
	
		

	}

}
