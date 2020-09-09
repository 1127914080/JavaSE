package huan;
/**
 *   Collection 接口中声明的方法的测试
 * 
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

public class CollectionTest1 {

	@Test
	public void test1() {
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(456);
		coll.add(new String("tom"));
		coll.add(false);
		coll.add(new Person("呆哥", 22));
		
		
		//contains (Object obj); 判断当前集合中是否包含obj
		//我们再判断时会调用obj对象所在的类的equals()
		boolean contains = coll.contains(123);
		System.out.println(contains);
		System.err.println(coll.contains(new String("daige")));
		
		//2.containsAll(Collection coll1):判断形参coll1中的所有元素是否都存在于当前集合中
		Collection coll1 = Arrays.asList(123,456);
		System.out.println(coll.containsAll(coll1));

	}
	
	
	@Test
	public void test2() {
		//3.remove (Object obj) 从当前集合中移除obj元素
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(456);
		coll.add(new String("tom"));
		coll.add(false);
		coll.add(new Person("呆哥", 22));
		
		coll.remove(123);
		
		System.out.println(coll);
		
		
		//4.removeAll(Collection coll1):从当前集合中移除coll1中的所有元素
		Collection coll1 = Arrays.asList(123,456);
		System.out.println(coll.removeAll(coll1));
		
	}
	
	@Test
	public void test3() {
		
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(456);
		coll.add(new String("tom"));
		coll.add(false);
		coll.add(new Person("呆哥", 22));
	
		//retainAll(Collection coll):交集，获取当前集合和coll1集合的交集，并返回给当前集合
		Collection coll1 = Arrays.asList(123,456,789);
		coll.retainAll(coll1);
		System.out.println(coll);

	
	}
	//equals(Object obj):比较两个集合是否相等
	@Test
	public void test4() {
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(456);
		coll.add(new String("tom"));
		coll.add(false);
		coll.add(new Person("呆哥", 22));
		
		
		Collection coll1 = new ArrayList();
		coll1.add(123);
		coll1.add(456);
		coll1.add(new String("tom"));
		coll1.add(false);
		coll1.add(new Person("呆哥", 22));
		
		
		System.out.println(coll.equals(coll1));
	}
	
	

	@Test
	public void test5() {
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(456);
		coll.add(new String("tom"));
		coll.add(false);
		coll.add(new Person("呆哥", 22));		
		
		//hashCode() : 返回当前对象的哈希值
		System.out.println(coll.hashCode());	
	
		//集合-->数组 ： toArray()
		Object[] arr = coll.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//拓展  数组->集合
		//调用Arrays的静态方法asList
		List<String> arr1 = Arrays.asList(new String[] {"欢啊","脑残啊","不是人啊"});
		System.out.println(arr1);
		
		List arr2 = Arrays.asList(123,456);
		System.out.println(arr2);
		
		List arr3 = Arrays.asList(new int[]{123,456});
		System.out.println(arr3.size());
	
		List arr4 = Arrays.asList(new Integer[]{123,456});
		System.out.println(arr4.size());
		
		
		
		//iterator():返回Iterator接口的实例，用于遍历集合元素，
	}
	
}
