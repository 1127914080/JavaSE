package huan1;
/*   五、Map中定义的方法：
添加、删除、修改操作：
Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
void putAll(Map m):将m中的所有key-value对存放到当前map中
Object remove(Object key)：移除指定key的key-value对，并返回value
void clear()：清空当前map中的所有数据
元素查询的操作：
Object get(Object key)：获取指定key对应的value
boolean containsKey(Object key)：是否包含指定的key
boolean containsValue(Object value)：是否包含指定的value
int size()：返回map中key-value对的个数
boolean isEmpty()：判断当前map是否为空
boolean equals(Object obj)：判断当前map和参数对象obj是否相等
元视图操作的方法：
Set keySet()：返回所有key构成的Set集合
Collection values()：返回所有value构成的Collection集合
Set entrySet()：返回所有key-value对构成的Set集合

*总结：常用方法：
* 添加：put(Object key,Object value)
* 删除：remove(Object key)
* 修改：put(Object key,Object value)
* 查询：get(Object key)
* 长度：size()
* 遍历：keySet() / values() / entrySet()
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
 * 添加、删除、修改操作：
Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
void putAll(Map m):将m中的所有key-value对存放到当前map中
Object remove(Object key)：移除指定key的key-value对，并返回value
void clear()：清空当前map中的所有数据
 */
	@Test
	public void test1() {
		Map map = new HashMap();
		//添加
		map.put("AA", 123);
		map.put(45, 123);
		map.put("BB", 56);
		//修改
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
		
		//void clear()：清空当前map中的所有数据
	
		map.clear();//与map null操作不同
		System.out.println(map.size());
	}
	
	/*元素查询的操作：
	Object get(Object key)：获取指定key对应的value
	boolean containsKey(Object key)：是否包含指定的key
	boolean containsValue(Object value)：是否包含指定的value
	int size()：返回map中key-value对的个数
	boolean isEmpty()：判断当前map是否为空
	boolean equals(Object obj)：判断当前map和参数对象obj是否相等
	*/
	@Test
	public void test2() {
		Map map = new HashMap();
		Map map4 = new HashMap();
		//添加
		map.put("AA", 123);
		map.put(45, 123);
		map.put("BB", 56);
		map4.put("AA", 123);
		map4.put(45, 123);
		map4.put("BB", 56);

		//Object get(Object key)：获取指定key对应的value
		System.out.println(map.get(45));
	
		//boolean containsKey(Object key)：是否包含指定的key
		boolean c = map.containsKey("BB");
		System.out.println(c);
		//boolean containsValue(Object value)：是否包含指定的value
		
		boolean c2 = map.containsValue(123);
		System.out.println(c2);
		
		
		//int size()：返回map中key-value对的个数
		int s1 = map.size();
		System.out.println(s1);
		
		//	boolean isEmpty()：判断当前map是否为空
		boolean empty = map.isEmpty();
		System.out.println(empty);
		
		
		//boolean equals(Object obj)：判断当前map和参数对象obj是否相等
		boolean equals = map.equals(map4);
		System.out.println(equals);
		
	}
	/**
	 * 元视图操作的方法：
	Set keySet()：返回所有key构成的Set集合
	Collection values()：返回所有value构成的Collection集合
	Set entrySet()：返回所有key-value对构成的Set集合

	 */
	@Test
	public void test4() {
		Map map = new HashMap();
		map.put("AA", 123);
		map.put(45, 123);
		map.put("BB", 56);
		
		//遍历所有的key集： keySet();
		
		Set set = map.keySet();
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("-----------");
		//遍历所有的value集 ：values()	
		Collection values = map.values();
		for (Object value : values) {
			System.out.println(value);
		}
		//遍历所有的key-value
		//entrySet();
		System.out.println("-----key-value---------");
		
		Set set1 =map.entrySet();
		Iterator ite1 = set1.iterator();
		while (ite1.hasNext()) {
		//	System.out.println(ite1.next());
			Object obj = ite1.next();
			//entrySet集合中的元素都是entry
			Map.Entry entry = (Map.Entry)obj;
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
		
		
		System.out.println("----------------");
		
		//方式二
		Set set2 =map.keySet();
		Iterator ite2 = set2.iterator();
		while (ite2.hasNext()) {
			Object key = ite2.next();
			Object value = map.get(key);
			System.out.println(key+"--==--"+value);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
