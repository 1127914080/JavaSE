package com.atguigu.java4;



/*
 * 面向对象特征之三：多态性
 * 
 * 1.理解多态性：可以理解为一个事物的多种形态。
 * 2.何为多态性：
 *   对象的多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
 *   
 * 3. 多态的使用：虚拟方法调用
 *   有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法。
 *   总结：编译，看左边；运行，看右边。
 *   
 * 4.多态性的使用前提：  ① 类的继承关系  ② 方法的重写
 * 
 * 5.对象的多态性，只适用于方法，不适用于属性（编译和运行都看左边）
 */
public class PersonTest {
	
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.eat();
		
		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earnMoney();
		
		//*************************************************
		System.out.println("*******************");
		//对象的多态性：父类的引用指向子类的对象
		Person p2 = new Man();
//		Person p3 = new Woman();
		//多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法 ---虚拟方法调用
		p2.eat();
		p2.walk();
		
//		p2.earnMoney();
		
		System.out.println(p2.id);//1001
		
		System.out.println("------------");
		//不能调用子类特有的方法，属性，编译时
		
		//有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的
		//但是由于变量声明为父类类型，导致编译时，只能调用父类中声明的属性和方法，子类
		//子类特有的属性和方法不能调用
		
		
		//如何调用子类特有的 属性和方法？
		//使用强制类型转换符 ： 向下转型
		
		Man m1 = (Man)p2;
		m1.earnMoney();
		m1.isSmoking = true;
		
		//使用强转时，可能出现，类型转换异常  ClassCastException : 类型转换异常
//		Woman w1 = (Woman)p2;
//		w1.goShopping();
		
		/**
		 * instanceof : 关键字的使用
		 * 	a  instanceof A : 判断a是否为A的实例，如果是返回true,如果不是 返回false
		 *
		 *	
		 *	使用情境 ： 为了避免向下转型时出现ClassCastException异常
		 *
		 *
		 */
		
		if (p2 instanceof Woman) {
			Woman w1 = (Woman)p2;
			w1.goShopping();
			System.out.println("----Woman-------");
		}
		if (p2 instanceof Man) {
			Man m2 = (Man)p2;
			m2.earnMoney();
			System.out.println("-----Man------");
		}
		if (p2 instanceof Person) {
			
			System.out.println("----Person------");
		}
		if (p2 instanceof Object) {
			
			System.out.println("---Object-------");
		}
	}
}
