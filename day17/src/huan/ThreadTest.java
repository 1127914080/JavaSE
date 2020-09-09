package huan;







class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 0;  i <100 ; i ++) {
			if (i%2==0) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
			
		}
	}
	
}
public class ThreadTest {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		//优先执行main下的
		/*eat();
		System.out.println("Hello");*/
		for(int i = 0;  i <100 ; i ++) {
			if (i%2==0) {
				System.out.println(Thread.currentThread().getName()+":"+"----------main"+i+"--------");
			}
			
		}
		
	}
	
	public static void eat() {
		System.out.println("人吃饭");
	}
}
