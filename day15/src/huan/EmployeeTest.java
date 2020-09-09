package huan;

public class EmployeeTest {
	public static void main(String[] args) {
		//∂‡Ã¨
		Employee m1 = new Manager("tom", 1001, 1111, 5000000);
		
		m1.work();
		
		CommonEmployee c1 = new CommonEmployee();
		c1.work();
	}
}
