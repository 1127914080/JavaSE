package huan;

import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectionTest {

	//����֮ǰ�Ĳ���
	
	@Test
	public void test1() {
		//����Person����
		Person p1 = new Person("Tom",12);
		
		//�����ڲ����Է���
		p1.age=10;
		System.out.println(p1.toString());
		
		p1.show();
		
		//���ⲿ������ͨ��Person��������˽���ڲ��ṹ
		//����name .showNation()�Լ�˽�й�����
		
	}
	//����֮��
	
	@Test
	public void test2() throws Exception{
	 //ͨ�����䣬����Person��Ķ���
	 Class clazz=Person.class;
	 Constructor cons = clazz.getConstructor(String.class,int.class);
	 Object obj = cons.newInstance("tom",12);
	 Person p = (Person)obj;
	 System.out.println(p.toString());
	 //ͨ��������ö���ָ������
	 //��������
	 Field age = clazz.getDeclaredField("age");
	 age.set(p, 10);
	 System.out.println(p.toString());
	 //���÷���
	 Method show = clazz.getDeclaredMethod("show");
	 show.invoke(p);
	 
	 //ͨ�����䣬���Ե���Person˽�нṹ�ģ����磬˽�еĹ�����������������
	 //����˽�е����Ժͷ���
	 Constructor con1 = clazz.getDeclaredConstructor(String.class);
	 con1.setAccessible(true);
	 Object p1 = (Person)con1.newInstance("jr");
	 System.out.println(p1);
	 
	 //����˽�е�����
	 Field name = clazz.getDeclaredField("name");
	 name.setAccessible(true);
	 name.set(p1, "daidai");
	 System.out.println(p1);
	
	//����˽�еķ���
	 Method m1 =clazz.getDeclaredMethod("showNation", String.class);
	 m1.setAccessible(true);
	 m1.invoke(p1, "China");
	 //�����Է���һ���������֮������ȡʵ��������
	}
	/*	
	 * 		���ʣ�ֱ����new�ķ�ʽ����ķ�ʽ�����Ե��ù����Ľṹ�������������ĸ�
	 * 		���飺ֱ��new			
	 * 	
	 * 		ʲôʱ���÷���ķ�ʽ��
	 * 		�������������̬��	
	 * 
	 * 		���ʣ�����������������ķ�װ�ǲ���ì�ܵģ���ο�����������
	 * 		��ì�ܡ� 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	//��ȡClass��ʵ����ʽ
	@Test
	public void test3() throws ClassNotFoundException {
		//��ʽһ : ��������ʱ�������
		Class<Person> clazz1 = Person.class;
		System.out.println(clazz1);
		
		//��ʽ����ͨ������ʱ��Ķ���
		Person P1 = new Person();
		Class clazz2=P1.getClass();
		System.out.println(clazz2);
	
		//��ʽ���� ����Class�ľ�̬����
		Class clazz3=Class.forName("huan.Person");
		
		System.out.println(clazz3);
	
		//��ʽ�� ��ʹ����ļ����� ClassLoader
		ClassLoader  classLoader= ReflectionTest.class.getClassLoader();
		Class clazz4 = classLoader.loadClass("huan.Person");
		System.out.println(clazz4);
	}
	
	   //��������Զ��󣿶���.xxx,File,URL,����,ǰ�ˡ����ݿ����


    //Classʵ����������Щ�ṹ��˵����
    @Test
    public void test4(){
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
        // ֻҪ�����Ԫ��������ά��һ��������ͬһ��Class
        System.out.println(c10 == c11);

    }
	
	
	
	
	
	
}
