package huan2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

public class FileInputOutputTest {

	
	@Test
	public void test1() throws IOException{
		//造文件
		File file = new File("D:\\jd\\hello.txt");
		//造流
		FileInputStream fis = new FileInputStream(file);
		//读数据
		byte[] buffer = new byte[5];
		int len;  //每次读取数据或者字节的个数
		while((len = fis.read(buffer)) != -1 ) {
			String str = new String(buffer,0,len);
			System.out.print(str);
		}
		//关闭资源
		fis.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
