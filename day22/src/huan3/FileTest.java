package huan3;
/**
 * File���ʹ��
 *
 * 1. File���һ�����󣬴���һ���ļ���һ���ļ�Ŀ¼(�׳ƣ��ļ���)
 * 2. File��������java.io����
 * 3. File�����漰�������ļ����ļ�Ŀ¼�Ĵ�����ɾ�������������޸�ʱ�䡢�ļ���С�ȷ�����
 *   	 ��δ�漰��д����ȡ�ļ����ݵĲ����������Ҫ��ȡ��д���ļ����ݣ�����ʹ��IO������ɡ�
 * 4. ����File��Ķ��󳣻���Ϊ�������ݵ����Ĺ������У�ָ����ȡ��д���"�յ�".
 *
 *
 *
 *
 *
 */

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.junit.Test;

/*
	1.��δ���File���ʵ��
    	File(String filePath)
    	File(String parentPath,String childPath)
    	File(File parentFile,String childPath)

	2.
		���·���������ĳ��·���£�ָ����·����
		����·���������̷����ڵ��ļ����ļ�Ŀ¼��·��

	3.·���ָ���
 		windows:\\
 		unix:/
 */


public class FileTest {

	@Test
	public void test1() {
		//������1
		File file = new File("hello.txt");
		System.out.println(file);
		
		//������2��
		File file1 = new File("D:\\eclipse\\eclipse-workspace3", "day22");
		System.out.println(file1);
		
		
		//������3��
		File file3 = new File(file1, "hi.txt");
		System.out.println(file3);
		
	}
	

/*
		public String getAbsolutePath()����ȡ����·��
		public String getPath() ����ȡ·��
		public String getName() ����ȡ����
		public String getParent()����ȡ�ϲ��ļ�Ŀ¼·�������ޣ�����null
		public long length() ����ȡ�ļ����ȣ������ֽ����������ܻ�ȡĿ¼�ĳ��ȡ�
		public long lastModified() ����ȡ���һ�ε��޸�ʱ�䣬����ֵ

		���µ����������������ļ�Ŀ¼��
		public String[] list() ����ȡָ��Ŀ¼�µ������ļ������ļ�Ŀ¼����������
		public File[] listFiles() ����ȡָ��Ŀ¼�µ������ļ������ļ�Ŀ¼��File����


 */
	@Test
	public void test2() {
		File file1 = new File("hello.txt");
		File file2 = new File("D:\\sparkData\\groupTopN.txt");
		
		System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));

        System.out.println("------------------"); 

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
	}
	
	@Test
	public void test3() {
		//����Ŀ¼�µ��ļ�
		File file = new File("D:\\sparkData");
		
		String[] list = file.list();
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("---------------------");
		//�������ǵľ���·�� //listFiles
		File[] listFiles = file.listFiles();
		for (File f : listFiles) {
			System.out.println(f);
		}
	}
	
	  /*
    	public boolean renameTo(File dest):���ļ�������Ϊָ�����ļ�·��
     		���磺file1.renameTo(file2)Ϊ����
        		Ҫ�뱣֤����true,��Ҫfile1��Ӳ�����Ǵ��ڵģ���file2������Ӳ���д��ڡ�
     */
	
	@Test
	public void test4() {
		File file1 = new File("D:\\sparkData\\groupTopN.txt");
		File file2 = new File("D:\\jd\\hello.txt");
		
		boolean renameTo = file1.renameTo(file2);
		System.out.println(renameTo);
	
	}
	
    /*
		public boolean isDirectory()���ж��Ƿ����ļ�Ŀ¼
		public boolean isFile() ���ж��Ƿ����ļ�
		public boolean exists() ���ж��Ƿ����
		public boolean canRead() ���ж��Ƿ�ɶ�
		public boolean canWrite() ���ж��Ƿ��д
		public boolean isHidden() ���ж��Ƿ�����

     */
	
	@Test
	public void test5() {
		File file1 = new File("D:\\jd\\hello.txt");
		
		System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
		
		System.out.println("------------------------");
		File file2 = new File("D:\\jd");
	
		System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.exists());
        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());
        System.out.println(file2.isHidden());
	}
    /*
    	����Ӳ���ж�Ӧ���ļ����ļ�Ŀ¼
		public boolean createNewFile() �������ļ������ļ����ڣ��򲻴���������false
		public boolean mkdir() �������ļ�Ŀ¼��������ļ�Ŀ¼���ڣ��Ͳ������ˡ�������ļ�Ŀ¼���ϲ�Ŀ¼�����ڣ�Ҳ��������
		public boolean mkdirs() �������ļ�Ŀ¼��������ļ�Ŀ¼���ڣ��Ͳ������ˡ�����ϲ��ļ�Ŀ¼�����ڣ�һ������

    	ɾ�������е��ļ����ļ�Ŀ¼
		public boolean delete()��ɾ���ļ������ļ���
    	ɾ��ע�����Java�е�ɾ�����߻���վ��

     */
	
	@Test
	public void test6() throws IOException {
		File file = new File("D:\\jd\\1.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("�����ɹ�");
		}else {//�ļ�����
			file.delete();
			System.out.println("ɾ���ɹ�");
		}
	
	}
	//�ļ�Ŀ¼����
	@Test
	public void test7() {
		//�ļ�Ŀ¼�Ĵ���
		File file = new File("D:\\jd\\huan\\huan3");
		boolean mkdir = file.mkdir();
		if (mkdir) {
			System.out.println("�����ɹ�");
		}else {
			System.out.println("����ʧ��");
		}
		System.out.println("----------------");
		File file2 = new File("D:\\jd\\huan1\\huan3");
		boolean mkdirs = file2.mkdirs();
		if (mkdirs) {
			System.out.println("�����ɹ�");
		}else {
			System.out.println("����ʧ��");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
}
