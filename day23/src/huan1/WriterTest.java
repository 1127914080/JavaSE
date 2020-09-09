package huan1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class WriterTest {

	//输出可以不存在的，
	@Test
	public void test1() throws IOException {
		//提供对象
		File file = new File("D:\\jd\\hello.txt");
		//提供写对象
		FileWriter fw = new FileWriter(file);
		//写出的操作
		fw.write("呆哥 c");
		
		//关闭
		fw.close();
	}
	
	
	
	@Test
	public void testRW() throws IOException{
		//创建File类对象，指明读入和写出的文件
		File srcfile = new File("D:\\jd\\hello.txt");
		File destfile1 = new File("D:\\jd\\hello1.txt");
	
		//创建输入流和输出流对象
		FileReader fr = new FileReader(srcfile);
		FileWriter fw = new FileWriter(destfile1);
	
		//数据的读入和写出操作
		char[] cbuf = new char[5];
		int len;//记录每次读入到cbuf数组的字符的个数
		
		while ((len = fr.read(cbuf))!= -1) {
			//每次写出len个字符
			fw.write(cbuf,0,len);
		
		}
		fw.close();
		fr.close();
		
		
	}
	
}
