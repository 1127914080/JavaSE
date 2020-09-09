package huan1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class ReadTest {

	//读取文件里的数据
	//方式一
	@Test
	public void test1() throws IOException {
		File file = new File("D:\\jd\\hello.txt");
		FileReader fr = new FileReader(file);
		int data = fr.read();
		while (data!= -1) {
			System.out.print((char)data);
			data= fr.read();
		}
		fr.close();
	
	}
	//方式二
	@Test
	public void test2() throws IOException {
		File file = new File("D:\\jd\\hello.txt");
		FileReader fr = new FileReader(file);
		int data;
		while((data = fr.read()) != -1) {
			System.out.print((char)data);
		}
		fr.close();
	}
	
	
	
	//对read的升级。重载方法
	@Test
	public void testFileRead() throws Exception {
		File file = new File("D:\\jd\\hello.txt");
		FileReader fr = new FileReader(file);
		
		//char[] cbuf 返回每次读入cbuf数组中的字符的个数，如果达到文件末尾，返回-1
		char[] cbuf = new char[5];
		int len;
		while((len=fr.read(cbuf))!= -1) {
			for (int i = 0; i < cbuf.length; i++) {
				System.out.print(cbuf[i]);
			}
		}
		fr.close();
		

	}
	
	
	
	
	
	
	
	
}
