package huan;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

public class ClassLoaderTest {

	@Test
	public void test1() {
		//�������       ,�Զ����࣬ʹ��ϵͳ����������м���
		ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
		System.out.println(classLoader);
		
		//����ϵͳ���������getParent()����ȡ��չ�������
		ClassLoader classLoader1 = classLoader.getParent();
		System.out.println(classLoader1);
		
		//������չ��ļ��������޷���ȡ�����������
		//�������������Ҫ�������Java������⣬�޷������Զ������
		ClassLoader classLoader2 = classLoader1.getParent();
		System.out.println(classLoader2);
		
		ClassLoader classLoader3 = String.class.getClassLoader();
		System.out.println(classLoader3);
	}
	
	
	//����
	/*
	 *   Properties ��������ȡ�����ļ�
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
