package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Stream;


import org.junit.Test;

import demo.Employee;
import demo.EmployeeData;

/**
 * 	����Stream���м����
 *  @author hao
 *
 */
public class StreamTest1 {
	@Test
	public void test1() {
		 List<Employee> list = EmployeeData.getEmployees();
	//  filter(Predicate p)�������� Lambda �� �������ų�ĳЩԪ�ء�
		  Stream<Employee> stream = list.stream();
		//��ϰ����ѯԱ������н�ʴ���7000��Ա����Ϣ
	        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);
		System.out.println("-----------------------------------------------------");
	        
	//  limit(n)�����ض�����ʹ��Ԫ�ز���������������
		  list.stream().limit(5).forEach(System.out::println);
	      System.out.println("-----------------------------------------------------");
		
		
	//  skip(n) ���� ����Ԫ�أ�����һ���ӵ���ǰ n ��Ԫ�ص�����������Ԫ�ز��� n �����򷵻�һ���������� limit(n) ����
	      list.stream().skip(3).forEach(System.out::println);
	      System.out.println("-----------------------------------------------------");
	      
	//  distinct()����ɸѡ��ͨ����������Ԫ�ص� hashCode() �� equals() ȥ���ظ�Ԫ��
	       	list.add(new Employee(1010,"��ǿ��",40,8000));
	        list.add(new Employee(1010,"��ǿ��",41,8000));
	        list.add(new Employee(1010,"��ǿ��",40,8000));
	        list.add(new Employee(1010,"��ǿ��",40,8000));
	        list.add(new Employee(1010,"��ǿ��",40,8000));
//	        System.out.println(list);

	        list.stream().distinct().forEach(System.out::println);
	}
	
	@Test
	public void test2() {
		//map(Function f)��������һ��������Ϊ��������Ԫ��ת����������ʽ����ȡ��Ϣ���ú����ᱻӦ�õ�ÿ��Ԫ���ϣ�������ӳ���һ���µ�Ԫ�ء�
		List<String> list = Arrays.asList("aa","bb","cc","dd");
		list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);	
		
		//��ϰ1����ȡԱ���������ȴ���3��Ա����������
		List<Employee> employees = EmployeeData.getEmployees();
		Stream<String> map = employees.stream().map(Employee::getName);
		map.filter(name -> name.length() > 3).forEach(System.out::println);
		//flatMap(Function f)��������һ��������Ϊ�����������е�ÿ��ֵ��������һ������Ȼ������������ӳ�һ������
        Stream<Character> characterStream = list.stream().flatMap(StreamTest1::fromStringToStream);
        characterStream.forEach(System.out::println);

    }

    //���ַ����еĶ���ַ����ɵļ���ת��Ϊ��Ӧ��Stream��ʵ��
    public static Stream<Character> fromStringToStream(String str){//aa
        ArrayList<Character> list = new ArrayList<>();
        for(Character c : str.toCharArray()){
            list.add(c);
        }
       return list.stream();

    }
	@Test
	public void test3() {
	    ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList list2 = new ArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);

//        list1.add(list2);
        list1.addAll(list2);
        System.out.println(list1);
	}
	
	//����
	@Test
	public void test4() {
//		 sorted()������Ȼ����
		List<Integer> asList = Arrays.asList(12,35,53,234,23,45,14);
		asList.stream().sorted().forEach(System.out::println);
		
	//  ���쳣��ԭ��û��ʵ��comparable�ӿ�
//		List<Employee> employees = EmployeeData.getEmployees();
//		employees.stream().sorted().forEach(System.out::println);		
		
//       sorted(Comparator com)������������
		List<Employee> employees = EmployeeData.getEmployees();
		employees.stream().sorted((e1,e2)->{
			return Integer.compare(e1.getAge(), e2.getAge());
		}).forEach(System.out::println);
	}
	
}
