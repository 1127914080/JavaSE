package com.lh.java;
/**
 * 
 *  	类属性的使用
 *  	成员变量 vs 局部变量
 *  	相同点
 *  		1，定义变量的格式  数据类型 变量名 = 变量值
 *  		2，先声明，后使用
 *  		3，变量都有其对应的作用域
 *  	不同点
 *  		1，在类中声明的位置不统
 *  		属性：直接定义在类的一对{}内
 *  		局部变量：声明在方法内，方法形参，代码块内，构造器
 *					构造器内，构造器内部的变量
 *
 *			2，关于权限修饰符的不同
 *			属性：可以在声明属性时，指明其权限，使用权限修饰符
 *				常用权限修饰符，private public ,缺省， protected
 */
public class Test02 {

}
class User{
	//成员变量
	String name;
	int age;
	boolean isMale;
	
	//langage : 形参
	public void talk(String language) {
		System.out.println("我们使用"+language+"进行交流");
	}
	
	public void eat() {
		String food= "烙饼"; //局部变量
		System.out.println("北方人喜欢吃："+food);
	}
	
	
}