package huan;
/**
 * 
 * 
 *  == :运算符
 *  	1.可以使用在基本数据类型变量和引用数据类型变量中
 *		2.如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等(不一定类型要相同)
 *		3.如果比较的是引用数据类型变量：比较两个对象的地址值是否相等
 * 	equals()方法的使用
 * 		1.是一个方法，非运算符
 * 		2.只能使用引用数据类型
 * 	 equals() 和 == 的作用是相同的 比较两个地址值是否相同
 * 	
 * 5.通常情况下，我们自定义的类如果使用equals()的话，也通常是笔记爱两个兑现的
 * 		："实体内容是否相同"，那么，我们就需要对Object类中的equals()进行重写
 */
public class EqualTest {
	public static void main(String[] args) {
		 int i =10;
		 int j = 10;
		System.out.println(i == j);
		System.out.println("--------------");
		String s1 = new String("123");
		String s2 = new String("123");
		
		System.out.println(s1.equals(s2));
	}
}
