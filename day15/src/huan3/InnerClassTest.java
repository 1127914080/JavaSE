package huan3;

/**
 * 类的内部成员之五 ：内部类 1.java中允许将类A声明在另一个类B中，则类A就是内部类，类B成为外部类 2.内部类 的分类：成员内部类，VS 局部内部类
 * (静态，非静态)（方法内，代码块内，构造器内）
 * 
 * 3.成员内部类： 一方面，作为外部类的成员： 
 * 				>调用外部类
 * 				>阔以被static修饰
 * 				>阔以被四种不同的权限修饰符修饰
 * 
 * 
 * 				另一方面，作为一个类 
 * 				>类内阔以定义属性，方法构造器等
 * 				>阔以被final修饰，表示此类不能被继承 ，言外之意不使用final 就能被继承
 * 				>阔以被abstract修饰
 * 4.关注如下三个问题 ：
 * 			>如何实例化成员内部类
 *			>如何在成员内部类中，去区分调用外部类的结构
 *			>开发中内部类的使用
 */
public class InnerClassTest {

}

class Person {
	// 静态成员内部类
	static class Dog {

	}

	// 非静态成员内部类
	class Bird {

	}

	public void method() {
		// 局部内部类
		class AA {

		}
	}

	{
		// 局部内部类
		class BB {

		}
	}

	public Person() {
		// 局部内部类
		class CC {

		}
	}
}