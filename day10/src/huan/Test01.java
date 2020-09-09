package huan;

/*
 * 
 *   类的结构 ：构造器
 */
public class Test01 {
	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		p.study();
		
	}
}

class Person {
	String name;
	int age;

	public void eat() {
		System.out.println("人吃饭");
	}

	public void study() {
		System.out.println("人学习");
	}

}