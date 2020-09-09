package huan;

import java.util.ArrayList;
import java.util.List;

public class Order<T> {

	String orderName;
	int orderId;
	
	//����ڲ��ṹ�Ϳ���ʹ����ķ���
	
	T orderT;
	
	public Order() {}
	public Order(String orderName,int orderId,T orderT) {
		this.orderId=orderId;
		this.orderName= orderName;
		this.orderT = orderT;
		
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public T getOrderT() {
		return orderT;
	}
	public void setOrderT(T orderT) {
		this.orderT = orderT;
	}
	@Override
	public String toString() {
		return "Order [orderName=" + orderName + ", orderId=" + orderId + ", orderT=" + orderT + "]";
	}
	
	
	
	/*
	 * 	���ͷ������ڷ����г����˷��͵Ľṹ�����Ͳ�������ķ��Ͳ���û���κι�ϵ
	 * 	���仰˵�����ͷ������������ǲ��Ƿ����඼û�й�ϵ
	 * 	���ͷ�������������Ϊ��̬�ģ�ԭ�򣺷��Ͳ������ڵ��÷���ʱȷ���ģ�������ʵ������ȷ��
	 * 
	 */
	
		
	public <E> List<E> copyFromArrayToList(E[] arr) {
		
		ArrayList<E> list = new ArrayList<E>();
		
		for (E e : list) {
			list.add(e);
		}
		
		
		return list;
		
	}
	
}
