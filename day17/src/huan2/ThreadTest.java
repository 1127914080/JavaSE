package huan2;
/**
 *    -创建多线程的方式二： 实现Runnable接口
 *    		1.创建一个实现了Runnable接口的类
 *    		2.实现类去实现Runnable中的抽象方法 run()
 *    		3.创建实现类的对象
 *    		4.将此对象作为参数传递到Thread类的构造器，创建Thread类的对象
 *    		5.通过Thread类的对象去调用start()
 *    
 * 	  -创建线程的两个方式
 * 		开发中优先选择：实现Runnable接口的方式
 * 		原因：1.实现方式的类没有单继承的局限性
 * 			2.实现的方式更适合用来处理多个线程有共享数据的情况
 * 
 * 	  -联系：public class Thread implements Runnable
 * 		相同点 两种方式都需要重写run() , 将线程要执行的逻辑声明都在run()中
 * 
 */

//1.创建一个实现了Runnable接口的类
class MyThread implements Runnable{

//2.实现类去实现Runnable中的抽象方法 run()
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
		//3.创建实现类的对象
		MyThread m1 = new MyThread();
		//4.将此对象作为参数传递到Thread类的构造器，创建Thread类
		Thread t1 = new Thread(m1);
		/*
		 * 5.通过Thread类的对象去调用start() ① 启动线程    ② 调用当前线程的run ->调用了Runnable类型的target的run()
		 *                                         
		 */
		t1.start();
	}
}
