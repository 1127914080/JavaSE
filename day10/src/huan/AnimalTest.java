package huan;
/**
 * 
 * @author ��װ
 *
 */
public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name="����";
		a.age=1;
		a.legs=4;
		a.show();
	}
	
}

class Animal{
	String name;
	int age;
	int legs; 
	
	public void eat() {
		System.out.println("����");
	}
	public void show() {
		System.out.println("name="+name+",age="+age+",legs="+legs);
	}
}
 