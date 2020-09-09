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
 * 泛型的使用
 * 1.jdk 5.0新增的特性
 *
 * 2.在集合中使用泛型：
 *  总结：
 *  ① 集合接口或集合类在jdk5.0时都修改为带泛型的结构。
 *  ② 在实例化集合类时，可以指明具体的泛型类型
 *  ③ 指明完以后，在集合类或接口中凡是定义类或接口时，内部结构（比如：方法、构造器、属性等）使用到类的泛型的位置，都指定为实例化的泛型类型。
 *    比如：add(E e)  --->实例化以后：add(Integer e)
 *  ④ 注意点：泛型的类型必须是类，不能是基本数据类型。需要用到基本数据类型的位置，拿包装类替换
 *  ⑤ 如果实例化时，没有指明泛型的类型。默认类型为java.lang.Object类型。
 *
 * 3.如何自定义泛型结构：泛型类、泛型接口；泛型方法。见 GenericTest1.java
 * 
 * 
 * 
 */
public class GenericTest {
	
	//在集合中使用泛型之前的情况：
	@Test
	public void test1() {
		ArrayList list = new ArrayList();
        //需求：存放学生的成绩
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);
      //问题一：类型不安全
        list.add("Tom");
      for (Object sorce : list) {
    	  //问题二：强转时有可能出现ClassCastException
    	  int stuSorce = (Integer)sorce;
    	  System.out.println(stuSorce);
      }
          
	}
	//在集合中使用泛型之后的情况：泛型不能加基本数据类型，只能加包装数据类型
	@Test
	public void test2() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		 //需求：存放学生的成绩
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);
        //编译时，会保证数据的安全
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
	//HashMap为例
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
	
		//泛型方法在调用时，指明泛型参数的类型。
        List<Integer> list = order.copyFromArrayToList(arr);

        System.out.println(list);
	
	}
	
	
}
