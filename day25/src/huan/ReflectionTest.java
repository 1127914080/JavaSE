package huan;

import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectionTest {

	//反射之前的操作
	
	@Test
	public void test1() {
		//创建Person对象
		Person p1 = new Person("Tom",12);
		
		//调用内部属性方法
		p1.age=10;
		System.out.println(p1.toString());
		
		p1.show();
		
		//在外部不可以通过Person类对象调用私有内部结构
		//比如name .showNation()以及私有构造器
		
	}
	//反射之后
	
	@Test
	public void test2() throws Exception{
	 //通过反射，创建Person类的对象
	 Class clazz=Person.class;
	 Constructor cons = clazz.getConstructor(String.class,int.class);
	 Object obj = cons.newInstance("tom",12);
	 Person p = (Person)obj;
	 System.out.println(p.toString());
	 //通过反射调用对象指定属性
	 //调用属性
	 Field age = clazz.getDeclaredField("age");
	 age.set(p, 10);
	 System.out.println(p.toString());
	 //调用方法
	 Method show = clazz.getDeclaredMethod("show");
	 show.invoke(p);
	 
	 //通过反射，可以调用Person私有结构的，比如，私有的构造器，方法，属性
	 //调用私有的属性和方法
	 Constructor con1 = clazz.getDeclaredConstructor(String.class);
	 con1.setAccessible(true);
	 Object p1 = (Person)con1.newInstance("jr");
	 System.out.println(p1);
	 
	 //调用私有的属性
	 Field name = clazz.getDeclaredField("name");
	 name.setAccessible(true);
	 name.set(p1, "daidai");
	 System.out.println(p1);
	
	//调用私有的方法
	 Method m1 =clazz.getDeclaredMethod("showNation", String.class);
	 m1.setAccessible(true);
	 m1.invoke(p1, "China");
	 //还可以返回一个对象，输出之后是套取实例化对象
	}
	/*	
	 * 		疑问：直接用new的方式或反射的方式都可以调用公共的结构，开发到底用哪个
	 * 		建议：直接new			
	 * 	
	 * 		什么时候用反射的方式？
	 * 		反射的特征，动态性	
	 * 
	 * 		疑问：反射机制与面向对象的封装是不是矛盾的，如何看待两个技术
	 * 		不矛盾。 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	//获取Class的实例方式
	@Test
	public void test3() throws ClassNotFoundException {
		//方式一 : 调用运行时类的属性
		Class<Person> clazz1 = Person.class;
		System.out.println(clazz1);
		
		//方式二：通过运行时类的对象
		Person P1 = new Person();
		Class clazz2=P1.getClass();
		System.out.println(clazz2);
	
		//方式三： 调用Class的静态方法
		Class clazz3=Class.forName("huan.Person");
		
		System.out.println(clazz3);
	
		//方式四 ，使用类的加载器 ClassLoader
		ClassLoader  classLoader= ReflectionTest.class.getClassLoader();
		Class clazz4 = classLoader.loadClass("huan.Person");
		System.out.println(clazz4);
	}
	
	   //万事万物皆对象？对象.xxx,File,URL,反射,前端、数据库操作


    //Class实例可以是哪些结构的说明：
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
        // 只要数组的元素类型与维度一样，就是同一个Class
        System.out.println(c10 == c11);

    }
	
	
	
	
	
	
}
