package huan;
/**
 *   Collection �ӿ��������ķ����Ĳ���
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
		coll.add(new Person("����", 22));
		
		
		//contains (Object obj); �жϵ�ǰ�������Ƿ����obj
		//�������ж�ʱ�����obj�������ڵ����equals()
		boolean contains = coll.contains(123);
		System.out.println(contains);
		System.err.println(coll.contains(new String("daige")));
		
		//2.containsAll(Collection coll1):�ж��β�coll1�е�����Ԫ���Ƿ񶼴����ڵ�ǰ������
		Collection coll1 = Arrays.asList(123,456);
		System.out.println(coll.containsAll(coll1));

	}
	
	
	@Test
	public void test2() {
		//3.remove (Object obj) �ӵ�ǰ�������Ƴ�objԪ��
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(456);
		coll.add(new String("tom"));
		coll.add(false);
		coll.add(new Person("����", 22));
		
		coll.remove(123);
		
		System.out.println(coll);
		
		
		//4.removeAll(Collection coll1):�ӵ�ǰ�������Ƴ�coll1�е�����Ԫ��
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
		coll.add(new Person("����", 22));
	
		//retainAll(Collection coll):��������ȡ��ǰ���Ϻ�coll1���ϵĽ����������ظ���ǰ����
		Collection coll1 = Arrays.asList(123,456,789);
		coll.retainAll(coll1);
		System.out.println(coll);

	
	}
	//equals(Object obj):�Ƚ����������Ƿ����
	@Test
	public void test4() {
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(456);
		coll.add(new String("tom"));
		coll.add(false);
		coll.add(new Person("����", 22));
		
		
		Collection coll1 = new ArrayList();
		coll1.add(123);
		coll1.add(456);
		coll1.add(new String("tom"));
		coll1.add(false);
		coll1.add(new Person("����", 22));
		
		
		System.out.println(coll.equals(coll1));
	}
	
	

	@Test
	public void test5() {
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(456);
		coll.add(new String("tom"));
		coll.add(false);
		coll.add(new Person("����", 22));		
		
		//hashCode() : ���ص�ǰ����Ĺ�ϣֵ
		System.out.println(coll.hashCode());	
	
		//����-->���� �� toArray()
		Object[] arr = coll.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//��չ  ����->����
		//����Arrays�ľ�̬����asList
		List<String> arr1 = Arrays.asList(new String[] {"����","�Բа�","�����˰�"});
		System.out.println(arr1);
		
		List arr2 = Arrays.asList(123,456);
		System.out.println(arr2);
		
		List arr3 = Arrays.asList(new int[]{123,456});
		System.out.println(arr3.size());
	
		List arr4 = Arrays.asList(new Integer[]{123,456});
		System.out.println(arr4.size());
		
		
		
		//iterator():����Iterator�ӿڵ�ʵ�������ڱ�������Ԫ�أ�
	}
	
}
