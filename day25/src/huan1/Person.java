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
		System.out.println("�ҵĹ����ǣ�"+naction);
		return naction;
	}
	public String display(String interets) {
		return interets;
	}
	
	
	
	
	@Override
	public void info() {
		System.out.println("����һ����");
	}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
