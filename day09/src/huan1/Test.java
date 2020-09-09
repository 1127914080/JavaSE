package huan1;
/**
 * 
 * @author 
 * 		递归：方法调用本身
 * 
 *
 */


public class Test {
	public static void main(String[] args) {
		
		//计算1-100自然数的总和
		int sum= 0 ;
		for (int i = 0; i <= 100; i++) {
			sum+=i;		
		}
		System.out.println(sum);
		
		Test test = new Test();
		int sum2 = test.getSum(100);
		System.out.println("1到100的总和是："+sum2);
	}
	//递归啊(自己调用自己本身)
	public int getSum(int t) {
		if (t==1) {
			return 1;
		}else {
			return t+ getSum(t-1);
		}
	}
}
