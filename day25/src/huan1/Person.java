package huan1;

public class Person extends Creature<String> implements Comparable<String>,MyInterface{

	private String name;
	int age;
	public int id;
	
	public Person() {
		
	}
	
	private Person(String name) {
		this.name=name;
	}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	private String show(String naction) {
		System.out.println("我的国籍是："+naction);
		return naction;
	}
	public String display(String interets) {
		return interets;
	}
	
	
	
	
	@Override
	public void info() {
		System.out.println("我是一个人");
	}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
