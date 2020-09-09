package com.lh.java;

/**
 * 
 * @author hao 属性 = 成员变量=field = 域 ，字段
 *
 *         方法 = 成员方法 = 函数=method 对应类中的成员变量 -> 属性 对应类中的成员方法 -> 行为
 */
public class Test01 {
	public static void main(String[] args) {
		//创建Person对象
		Person p1 = new Person();
		p1.name="tonghuan";
		p1.age=1;
		p1.isMale=true;
		System.out.println(p1.name);
		//调用方法 对象.方法
		p1.eat();
		p1.sleep();
		p1.talk("chinese");
	}
}

class Person {
	// 属性
	String name;
	int age = 1;
	boolean isMale;

	// 方法
	public void eat() {
		System.out.println("人可以吃饭");
	}

	public void sleep() {
		System.out.println("人可以睡觉");
	}

	public void talk(String language) {
		System.out.println("人可以说话，说的是：" + language);
	}

}
