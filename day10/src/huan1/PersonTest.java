package huan1;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(6);
		p.setName("´ô¸ç");
		System.out.println(p.getAge());
		System.out.println(p.getName());
	}
}
class Person{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
