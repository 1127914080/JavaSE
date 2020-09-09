package huan3;

import java.awt.event.MouseWheelEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;import java.text.FieldPosition;

import org.junit.Test;

public class BufferFileTest {

	/**
	 *  	实现非文本的复制
	 */
	@Test
	public void Buffertest() throws IOException{ 
		//造文件
		File srcfile = new File("D:\\jd\\1.jpg");
		File destfile = new File("D:\\jd\\2.jpg");
		//造流
		//造节点流
		FileInputStream fis = new FileInputStream(srcfile);
		FileOutputStream fos = new FileOutputStream(destfile);
		
		//造缓冲流
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//复制的细节：读取，写入
		byte[] buffer = new byte[10];
		int len;
		while((len=bis.read(buffer)) != -1) {
			bos.write(buffer,0,len);
			bos.flush(); //刷新缓冲区
		}
		
		//关闭资源，先关闭外层，再关闭内存
		bos.close();
		bis.close();
		fos.close();
		fis.close();
		
		
		
	}
	
	/*   
	 *  buffereReader 和 BuffereWriter
	 * 	实现文件的复制
	 * 
	 * 
	 */
	@Test
	public void testBuffer() throws IOException {
		BufferedReader bir = new BufferedReader(new FileReader(new File("D:\\jd\\hello.txt")));
		BufferedWriter  bwr = new BufferedWriter(new FileWriter(new File("D:\\jd\\hello3.txt")));	
	
		char[] cbuf = new char[1024];
		int len;
		while ((len = bir.read(cbuf))!= -1) {
			bwr.write(cbuf,0,len);
		}
		if ( bir != null && bwr != null) {
			bir.close();
			bwr.close();
		}
		
	
	
	
	
	
	
	
	}	
	
	
	
}
