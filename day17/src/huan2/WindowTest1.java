package huan2;






class MyThread12 implements Runnable{

	private static int ticket = 100;
	
	@Override
	public void run() {
		while(true) {
			if (ticket > 0) {
				System.out.println(Thread.currentThread().getName()+"Ʊ��Ϊ��"+ticket);
				ticket--;
			}else {
				break;
			}
		}
		
	}
	
}
public class WindowTest1 {
	public static void main(String[] args) {
		MyThread12 w = new MyThread12();
		
		
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);
		
		
		t1.setName("����1");
		t2.setName("����2");
		t3.setName("����3");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
