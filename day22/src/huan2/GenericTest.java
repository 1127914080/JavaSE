package huan2;
/**
*
* 1. �����ڼ̳з��������
*
*
* 2. ͨ�����ʹ��
*
* @author shkstart
* @create 2019 ���� 2:13
*/

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class GenericTest {

   /*
   1. �����ڼ̳з��������

     ��Ȼ��A����B�ĸ��࣬����G<A> ��G<B>���߲��߱��Ӹ����ϵ�������ǲ��й�ϵ��

      ���䣺��A����B�ĸ��࣬A<G> �� B<G> �ĸ���

    */
	
	@Test
	public void test1() {
		
		Object object = null;
		String string = null;
		object = string;
		
		Object[] arr1 = null;
	    String[] arr2 = null;
	    arr1 = arr2;
		
        List<Object> list1 = null;
        List<String> list2 = new ArrayList<String>();
        //��ʱ��list1��list2�����Ͳ������Ӹ����ϵ
        //���벻ͨ��
//        list1 = list2;
        
        
        //���벻ͨ��
//      Date date = new Date();
//      string = date;
		
        /*
        ��֤����
        ����list1 = list2;
           list1.add(123);���»����String�����ݡ�����

         */

        show(list1);
        show1(list2);

    }



    public void show1(List<String> list){

    }

    public void show(List<Object> list){

    }	
	
    @Test
    public void test2(){

        AbstractList<String> list1 = null;
        List<String> list2 = null;
        ArrayList<String> list3 = null;

        list1 = list3;
        list2 = list3;

        List<String> list4 = new ArrayList<>();

    }
    /*
    2. ͨ�����ʹ��
       ͨ�����?

       ��A����B�ĸ��࣬G<A>��G<B>��û�й�ϵ�ģ����߹�ͬ�ĸ����ǣ�G<?>


     */
	
	
	
	@Test
	public void test3() {
		 List<Object> list1 = null;
	     List<String> list2 = null;

	     List<?> list = null;
	     //����ͨ��
//       print(list1);
//       print(list2);
     
	     
	       //
	        List<String> list3 = new ArrayList<>();
	        list3.add("AA");
	        list3.add("BB");
	        list3.add("CC");
	        list = list3;
	        //���(д��)������List<?>�Ͳ��������ڲ�������ݡ�
	        //�������null֮�⡣
//	        list.add("DD");
//	        list.add('?');

	        list.add(null);

	        //��ȡ(��ȡ)�������ȡ���ݣ���ȡ����������ΪObject��
	        Object o = list.get(0);
	        System.out.println(o);


	    }
	
	
	 public void print(List<?> list){
	        Iterator<?> iterator = list.iterator();
	        while(iterator.hasNext()){
	            Object obj = iterator.next();
	            System.out.println(obj);
	        }
	    }
	
	
	   /*
	    3.������������ͨ�����ʹ�á�
	        ? extends A:
	                G<? extends A> ������ΪG<A>��G<B>�ĸ��࣬����B��A������

	        ? super A:
	                G<? super A> ������ΪG<A>��G<B>�ĸ��࣬����B��A�ĸ���

	     */
	    @Test
	    public void test4(){

	        List<? extends Person> list1 = null;
	        List<? super Person> list2 = null;

	        List<Student> list3 = new ArrayList<Student>();
	        List<Person> list4 = new ArrayList<Person>();
	        List<Object> list5 = new ArrayList<Object>();

	        list1 = list3;
	        list1 = list4;
//	        list1 = list5;

//	        list2 = list3;
	        list2 = list4;
	        list2 = list5;

	        //��ȡ���ݣ�
	        list1 = list3;
	        Person p = list1.get(0);
	        //���벻ͨ��
	        //Student s = list1.get(0);

	        list2 = list4;
	        Object obj = list2.get(0);
	        ////���벻ͨ��
//	        Person obj = list2.get(0);

	        //д�����ݣ�
	        //���벻ͨ��
//	        list1.add(new Student());

	        //����ͨ��
	        list2.add(new Person());
	        list2.add(new Student());

	    }
}
