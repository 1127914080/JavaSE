package huan5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *   -�����̵߳ķ�ʽ���� ʵ��Callable�ӿ�
 * @author hao
 *		-������ʵ��Callable�ӿڵķ�ʽ�������̱߳�ʵ��Runnable�ӿڴ������̷߳�ʽǿ��?
 *			1.call()���з���ֵ��
 *			2.call()�����׳��쳣��������Ĳ������񣬻�ȡ�쳣����Ϣ
 *			3.Callable��֧�ַ��͵�
 */
//1.����һ��ʵ��Callable��ʵ����
class NumThread implements Callable{
	//2.ʵ��call�����������߳���Ҫִ�еĲ���������call()��
	@Override
	public Object call() throws Exception {
		int sum =0;
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				System.out.println(i);
				sum += i;
			}
		}		
		return sum;
	}
}

public class ThreadNew {
	public static void main(String[] args) {
		//3.����callable�ӿ�ʵ����Ķ���
		NumThread n1 = new NumThread();
		//4.����callable�ӿ�ʵ����Ķ�����Ϊ���ݵ�FutureTask�Ĺ������У�����FutureTask����
		FutureTask f1 = new FutureTask(n1);
		//5.��FutureTask�Ķ�����Ϊ�������ݵ�Thread��Ĺ������� ������Thread���󣬲�����start();
		Thread t1 = new Thread(f1); 
		t1.start();
		
		try { 
			//get()����ֵ��ΪFutureTask����������Callableʵ�������ֵ�call()�ķ���ֵ
			//6.��ȡCallablez��call�ķ�������ֵ
			Object sum = f1.get();
			System.out.println(sum);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
