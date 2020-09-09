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
		
		//for(   集合中元素的类型     局部变量    ：集合对象      )
		//内部仍然调用了迭代器
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
