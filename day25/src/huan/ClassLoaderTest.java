package huan;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

public class ClassLoaderTest {

	@Test
	public void test1() {
		//类加载器       ,自定义类，使用系统类加载器进行加载
		ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
		System.out.println(classLoader);
		
		//调用系统类加载器的getParent()：获取扩展类加载器
		ClassLoader classLoader1 = classLoader.getParent();
		System.out.println(classLoader1);
		
		//调用扩展类的加载器，无法获取引导类加载器
		//引导类加载器主要负责加载Java核心类库，无法加载自定义类的
		ClassLoader classLoader2 = classLoader1.getParent();
		System.out.println(classLoader2);
		
		ClassLoader classLoader3 = String.class.getClassLoader();
		System.out.println(classLoader3);
	}
	
	
	//掌握
	/*
	 *   Properties ：用来读取配置文件
	 */
	@Test
	public void test2() throws Exception{
		Properties pros = new Properties();
		FileInputStream fis = new FileInputStream("\\day25\\src\\jdbc.properties");
		pros.load(fis);
		
		String user = pros.getProperty("User");
		String password = pros.getProperty("password");
		
		System.out.println("user:"+user+",password"+password);
	}
	
	
}
