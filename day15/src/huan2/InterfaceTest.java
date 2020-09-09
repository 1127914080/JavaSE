package huan2;
/**
 * 
 *       	接口的使用
 *       		1.接口使用ifterface来定义
 *       		2.Java中，接口和类是并列的两个结构
 *       		3.如何定义接口，定义接口中的变量
 *       		
 *    
 *       		3.1 jdk7及以前：
 *       				只能全局常量和抽象方法  书写是可以省略不写
 *       				>全局常量:public static final的
 *       				>抽象方法:public abstract 的
 *       		3.2 jdk8:除了定义全局常量和抽象方法以外，还可以定义静态方法，默认方法
 *
 *
 *				4.   接口不能定义构造器，意味着接口不可以实例化
 *				5.Java开发中， 接口通过让类实现(implements)的方式的使用
 *					如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 *					如果实现类没有覆盖接口中的所有抽象方法，则此实现类仍为一个抽象类
 *				
 *				6.Java类可以实现多个接口，  --->弥补了Java单继承的局限性
 *
 *				格式 ：class AA entends BB implements CC,DD{  }
 *
 *				
 *				7.接口与接口之间可以继承，而且可以多继承
 *
 *
 *				8.接口的具体使用，体现多态性	
 *			
 *				9.接口实际上可以看作是一种规范
 *
 *
 *
 *
 *
 */ 
public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
		System.out.println("------------");
		Plane p1 = new Plane();
		p1.fly();
		p1.stop();
		System.out.println("==============");
		
	}
}
interface Attackable{
	void attack();
}

interface Flyable{
	
	//全局常量
	
	public static final int MAX_SPEED=7900;// 第一宇宙速度
	int MIN_SPEED = 1;  //省略了public
	
	
	//抽象方法
	public abstract void fly();
	
	void stop(); //省略了public abstract 
	
}

class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("通过引擎起飞");
		
	}

	@Override
	public void stop() {
		System.out.println("驾驶员减速停止");
		
	}
	
}
abstract class Kile implements Flyable{

	@Override
	public void fly() {

		System.out.println("呆哥升天");
		
	}

}
class Bullet extends Object implements Attackable,Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	
}
//******************************************
interface AA{
	void method1();
	
}
interface BB{
	void method2();
}
interface CC extends BB,AA{
	
}