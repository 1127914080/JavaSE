package huan;
/** ����Զ��巺�ͽṹ�������ࡢ���ͽӿڣ����ͷ�����
*
* 1. �����Զ��巺���ࡢ���ͽӿڣ�
*
*
*
*
*/

import java.util.ArrayList;

import org.junit.Test;

public class GenericTest1 {

	@Test
	public void test1() {
		//��������˷����࣬ʵ����û��ָ����ķ��ͣ�����Ϊ�˷�������ΪObject����
		//Ҫ��:�����Ҷ��������Ǵ����͵ģ�������ʵ����ʱҪָ����ķ���
		Order order = new Order();
		order.setOrderT(123);
		order.setOrderT("ABC");
		
		
		//����:ʵ����ʱָ����ķ���
		Order<String> order1 = new Order<String>("orderAA",1001,"orderAA");
		order1.setOrderT("AA:hello");
	}
	
	
	
	@Test
	public void test2() {
		SubOrder sub1 = new SubOrder();
		//���������ڼ̳д����͵ĸ���ʱ��ָ���˷������ͣ���ʵ�����������ʱ������Ҫָ������
		sub1.setOrderId(1122);
		
		SubOrder1<String> sub2 = new SubOrder1<>();
		sub2.setOrderT("order2....");
	}
	
	@Test
	public void test3() {
		//���Ͳ�ͬ�����ò����໥��ֵ
		ArrayList<String> list1 = null;
		ArrayList<Integer> list2 = null;
	
		//     list1= list2;
		
		Person p1 = null;
		Person p2 = null;
				
	}
		
}
