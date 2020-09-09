package lambda;

import java.util.Comparator;

import org.junit.Test;

public class LambdaTest {

	@Test
	public void test1() {
		Runnable r1= new Runnable() {
			
			@Override
			public void run() {
				System.out.println("我爱北京天安门");
				
			}
		};
		r1.run();
		System.out.println("---------------");
		
		Runnable r2 = () -> System.out.println("我爱北京故宫");
		r2.run();
		
	}
	
	@Test
	public void test2() {
		Comparator<Integer> com1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1, o2);
			}	
		};
		int compare1 = com1.compare(65, 22);
		System.out.println(compare1);
	}
	
	
	
	
	
	
}
