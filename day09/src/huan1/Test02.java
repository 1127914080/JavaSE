package huan1;

public class Test02 {
	public static void main(String[] args) {

		Test02 test = new Test02();
		int f1 = test.f(10);
		System.out.println(f1);
	}
	
	//已知有一个数列，f(0) = 1 ,f(1) = 4 
	//f(n+2)=2*f(n+1)+f(n)
	//其中n是大于0的整数，求f(10)的值
	public int f(int n) {
		if (n==0) {
			return 1;
		}else if (n==1) {
			return 4;
		}else {
			return 2*f(n-1)-f(n-2);
		}
	}
}
