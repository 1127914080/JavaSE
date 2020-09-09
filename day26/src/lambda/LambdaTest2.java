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
 * 	java����4����ĺ���ʽ�ӿ�
 * 		�����ͽӿ�Consumer<T>       void accept(T t)
 *		�����ͽӿ�Supplier<T>       T get()
 *		�����ͽӿ�Function<T,R>     R apply(T t)
 *		�϶��ͽӿ�Predicate<T>      boolean test(T t)
 *
 */


public class LambdaTest2 {

	@Test
	public void test1() {
		happyTime(5000, new Consumer<Double>() {

			@Override
			public void accept(Double t) {
				System.out.println("ѧϰ��̫���ˣ�ȥ�����˼�����ƿ��Ȫˮ ���۸�Ϊ"+t);
				
			}
		});
		
		
		System.out.println("--------------------");
		
		happyTime(4000, money -> System.out.println("ѧϰ��̫���ˣ�ȥ�����˼�����ƿ��Ȫˮ ���۸�Ϊ"+money));
		
		
	}
	
	public void happyTime(double money,Consumer<Double> ccn) {
		ccn.accept(money);
	}
	
	
	@Test
	public void test2() {
		List<String> list = Arrays.asList("����","�Ͼ�","���","����","����","�վ�");
		List<String> filterStrs = fileterString(list, new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.contains("��");
			}
		});
		System.out.println(filterStrs);
		System.out.println("------------------");
		
		List<String> filterStrs1 = fileterString(list, s ->s.contains("��"));
		System.out.println(filterStrs1);
		
	}
	
	//���ݸ����Ĺ��򣬹��˼����е��ַ������˹�����Predicate�ķ�������
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
