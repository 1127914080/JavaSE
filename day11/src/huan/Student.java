package huan;

public class Student {

	String name;
	int age;
	String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String major) {
		
		this.name = name;
		this.age = age;
		this.major = major;
	}
	public void eat() {
		System.out.println("吃饭");
	}
	public void sleep() {
		System.out.println("碎觉");
	}
	public void study() {
		System.out.println("学生在学习");
	}
	
}
