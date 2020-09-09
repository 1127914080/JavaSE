package huan;

public class Person {
	private String name;
	public int age;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	private Person(String name) {
		
		this.name = name;
	
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}



	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void show() {
		System.out.println("呆哥");
	}
	
	private String showNation(String nation) {
		System.out.println("我的国籍是"+nation);
		return nation;
	}
	
}
