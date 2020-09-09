package huan1;
/**
 * ����Thread�еĳ��÷�����
 * 1. start():������ǰ�̣߳����õ�ǰ�̵߳�run()
 * 2. run(): ͨ����Ҫ��дThread���еĴ˷��������������߳�Ҫִ�еĲ��������ڴ˷�����
 * 3. currentThread():��̬����������ִ�е�ǰ������߳�
 * 4. getName():��ȡ��ǰ�̵߳�����
 * 5. setName():���õ�ǰ�̵߳�����
 * 6. yield():�ͷŵ�ǰcpu��ִ��Ȩ
 * 7. join():���߳�a�е����߳�b��join(),��ʱ�߳�a�ͽ�������״̬��ֱ���߳�b��ȫִ�����Ժ��߳�a��
 *           ��������״̬��
 * 8. stop():�ѹ�ʱ����ִ�д˷���ʱ��ǿ�ƽ�����ǰ�̡߳�
 * 9. sleep(long millitime):�õ�ǰ�̡߳�˯�ߡ�ָ����millitime���롣��ָ����millitime����ʱ���ڣ���ǰ
 *                          �߳�������״̬��
 * 10. isAlive():�жϵ�ǰ�߳��Ƿ���
 *
 *
 * �̵߳����ȼ���
 * 1.
 * MAX_PRIORITY��10
 * MIN _PRIORITY��1
 * NORM_PRIORITY��5  -->Ĭ�����ȼ�
 * 2.��λ�ȡ�����õ�ǰ�̵߳����ȼ���
 *   getPriority():��ȡ�̵߳����ȼ�
 *   setPriority(int p):�����̵߳����ȼ�
 *
 *   ˵���������ȼ����߳�Ҫ��ռ�����ȼ��߳�cpu��ִ��Ȩ������ֻ�ǴӸ����Ͻ��������ȼ����̸߳߸��ʵ������
 *   ��ִ�С�������ζ��ֻ�е������ȼ����߳�ִ�����Ժ󣬵����ȼ����̲߳�ִ�С�
 *
 *
 */
class MyThread extends Thread{
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i%2==0) {
				
//				try {
//					sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i);
			}
			if(i%20==0) {
				yield();
			}
		}
		
		
	}
	//������
	public MyThread(String name) {
		super(name);
	}
	
	
}
public class ThreadMethodTest {
	public static void main(String[] args) {
		MyThread m1 = new MyThread("���߳�");
		
		
		//���÷��̵߳����ȼ�
		
		m1.setPriority(Thread.MAX_PRIORITY);
		
		
		
		
		//m1.setName("huan1");
		m1.start();
		
		
		
		Thread.currentThread().setName("���߳�");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		for (int i = 0; i < 100; i++) {
			if (i%2==0) {
				System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i);
			}
			
//			if (i==10) {
//				try {
//					m1.join();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
		}
		System.out.println(m1.isAlive());
	}
}
