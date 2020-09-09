package exer1;

import java.util.List;

public class DaoTest {
	
	public static void main(String[] args) {
			
		DAO<User> dao = new DAO<User>();
		dao.save("1001", new User(1001, 50, "����"));
		dao.save("1002", new User(1002, 51, "����"));
		dao.save("1003", new User(1003, 53, "껸�"));
		dao.save("1004", new User(1004, 54, "��ĳ"));
		
		List<User> list = dao.list();
		
//		System.out.println(list);
		list.forEach(System.out::println);
		
	}
}
