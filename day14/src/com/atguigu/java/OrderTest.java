package com.atguigu.java;

/**
 *  		对属性赋值的位置
 *  		1.默认初始化
 *  		2.显示初始化
 *  		3.构造器中初始化
 *  		4.有了对象只会，可以通过"对象.属性" 或  "对象.方法"，进行赋值
 *  		5.在代码块中赋值
 * 
 * 
 * 		顺序： 1->2/5->3-4
 * 
 * 
 * @author hao
 *
 */
public class OrderTest {
	public static void main(String[] args) {
		Order o1 = new Order();
		System.out.println(o1.orderId);
	}
}

class Order{
	//Java有顺序执行
	int orderId = 3; //显示赋值
	
	{
		orderId = 4;  //代码块赋值
		
	}
	
	
	
}
