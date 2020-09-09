package huan2;
/**
 *    -�������̵߳ķ�ʽ���� ʵ��Runnable�ӿ�
 *    		1.����һ��ʵ����Runnable�ӿڵ���
 *    		2.ʵ����ȥʵ��Runnable�еĳ��󷽷� run()
 *    		3.����ʵ����Ķ���
 *    		4.���˶�����Ϊ�������ݵ�Thread��Ĺ�����������Thread��Ķ���
 *    		5.ͨ��Thread��Ķ���ȥ����start()
 *    
 * 	  -�����̵߳�������ʽ
 * 		����������ѡ��ʵ��Runnable�ӿڵķ�ʽ
 * 		ԭ��1.ʵ�ַ�ʽ����û�е��̳еľ�����
 * 			2.ʵ�ֵķ�ʽ���ʺ������������߳��й������ݵ����
 * 
 * 	  -��ϵ��public class Thread implements Runnable
 * 		��ͬ�� ���ַ�ʽ����Ҫ��дrun() , ���߳�Ҫִ�е��߼���������run()��
 * 
 */

//1.����һ��ʵ����Runnable�ӿڵ���
class MyThread implements Runnable{

//2.ʵ����ȥʵ��Runnable�еĳ��󷽷� run()
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
	}

}



public class ThreadTest {
	public static void main(String[] args) {
		//3.����ʵ����Ķ���
		MyThread m1 = new MyThread();
		//4.���˶�����Ϊ�������ݵ�Thread��Ĺ�����������Thread��
		Thread t1 = new Thread(m1);
		/*
		 * 5.ͨ��Thread��Ķ���ȥ����start() �� �����߳�    �� ���õ�ǰ�̵߳�run ->������Runnable���͵�target��run()
		 *                                         
		 */
		t1.start();
	}
}
