package huan2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class CopyTest {

	
	public void test1(String src ,String desc) throws IOException {
		File file = new File(src);
		File file1 = new File(desc);
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file1);
		byte[] bs = new byte[1024];
		int len;
		while((len = fis.read(bs)) != -1) {
			fos.write(bs , 0 , len);
		}
		
		fis.close();
		fos.close();
		
	}
	

	@Test
	public void test2() throws IOException {
		
		long start = System.currentTimeMillis();
		
		String src = "D:\\北财文件\\实训\\实训二\\Video_2020-04-16_100033vue环境和插值表达式.wmv";
		String desc = "D:\\北财文件\\实训\\实训二\\day30vue应用\\视频\\Video_2020-04-16_100033vue环境和插值表达式.wmv";
		
		test1(src, desc);
		
		long end = System.currentTimeMillis();
		
		System.out.println("所花费的时间为->" + (end-start));
		
		
	}
	
}
