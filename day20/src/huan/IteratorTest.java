package huan;
/**
 * 集合元素的遍历操作，使用迭代器Iterator接口
 * 1.内部的方法：hasNext() 和  next()
 * 2.集合对象每次调用iterator()方法都得到一个全新的迭代器对象，
 * 默认游标都在集合的第一个元素之前。
 * 3.内部定义了remove(),可以在遍历的时候，删除集合中的元素。此方法不同于集合直接调用remove()
 *
 *
 *
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class IteratorTest {

	@Test
	public void test1() {
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(456);
		coll.add(new String("tom"));
		coll.add(false);
		coll.add(new Person("huan", 22));
		
		Iterator ite = coll.iterator();
		
		//方式一 
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
		System.out.println("--------------------------");
		
		//方式二 //不推荐
//		for (int i = 0; i < coll.size(); i++) {
//			System.out.println(ite.next());
//		}
		
		
		//方式三： //推荐
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}	
	}
	
	@Test
	public void test2() {
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(456);
		coll.add(new String("tom"));
		coll.add(false);
		coll.add(new Person("huan", 22));
		
		Iterator ite = coll.iterator();
		
		//删除tom
		while (ite.hasNext()) {
			Object obj =  ite.next();
			if ("tom".equals(obj)) {
				ite.remove();
			}
			
		}
		//重新遍历
		ite=coll.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
			
		}
		
	}
	
	
	
	
	
	
	
	
}
