package huan;
/**
 * 
 * 
 * @author ��ϰ �������������̣߳�����һ���̱߳���100���ڵ�ż������һ���̱߳���100���ڵ�����
 *
 */



public class ThreadDemo {
	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		MyThread2 m2 = new MyThread2();
		
		m1.start();
		m2.start();
		
		
		//����Thread��������������
//		new Thread() {
//			public void run() {}; {};
//		}
		
		
		
	}
}
class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i<100 ; i++) {
			if (i%2==0) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i<100 ; i++) {
			if (i%2==1) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}
