package huan1;
/*   �塢Map�ж���ķ�����
��ӡ�ɾ�����޸Ĳ�����
Object put(Object key,Object value)����ָ��key-value��ӵ�(���޸�)��ǰmap������
void putAll(Map m):��m�е�����key-value�Դ�ŵ���ǰmap��
Object remove(Object key)���Ƴ�ָ��key��key-value�ԣ�������value
void clear()����յ�ǰmap�е���������
Ԫ�ز�ѯ�Ĳ�����
Object get(Object key)����ȡָ��key��Ӧ��value
boolean containsKey(Object key)���Ƿ����ָ����key
boolean containsValue(Object value)���Ƿ����ָ����value
int size()������map��key-value�Եĸ���
boolean isEmpty()���жϵ�ǰmap�Ƿ�Ϊ��
boolean equals(Object obj)���жϵ�ǰmap�Ͳ�������obj�Ƿ����
Ԫ��ͼ�����ķ�����
Set keySet()����������key���ɵ�Set����
Collection values()����������value���ɵ�Collection����
Set entrySet()����������key-value�Թ��ɵ�Set����

*�ܽ᣺���÷�����
* ��ӣ�put(Object key,Object value)
* ɾ����remove(Object key)
* �޸ģ�put(Object key,Object value)
* ��ѯ��get(Object key)
* ���ȣ�size()
* ������keySet() / values() / entrySet()
*
*/

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class MapTest {
/*
 * ��ӡ�ɾ�����޸Ĳ�����
Object put(Object key,Object value)����ָ��key-value��ӵ�(���޸�)��ǰmap������
void putAll(Map m):��m�е�����key-value�Դ�ŵ���ǰmap��
Object remove(Object key)���Ƴ�ָ��key��key-value�ԣ�������value
void clear()����յ�ǰmap�е���������
 */
	@Test
	public void test1() {
		Map map = new HashMap();
		//���
		map.put("AA", 123);
		map.put(45, 123);
		map.put("BB", 56);
		//�޸�
		map.put("AA", 87);
		System.out.println(map);
		
		
		Map map1 = new HashMap();
		map1.put("CC", 123);
		map1.put("DD", 123);
		map.putAll(map1);
		System.out.println(map);
		
		//remove(Object key)
		Object value = map.remove("CC");
		System.out.println(value);
		System.out.println(map);
		
		//void clear()����յ�ǰmap�е���������
	
		map.clear();//��map null������ͬ
		System.out.println(map.size());
	}
	
	/*Ԫ�ز�ѯ�Ĳ�����
	Object get(Object key)����ȡָ��key��Ӧ��value
	boolean containsKey(Object key)���Ƿ����ָ����key
	boolean containsValue(Object value)���Ƿ����ָ����value
	int size()������map��key-value�Եĸ���
	boolean isEmpty()���жϵ�ǰmap�Ƿ�Ϊ��
	boolean equals(Object obj)���жϵ�ǰmap�Ͳ�������obj�Ƿ����
	*/
	@Test
	public void test2() {
		Map map = new HashMap();
		Map map4 = new HashMap();
		//���
		map.put("AA", 123);
		map.put(45, 123);
		map.put("BB", 56);
		map4.put("AA", 123);
		map4.put(45, 123);
		map4.put("BB", 56);

		//Object get(Object key)����ȡָ��key��Ӧ��value
		System.out.println(map.get(45));
	
		//boolean containsKey(Object key)���Ƿ����ָ����key
		boolean c = map.containsKey("BB");
		System.out.println(c);
		//boolean containsValue(Object value)���Ƿ����ָ����value
		
		boolean c2 = map.containsValue(123);
		System.out.println(c2);
		
		
		//int size()������map��key-value�Եĸ���
		int s1 = map.size();
		System.out.println(s1);
		
		//	boolean isEmpty()���жϵ�ǰmap�Ƿ�Ϊ��
		boolean empty = map.isEmpty();
		System.out.println(empty);
		
		
		//boolean equals(Object obj)���жϵ�ǰmap�Ͳ�������obj�Ƿ����
		boolean equals = map.equals(map4);
		System.out.println(equals);
		
	}
	/**
	 * Ԫ��ͼ�����ķ�����
	Set keySet()����������key���ɵ�Set����
	Collection values()����������value���ɵ�Collection����
	Set entrySet()����������key-value�Թ��ɵ�Set����

	 */
	@Test
	public void test4() {
		Map map = new HashMap();
		map.put("AA", 123);
		map.put(45, 123);
		map.put("BB", 56);
		
		//�������е�key���� keySet();
		
		Set set = map.keySet();
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("-----------");
		//�������е�value�� ��values()	
		Collection values = map.values();
		for (Object value : values) {
			System.out.println(value);
		}
		//�������е�key-value
		//entrySet();
		System.out.println("-----key-value---------");
		
		Set set1 =map.entrySet();
		Iterator ite1 = set1.iterator();
		while (ite1.hasNext()) {
		//	System.out.println(ite1.next());
			Object obj = ite1.next();
			//entrySet�����е�Ԫ�ض���entry
			Map.Entry entry = (Map.Entry)obj;
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
		
		
		System.out.println("----------------");
		
		//��ʽ��
		Set set2 =map.keySet();
		Iterator ite2 = set2.iterator();
		while (ite2.hasNext()) {
			Object key = ite2.next();
			Object value = map.get(key);
			System.out.println(key+"--==--"+value);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
