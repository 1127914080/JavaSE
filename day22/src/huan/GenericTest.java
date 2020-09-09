package huan;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/**
 *
 * ���͵�ʹ��
 * 1.jdk 5.0����������
 *
 * 2.�ڼ�����ʹ�÷��ͣ�
 *  �ܽ᣺
 *  �� ���Ͻӿڻ򼯺�����jdk5.0ʱ���޸�Ϊ�����͵Ľṹ��
 *  �� ��ʵ����������ʱ������ָ������ķ�������
 *  �� ָ�����Ժ��ڼ������ӿ��з��Ƕ������ӿ�ʱ���ڲ��ṹ�����磺�����������������Եȣ�ʹ�õ���ķ��͵�λ�ã���ָ��Ϊʵ�����ķ������͡�
 *    ���磺add(E e)  --->ʵ�����Ժ�add(Integer e)
 *  �� ע��㣺���͵����ͱ������࣬�����ǻ����������͡���Ҫ�õ������������͵�λ�ã��ð�װ���滻
 *  �� ���ʵ����ʱ��û��ָ�����͵����͡�Ĭ������Ϊjava.lang.Object���͡�
 *
 * 3.����Զ��巺�ͽṹ�������ࡢ���ͽӿڣ����ͷ������� GenericTest1.java
 * 
 * 
 * 
 */
public class GenericTest {
	
	//�ڼ�����ʹ�÷���֮ǰ�������
	@Test
	public void test1() {
		ArrayList list = new ArrayList();
        //���󣺴��ѧ���ĳɼ�
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);
      //����һ�����Ͳ���ȫ
        list.add("Tom");
      for (Object sorce : list) {
    	  //�������ǿתʱ�п��ܳ���ClassCastException
    	  int stuSorce = (Integer)sorce;
    	  System.out.println(stuSorce);
      }
          
	}
	//�ڼ�����ʹ�÷���֮�����������Ͳ��ܼӻ����������ͣ�ֻ�ܼӰ�װ��������
	@Test
	public void test2() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		 //���󣺴��ѧ���ĳɼ�
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);
        //����ʱ���ᱣ֤���ݵİ�ȫ
     //   list.add("Tom");
	
        for (Integer score : list) {
			System.out.println(score);
		}
        System.out.println("-------------------");
        
        Iterator<Integer> ite = list.iterator();
        while (ite.hasNext()) {
			System.out.println(ite.next());
		}
         
	}
	//HashMapΪ��
	@Test
	public void test3() {
		Map<String , Integer> map = new HashMap<String, Integer>();
		
			map.put("Tom",87);
	        map.put("Jerry",87);
	        map.put("Jack",67);
		
	        Set<Map.Entry<String, Integer>> entry = map.entrySet();
	        
	        Iterator<Map.Entry<String, Integer>> ite = entry.iterator();
	        
	        while (ite.hasNext()) {
				Map.Entry<String, Integer> next = ite.next();
				String k = next.getKey();
				Integer v = next.getValue();
				System.out.println("k-->"+k+",v-->"+v);
	        
	        }
	}
	
	@Test
	public void test4() {
		Order<Object> order = new Order<>();
		Integer[] arr = new Integer[] {1,2,3,4};
	
		//���ͷ����ڵ���ʱ��ָ�����Ͳ��������͡�
        List<Integer> list = order.copyFromArrayToList(arr);

        System.out.println(list);
	
	}
	
	
}
