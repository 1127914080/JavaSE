package com.lh.java;

/**
 * 
 * @author hao ���� = ��Ա����=field = �� ���ֶ�
 *
 *         ���� = ��Ա���� = ����=method ��Ӧ���еĳ�Ա���� -> ���� ��Ӧ���еĳ�Ա���� -> ��Ϊ
 */
public class Test01 {
	public static void main(String[] args) {
		//����Person����
		Person p1 = new Person();
		p1.name="tonghuan";
		p1.age=1;
		p1.isMale=true;
		System.out.println(p1.name);
		//���÷��� ����.����
		p1.eat();
		p1.sleep();
		p1.talk("chinese");
	}
}

class Person {
	// ����
	String name;
	int age = 1;
	boolean isMale;

	// ����
	public void eat() {
		System.out.println("�˿��ԳԷ�");
	}

	public void sleep() {
		System.out.println("�˿���˯��");
	}

	public void talk(String language) {
		System.out.println("�˿���˵����˵���ǣ�" + language);
	}

}
