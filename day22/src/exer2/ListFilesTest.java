package exer2;


import java.io.File;
/**
 * 3. ����ָ��Ŀ¼�����ļ����ƣ��������ļ�Ŀ¼�е��ļ���
	��չ1��������ָ��Ŀ¼ռ�ÿռ�Ĵ�С
	��չ2��ɾ��ָ���ļ�Ŀ¼�����µ������ļ�

 * @author shkstart ���䣺shkstart@126.com
 * @version  ����ʱ�䣺2019��2��23��  ����1:55:31
 *
 */
public class ListFilesTest {

	public static void main(String[] args) {
		// �ݹ�:�ļ�Ŀ¼
		/** ��ӡ��ָ��Ŀ¼�����ļ����ƣ��������ļ�Ŀ¼�е��ļ� */

		// 1.����Ŀ¼����
		File dir = new File("D:\\jd");

		// 2.��ӡĿ¼�����ļ�
		printSubFile(dir);
	}

	public static void printSubFile(File dir) {
		// ��ӡĿ¼�����ļ�
		File[] subfiles = dir.listFiles();

		for (File f : subfiles) {
			if (f.isDirectory()) {// �ļ�Ŀ¼
				printSubFile(f);
			} else {// �ļ�
				System.out.println(f.getAbsolutePath());
			}

		}
	}

	// ��ʽ����ѭ��ʵ��
	// �г�fileĿ¼���¼����ݣ����г�һ���Ļ�
	// ʹ��File���String[] list()�Ƚϼ�
	public void listSubFiles(File file) {
		if (file.isDirectory()) {
			String[] all = file.list();
			for (String s : all) {
				System.out.println(s);
			}
		} else {
			System.out.println(file + "���ļ���");
		}
	}

	// �г�fileĿ¼���¼�����������¼�����Ŀ¼�������г��¼����¼�����������
	// ����ʹ��File���File[] listFiles()
	public void listAllSubFiles(File file) {
		if (file.isFile()) {
			System.out.println(file);
		} else {
			File[] all = file.listFiles();
			// ���all[i]���ļ���ֱ�Ӵ�ӡ
			// ���all[i]��Ŀ¼�������ٻ�ȡ������һ��
			for (File f : all) {
				listAllSubFiles(f);// �ݹ���ã��Լ������Լ��ͽеݹ�
			}
		}
	}

	// ��չ1����ָ��Ŀ¼���ڿռ�Ĵ�С
	// ������һ��Ŀ¼���ܴ�С
	public long getDirectorySize(File file) {
		// file���ļ�����ôֱ�ӷ���file.length()
		// file��Ŀ¼����������һ�������д�С���������������ܴ�С
		long size = 0;
		if (file.isFile()) {
			size += file.length();
		} else {
			File[] all = file.listFiles();// ��ȡfile����һ��
			// �ۼ�all[i]�Ĵ�С
			for (File f : all) {
				size += getDirectorySize(f);// f�Ĵ�С;
			}
		}
		return size;
	}

	// ��չ2��ɾ��ָ����Ŀ¼
	public void deleteDirectory(File file) {
		// ���file���ļ���ֱ��delete
		// ���file��Ŀ¼���Ȱ�������һ���ɵ���Ȼ��ɾ���Լ�
		if (file.isDirectory()) {
			File[] all = file.listFiles();
			// ѭ��ɾ������file����һ��
			for (File f : all) {// f����file��ÿһ���¼�
				deleteDirectory(f);
			}
		}
		// ɾ���Լ�
		file.delete();
	}

}
