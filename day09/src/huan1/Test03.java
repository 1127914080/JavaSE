package huan1;

public class Test03 {
	public static void main(String[] args) {
		Test03 test = new Test03();
		int c = test.count(5);
		System.out.println(c);
	}

	public int count(int n) {
		if (n==1 && n==2) {
			return 1;
		}else {
			
			return (n-1)+(n-2);
		}
	}
}
