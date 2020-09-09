package huan3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class InputStreamReaderTest {

	
	@Test
	public void test1() throws IOException{
		FileInputStream fis=new FileInputStream("D:\\jd\\hello.txt");
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		
		char[] cbuf = new char[20];
		int len;
		while ((len = isr.read(cbuf)) !=-1) {
			String str = new String(cbuf,0,len);
			System.out.println(str);
		}
		isr.close();
	}
	
	
	@Test
	public void test2() throws IOException{
		File file1 = new File("D:\\jd\\hello.txt");
		File file2 = new File("D:\\jd\\hello_gbk.txt");
		
		
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);
		
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
	
		char[] cbuf = new char[20];
		int len;
		while((len = isr.read(cbuf)) != -1) {
			osw.write(cbuf, 0, len);
		}
		isr.close();
		osw.close();
	
	
		
	
	}
	
	
	
	
	
}
