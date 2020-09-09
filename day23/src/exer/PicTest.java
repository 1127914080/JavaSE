package exer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class PicTest {

	//图片的加密
	@Test
	public void test1() throws IOException{
		FileInputStream fis = new FileInputStream("D:\\jd\\1.jpg");
		FileOutputStream fos = new FileOutputStream("D:\\jd\\1.jpg");
		
		byte[] buffer =  new byte[20];
		int len;
		while((len = fis.read(buffer)) != -1) {
			//字节数组进行修改
			for (int i = 0; i < len; i++) {
				buffer[i] = (byte)(buffer[i] ^ 5);
				
			}
			fos.write(buffer, 0, len);
		}
		fos.close();
		fis.close();
		
	}
}
