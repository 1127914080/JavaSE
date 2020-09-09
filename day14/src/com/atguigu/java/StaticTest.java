package com.atguigu.java;
/**
 *   static 关键字的使用
 *   1.static : 静态的
 *   2.static可以修饰属性，方法，代码块
 * 
 * 	3.使用static修饰属性，静态变量，
 * 		3.1属性，按是否使用static修饰，又分为静态属性VS非静态属性（实例变量）
 * 			实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态变量
 * 					当修改其中一个对象中的非静态属性时，不会导致其他对象中同样的属性值的修改
 * 			静态变量：我们创建了类的多个对象，每个对象共享同一个静态变量，当通过某一个对象修改静态变量时，会导致
 * 					其他对象调用次静态变量时， 是修改过了的
 * 		3.2	static修饰属性的其他说明：
 * 				1) 静态变量随着类的加载而加载，可以通过“类.静态变量”的方式进行调用
 * 				2) 静态变量的加载要早于对象的创建
 * 				3) 由于类只会加载一次，则静态变量在内存中也只会存在一份，存在方法区的静态域中
 * 				4)                          类变量，                  实例变量
 * 				类			yes			no		
 *				对象			yes			yes
 *
 *      3.3 System.out. Math.PI
 *      
 *      
 *      
 *    4.使用static 修饰方法：静态方法
 *    		1)随着类的加载而加载 可以通过 类.静态方法
 *    
 *	  5. static注意点
 *		在静态的方法内，不能使用this关键字，super关键字
 *
 *
 *		静态结构不能调用非静态结构
 *
 *      	关于静态属性和静态方法大家都用声明周期的角度去理解
 *	
 *		如何确定一个属性是否声明为static
 *		属性是可以被多个对象所共享的，不会随着对象的不同而不同的
 *		
 *			开发中，如何确定一个方法是否声明static
 *				操作静态属性的方法，通常设置为static
 *			工具类中的方法，习惯上声明为static的
 *
 *
 *
 *
 *
 *
 */
public class StaticTest {
	public static void main(String[] args) {
		Chinese c1 = new Chinese();
		c1.name="呆哥";
		c1.age=40;
		
		Chinese c2 = new Chinese();
		c2.name="呆某";
		c2.age=39;
	
		c1.nation= "CHN";
		System.out.println(c2.nation);
	}
}
//中国人
class Chinese{
	
	String name;
	int age;
	
	static String nation; //静态属性
	

	
	
	
	
	
	
	
	
}