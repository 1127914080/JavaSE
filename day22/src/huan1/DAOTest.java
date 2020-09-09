package huan1;

import java.util.List;

import org.junit.Test;

public class DAOTest {

	@Test
	public void test1() {
		CustomerDAO d1 = new CustomerDAO();
		
		d1.add(new Customer());
		List<Customer> list = d1.getForList(1);
		
	}
}
