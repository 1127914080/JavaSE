package huan;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class ForTest {

	@Test
	public void test1() {
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(456);
		coll.add(new String("tom"));
		coll.add(false);
		coll.add(new Person("huan", 22));
		
		//for(   ������Ԫ�ص�����     �ֲ�����    �����϶���      )
		//�ڲ���Ȼ�����˵�����
		for(Object object : coll) {
			System.out.println(object);
		}
		
	}
	
	
	@Test
	public void test2() {
		int[] arr = new int[]{1,2,3,4,5,6,7};
		for (int i :arr) {
			System.out.println(i);
		}
	
	}
	
	
	
	
}
