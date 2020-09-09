package huan;
/**
 * 
 * @author ·â×°
 *
 */
public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name="´ô¸ç";
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
		System.out.println("´ô¸ç");
	}
	public void show() {
		System.out.println("name="+name+",age="+age+",legs="+legs);
	}
}
 