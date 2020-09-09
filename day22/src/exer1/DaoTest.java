package exer1;

import java.util.List;

public class DaoTest {
	
	public static void main(String[] args) {
			
		DAO<User> dao = new DAO<User>();
		dao.save("1001", new User(1001, 50, "´ô¸ç"));
		dao.save("1002", new User(1002, 51, "»¶ÃÃ"));
		dao.save("1003", new User(1003, 53, "ê»¸ç"));
		dao.save("1004", new User(1004, 54, "´ôÄ³"));
		
		List<User> list = dao.list();
		
//		System.out.println(list);
		list.forEach(System.out::println);
		
	}
}
