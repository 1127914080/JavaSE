package demo;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
/**
 * �������õ�ʹ��
 *
 * 1.ʹ���龳����Ҫ���ݸ�Lambda��Ĳ������Ѿ���ʵ�ֵķ����ˣ�����ʹ�÷������ã�
 *
 * 2.�������ã������Ͼ���Lambda���ʽ����Lambda���ʽ��Ϊ����ʽ�ӿڵ�ʵ��������
 *   �������ã�Ҳ�Ǻ���ʽ�ӿڵ�ʵ����
 *
 * 3. ʹ�ø�ʽ��  ��(�����) :: ������
 *
 * 4. �����Ϊ���µ����������
 *    ���1     ���� :: �Ǿ�̬����
 *    ���2     �� :: ��̬����
 *
 *    ���3     �� :: �Ǿ�̬����
 *
 * 5. ��������ʹ�õ�Ҫ��Ҫ��ӿ��еĳ��󷽷����β��б�ͷ���ֵ�����뷽�����õķ�����
 *    �β��б�ͷ���ֵ������ͬ������������1�����2��
 *
 * Created by shkstart.
 */
public class MethodRefTest {

	// ���һ������ :: ʵ������
	//Consumer�е�void accept(T t)
	//PrintStream�е�void println(T t)
	@Test
	public void test1() {
		Consumer<String> con1 = str -> System.out.println(str);
		con1.accept("����");

		System.out.println("*******************");
		PrintStream ps = System.out;
		Consumer<String> con2 = ps::println;
		con2.accept("beijing");
	}
	
	//Supplier�е�T get()
	//Employee�е�String getName()
	@Test
	public void test2() {
		Employee emp = new Employee(1001,"Tom",23,5600);

		Supplier<String> sup1 = () -> emp.getName();
		System.out.println(sup1.get());

		System.out.println("*******************");
		Supplier<String> sup2 = emp::getName;
		System.out.println(sup2.get());

	}

	// ��������� :: ��̬����
	//Comparator�е�int compare(T t1,T t2)
	//Integer�е�int compare(T t1,T t2)
	@Test
	public void test3() {
		Comparator<Integer> com1 = (t1,t2) -> Integer.compare(t1,t2);
		System.out.println(com1.compare(12,21));

		System.out.println("*******************");

		Comparator<Integer> com2 = Integer::compare;
		System.out.println(com2.compare(12,3));

	}
	
	//Function�е�R apply(T t)
	//Math�е�Long round(Double d)
	@Test
	public void test4() {
		Function<Double,Long> func = new Function<Double, Long>() {
			@Override
			public Long apply(Double d) {
				return Math.round(d);
			}
		};

		System.out.println("*******************");

		Function<Double,Long> func1 = d -> Math.round(d);
		System.out.println(func1.apply(12.3));

		System.out.println("*******************");

		Function<Double,Long> func2 = Math::round;
		System.out.println(func2.apply(12.6));
	}

	// ��������� :: ʵ������  (���Ѷ�)
	// Comparator�е�int comapre(T t1,T t2)
	// String�е�int t1.compareTo(t2)
	@Test
	public void test5() {
		Comparator<String> com1 = (s1,s2) -> s1.compareTo(s2);
		System.out.println(com1.compare("abc","abd"));

		System.out.println("*******************");

		Comparator<String> com2 = String :: compareTo;
		System.out.println(com2.compare("abd","abm"));
	}

	//BiPredicate�е�boolean test(T t1, T t2);
	//String�е�boolean t1.equals(t2)
	@Test
	public void test6() {
		BiPredicate<String,String> pre1 = (s1,s2) -> s1.equals(s2);
		System.out.println(pre1.test("abc","abc"));

		System.out.println("*******************");
		BiPredicate<String,String> pre2 = String :: equals;
		System.out.println(pre2.test("abc","abd"));
	}
	
	// Function�е�R apply(T t)
	// Employee�е�String getName();
	@Test
	public void test7() {
		Employee employee = new Employee(1001, "Jerry", 23, 6000);


		Function<Employee,String> func1 = e -> e.getName();
		System.out.println(func1.apply(employee));

		System.out.println("*******************");
		

		Function<Employee,String> func2 = Employee::getName;
		System.out.println(func2.apply(employee));
	}

}

