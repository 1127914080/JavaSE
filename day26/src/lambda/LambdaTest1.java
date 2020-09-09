package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

import org.junit.Test;

/**
 * Lambda���ʽ��ʹ��
 * 
 * @author hao
 *
 *         1.����( o1,o2) -> Integer.compare(o1,o2) 
 *         2.��ʽ�� -> Lambda������ ���� ��ͷ������ 
 *         		   ->���Lambda���β��б�����ʵ���ǽӿ��еĳ��󷽷����β��б� 
 *         		   -> �ұ�Lambda�壬����ʵ������д�ĳ��󷽷��ķ����壩
 *         
 *         3.Lambda���ʽ��ʹ�ã�����Ϊ���������ʹ�ã�
 * 				�ܽ᣺
 * 			-> ���lambda�β��б�Ĳ������Ϳ���ʡ�ԣ������ƶϣ������lambda�β��б�ֻ��һ����������һ��()����ʡ��
 * 			-> �ұ�lambda��Ӧ����һ��{}���������lambda��ֻ��һ��ִ����䣬������return���ʡ��һ��{ } �� return
 * 
 *         4.Lambda���ʽ�ı��ʣ���Ϊ�ӿڵ�ʵ��
 * 							 ��Ϊ����ʽ�ӿڵ�ʵ��
 * 
 * 		   5.���һ���ӿ��У�ֻ������һ�����󷽷�����˽ӿھͳ�Ϊ����ʽ�ӿ� ,���ǿ�����һ���ӿ���ʹ��
 * 				@FunctionalInterface,�������Լ�����Ƿ���һ������ʽ�ӿ�
 * 		
 * 			
 * 		   6. ������ǰ������ʵ�����ʾ���ڶ�������lambda���ʽ��д
 */

public class LambdaTest1 {

	// �﷨��ʽһ���޲Σ��޷���ֵ
	@Test
	public void test1() {
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("�Ұ������찲��");

			}
		};
		r1.run();
		System.out.println("---------------");

		Runnable r2 = () -> System.out.println("�Ұ������ʹ�");
		r2.run();
	}

	// �﷨��ʽ�� ��Lambda��Ҫһ������������û�з���ֵ
	@Test
	public void test2() {
		Consumer<String> con = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		};
		con.accept("ѩ��ͱ�����������ʲô");
		System.out.println("------------------------");

		Consumer<String> con1 = (String s) -> {
			System.out.println(s);
		};
		con1.accept("һ�������������ӣ�һ���������ֶ���");
	}

	// �﷨��ʽ�����������Ϳ���ʡ�ԣ���Ϊ�����ɱ������ƶϵó�����Ϊ�����ƶ�
	@Test
	public void test3() {
		Consumer<String> con = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		};
		con.accept("ѩ��ͱ�����������ʲô");
		System.out.println("------------------------");

		Consumer<String> con1 = (s) -> {

			System.out.println(s);

		};
		con1.accept("��֪��");

	}

	@Test
	public void test4() {
		ArrayList<String> list = new ArrayList<>(); // �����ƶ�
		int[] arr = { 1, 2, 3 }; // �����ƶ�
	}

	// �﷨��ʽ�ģ�Lambdaֻ��Ҫһ������ʱ��������С���ſ���ʡ��
	@Test
	public void test5() {
		Consumer<String> con1 = (s) -> {

			System.out.println(s);

		};
		con1.accept("��֪��");

		System.out.println("-----------------");

		Consumer<String> con2 = s -> {

			System.out.println(s);

		};
		con2.accept("֪��");
	}

	// �﷨��ʽ�壺Lambda��Ҫ���������ϵĲ���������ִ����䣬���ҿ����з���ֵ
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

	// �﷨��ʽ������Lambda��ֻ��һ�����ʱ ��return����������У�������ʡ��
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
		con2.accept("֪��");

		System.out.println("-----------------");

		Consumer<String> con3 = s ->

		System.out.println(s);

		con3.accept("֪��");
	}

}
