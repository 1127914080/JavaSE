package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

import org.junit.Test;

/**
 * Lambda表达式的使用
 * 
 * @author hao
 *
 *         1.举例( o1,o2) -> Integer.compare(o1,o2) 
 *         2.格式： -> Lambda操作符 或者 剪头操作符 
 *         		   ->左边Lambda的形参列表，（其实就是接口中的抽象方法的形参列表） 
 *         		   -> 右边Lambda体，（其实就是重写的抽象方法的方法体）
 *         
 *         3.Lambda表达式的使用：（分为六种情况的使用）
 * 				总结：
 * 			-> 左边lambda形参列表的参数类型可以省略（类型推断）：如果lambda形参列表只有一个参数，其一对()可以省略
 * 			-> 右边lambda体应该用一对{}包裹，如果lambda体只有一条执行语句，可能是return语句省略一对{ } 和 return
 * 
 *         4.Lambda表达式的本质：作为接口的实例
 * 							 作为函数式接口的实例
 * 
 * 		   5.如果一个接口中，只声明了一个抽象方法，则此接口就成为函数式接口 ,我们可以在一个接口上使用
 * 				@FunctionalInterface,这样可以检查它是否是一个函数式接口
 * 		
 * 			
 * 		   6. 所以以前用匿名实现类表示现在都可以用lambda表达式来写
 */

public class LambdaTest1 {

	// 语法格式一：无参，无返回值
	@Test
	public void test1() {
		Runnable r1 = new Runnable() {

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

	// 语法格式二 ：Lambda需要一个参数，但是没有返回值
	@Test
	public void test2() {
		Consumer<String> con = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		};
		con.accept("雪糕和冰棍的区别是什么");
		System.out.println("------------------------");

		Consumer<String> con1 = (String s) -> {
			System.out.println(s);
		};
		con1.accept("一个吃完了拉肚子，一个吃完了闹肚子");
	}

	// 语法格式三：数据类型可以省略，因为可以由编译器推断得出，称为类型推断
	@Test
	public void test3() {
		Consumer<String> con = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		};
		con.accept("雪糕和冰棍的区别是什么");
		System.out.println("------------------------");

		Consumer<String> con1 = (s) -> {

			System.out.println(s);

		};
		con1.accept("不知道");

	}

	@Test
	public void test4() {
		ArrayList<String> list = new ArrayList<>(); // 类型推断
		int[] arr = { 1, 2, 3 }; // 类型推断
	}

	// 语法格式四：Lambda只需要一个参数时，参数的小括号可以省略
	@Test
	public void test5() {
		Consumer<String> con1 = (s) -> {

			System.out.println(s);

		};
		con1.accept("不知道");

		System.out.println("-----------------");

		Consumer<String> con2 = s -> {

			System.out.println(s);

		};
		con2.accept("知道");
	}

	// 语法格式五：Lambda需要两个或以上的参数，多条执行语句，并且可以有返回值
	@Test
	public void test6() {
		Comparator<Integer> com1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};

		System.out.println(com1.compare(25, 21));
		System.out.println("-----------------------------");
		Comparator<Integer> com2 = (o1, o2) -> {
			System.out.println(o1);
			System.out.println(o2);
			return o1.compareTo(o2);
		};
		System.out.println(com2.compare(99, 88));
	}

	// 语法格式六：当Lambda体只有一条语句时 ，return与大括号若有，都可以省略
	@Test
	public void test7() {
		Comparator<Integer> com1 = (o1, o2) -> {
			return o1.compareTo(o2);
		};
		System.out.println(com1.compare(99, 88));

		System.out.println("-----------------");

		Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);

		System.out.println(com2.compare(77, 88));

	}

	@Test
	public void test8() {
		Consumer<String> con2 = s -> {

			System.out.println(s);

		};
		con2.accept("知道");

		System.out.println("-----------------");

		Consumer<String> con3 = s ->

		System.out.println(s);

		con3.accept("知道");
	}

}
