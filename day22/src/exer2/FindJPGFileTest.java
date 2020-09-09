package exer2;
import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;
/**
 * �κ���ϰ2���ж�ָ��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
 * @author shkstart ���䣺shkstart@126.com
 * @version  ����ʱ�䣺2019��2��23��  ����1:55:59
 *
 */
public class FindJPGFileTest {

	@Test
	public void test1(){
		File srcFile = new File("D:\\jd");
		
		String[] fileNames = srcFile.list();
		for(String fileName : fileNames){
			if(fileName.endsWith(".jpg")){
				System.out.println(fileName);
			}
		}
	}
	@Test
	public void test2(){
		File srcFile = new File("D:\\jd");
		
		File[] listFiles = srcFile.listFiles();
		for(File file : listFiles){
			if(file.getName().endsWith(".jpg")){
				System.out.println(file.getAbsolutePath());
			}
		}
	}
	/*
	 * File���ṩ�������ļ�����������
	 * public String[] list(FilenameFilter filter)
	 * public File[] listFiles(FileFilter filter)

	 */
	@Test
	public void test3(){
		File srcFile = new File("D:\\jd");
		
		File[] subFiles = srcFile.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".jpg");
			}
		});
		
		for(File file : subFiles){
			System.out.println(file.getAbsolutePath());
		}
	}
	
}
