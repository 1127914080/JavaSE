package lambda;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.sameInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.junit.Test;

/**
 * 
 * @author hao
 *
 *	
 * 	java内置4大核心函数式接口
 * 		消费型接口Consumer<T>       void accept(T t)
 *		供给型接口Supplier<T>       T get()
 *		函数型接口Function<T,R>     R apply(T t)
 *		断定型接口Predicate<T>      boolean test(T t)
 *
 */


public class LambdaTest2 {

	@Test
	public void test1() {
		happyTime(5000, new Consumer<Double>() {

			@Override
			public void accept(Double t) {
				System.out.println("学习，太累了，去天上人间买了瓶矿泉水 ，价格为"+t);
				
			}
		});
		
		
		System.out.println("--------------------");
		
		happyTime(4000, money -> System.out.println("学习，太累了，去天上人间买了瓶矿泉水 ，价格为"+money));
		
		
	}
	
	public void happyTime(double money,Consumer<Double> ccn) {
		ccn.accept(money);
	}
	
	
	@Test
	public void test2() {
		List<String> list = Arrays.asList("北京","南京","天津","东京","西京","普京");
		List<String> filterStrs = fileterString(list, new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.contains("京");
			}
		});
		System.out.println(filterStrs);
		System.out.println("------------------");
		
		List<String> filterStrs1 = fileterString(list, s ->s.contains("京"));
		System.out.println(filterStrs1);
		
	}
	
	//根据给定的规则，过滤集合中的字符串，此规则由Predicate的方法决定
	public List<String> fileterString(List<String> list,Predicate<String> pre) {
		ArrayList<String> filterList = new ArrayList<>();
		for (String s : list) {
			if (pre.test(s)) {
				filterList.add(s);
			}
		}
		return filterList;
		
	}
	
	
}
