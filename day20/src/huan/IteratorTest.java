package huan;
/**
 * ����Ԫ�صı���������ʹ�õ�����Iterator�ӿ�
 * 1.�ڲ��ķ�����hasNext() ��  next()
 * 2.���϶���ÿ�ε���iterator()�������õ�һ��ȫ�µĵ���������
 * Ĭ���α궼�ڼ��ϵĵ�һ��Ԫ��֮ǰ��
 * 3.�ڲ�������remove(),�����ڱ�����ʱ��ɾ�������е�Ԫ�ء��˷�����ͬ�ڼ���ֱ�ӵ���remove()
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
		
		//��ʽһ 
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
		System.out.println("--------------------------");
		
		//��ʽ�� //���Ƽ�
//		for (int i = 0; i < coll.size(); i++) {
//			System.out.println(ite.next());
//		}
		
		
		//��ʽ���� //�Ƽ�
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
		
		//ɾ��tom
		while (ite.hasNext()) {
			Object obj =  ite.next();
			if ("tom".equals(obj)) {
				ite.remove();
			}
			
		}
		//���±���
		ite=coll.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
			
		}
		
	}
	
	
	
	
	
	
	
	
}
