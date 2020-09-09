package huan;
/*
 *   	ͨ�����䴴����Ӧ������ʱ��Ķ���
 */

import java.util.Random;

import org.junit.Test;

public class NewInstanceTest {

	@Test
	public void test1() throws InstantiationException, IllegalAccessException {
		Class<Person> clazz = Person.class;
		/**
		 * newInstance ���ô˷�����������Ӧ������ʱ��Ķ���
		 */
		
		Person obj = clazz.newInstance();
		System.out.println(obj);
	}
	
	@Test
	public void test2() {
		int num = new Random().nextInt(3);
		String classPath = "";
		switch (num) {
		case 0:
			classPath = "java.util.Date";
			break;
		case 1:
			classPath = "java.sql.Date";
			break;
		case 2:
			classPath = "huan.Person";
			break;
		
		}
		try {
			Object obj = getInstance(classPath);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
	/*
	 *   	����ָ����
	 * 
	 */
	public Object getInstance(String classPath) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz = Class.forName(classPath);
		return clazz.newInstance();
	}
	
	
	
	
	
	
}
