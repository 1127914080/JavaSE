package huan1;

/**
 * ���ڳ��������������
 * 
 * 
 *
 */
public class PersonTest {
	public static void main(String[] args) {

		method(new Student());// ��������
		
		Worker w1 = new Worker();
		method1(w1); //�������������������
		
		
		method1(new Worker()); // ���������������Ķ���
		
		
		System.out.println("-------------------------------");
		//������һ����������Ķ���
			//p
		Person p = new Person() {
			
			@Override
			public void breath() {
				System.out.println("�úú���");
				
			}
			
			@Override
			public void eat() {
				System.out.println("�Զ���");
				
			}
		};
		
		method1(p);
		
		System.out.println("-----------");
		
		//���������������������
		method1(new Person() {
			
			@Override
			public void breath() {

				System.out.println("����");
				
			}
			
			@Override
			public void eat() {
				System.out.println("����ϱ��");
				
			}
		});
	}
	

	public static void method1(Person p) {
		p.eat();
		p.breath();
	}

	public static void method(Student s) {

	}
}

class Worker extends Person {

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub

	}

}
