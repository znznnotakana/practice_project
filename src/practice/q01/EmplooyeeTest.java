package practice.q01;

public class EmplooyeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "山田";
		e1.age = 20;
		
		Employee e2 = new Employee();
		e2.name = "鈴木";
		e2.age =30;
		
		e1.showinfo();
		System.out.println("---------");
		e2.showinfo();
	}

}
