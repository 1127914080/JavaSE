package huan1;
/**
 *   abstract�ؼ��ֵ�ʹ��
 * 		1.�����
 * 		2.������������ �Ľṹ�� �࣬����	
 * 
 * 		3.abstarct�����ࣺ������
 * 			>���಻��ʵ����
 * 			>������һ���й������������������ʵ����ʱ���ã��漰���������ʵ������ȫ���̣�
 * 			>�����ж����ṩ����������࣬���������ʵ�����������صĲ���
 * 
 * 		4.abstarct ���η��� �����󷽷�
 * 			>���󷽷�ֻ�з�����������û�з�����
 * 			>�������󷽷�����һ����һ�������࣬��֮����֮���������п���û�г��󷽷���
 * 			>��������д�˸��������еĳ��󷽷��󣬴����෽��ʵ����
 * 			������û����д�����е����з�����������Ҳһ���Ǹ������࣬��Ҫabstarct����
 * 
 *         
 * 
 *
 */
public class AbstractTest {
	public static void main(String[] args) {
		
		//һ��Person������ˣ��Ͳ���ʵ����
//		Person p1 = new Person();
//		p1.eat();
		
		
		
	}
}

abstract class Creature{
	public abstract void breath(); 
}


abstract class Person  extends Creature{
	String name;
	int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	//���ǳ��󷽷�
//	public void eat() {
//		System.out.println("�˳Է�");
//	}
	
	//���󷽷�
	public	abstract void eat();
	
	
	
	public void walk() {
		System.out.println("��˯��");
	}
	
}

class Student extends Person{
	
	
	public Student() {
	}
	public Student(String name,int age) {
		super(name, age);
	}
	public void eat() {
		System.out.println("ѧ�������Ӫ����ʳ��");
	}
	@Override
	public void breath() {
		System.out.println("ѧ��Ӧ�ú������ʿ���");
		
	}
}
