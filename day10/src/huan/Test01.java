package huan;

/*
 * 
 *   ��Ľṹ ��������
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
		System.out.println("�˳Է�");
	}

	public void study() {
		System.out.println("��ѧϰ");
	}

}