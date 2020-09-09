package huan2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\sparkData\\jdbc.properties");
		prop.load(fis);//加载对应流文件
		String name = prop.getProperty("name");
		String pwd = prop.getProperty("password");
		System.out.println("name:"+name+",password:"+pwd);
		fis.close();
	
	
	}
}
