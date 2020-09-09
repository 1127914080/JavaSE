package huan2;
/**
 * Collections:����Collection��Map�Ĺ�����
 *
 *
 * �����⣺Collection �� Collections������
 *
 *
 * @author shkstart
 * @create 2019 ���� 4:19
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/*
reverse(List)����ת List ��Ԫ�ص�˳��
shuffle(List)���� List ����Ԫ�ؽ����������
sort(List)������Ԫ�ص���Ȼ˳���ָ�� List ����Ԫ�ذ���������
sort(List��Comparator)������ָ���� Comparator ������˳��� List ����Ԫ�ؽ�������
swap(List��int�� int)����ָ�� list �����е� i ��Ԫ�غ� j ��Ԫ�ؽ��н���

Object max(Collection)������Ԫ�ص���Ȼ˳�򣬷��ظ��������е����Ԫ��
Object max(Collection��Comparator)������ Comparator ָ����˳�򣬷��ظ��������е����Ԫ��
Object min(Collection)
Object min(Collection��Comparator)
int frequency(Collection��Object)������ָ��������ָ��Ԫ�صĳ��ִ���
void copy(List dest,List src)����src�е����ݸ��Ƶ�dest��
boolean replaceAll(List list��Object oldVal��Object newVal)��ʹ����ֵ�滻 List ��������о�ֵ


*/











public class CollectionsTest {

	@Test
	public void test1() {
		  List list = new ArrayList();
	        list.add(123);
	        list.add(43);
	        list.add(765);
	        list.add(765);
	        list.add(765);
	        list.add(-97);
	        list.add(0);

	        
	        
	        System.out.println(list);
	       // reverse(List)����ת List ��Ԫ�ص�˳��
	       Collections.reverse(list);
	       System.out.println(list);
	        
	       
	       //shuffle(List)���� List ����Ԫ�ؽ����������  
	       Collections.shuffle(list); 
	       System.out.println(list); 
	       
	       //sort(List)������Ԫ�ص���Ȼ˳���ָ�� List ����Ԫ�ذ���������
	       Collections.sort(list);
	       System.out.println(list);
	       
	       //swap(List��int�� int)����ָ�� list �����е� i ��Ԫ�غ� j ��Ԫ�ؽ��н���
	       Collections.swap(list, 1, 2);
	       System.out.println(list);
	       
	       
	       //int frequency(Collection��Object)������ָ��������ָ��Ԫ�صĳ��ִ���
	       int frequency = Collections.frequency(list, 765);
	       System.out.println(frequency);
	
	          
	}
	
	
	
	
	
	
	
	   //void copy(List dest,List src)����src�е����ݸ��Ƶ�dest��	 
	    @Test
	    public void test2(){
	        List list = new ArrayList();
	        list.add(123);
	        list.add(43);
	        list.add(765);
	        list.add(-97);
	        list.add(0);

	        //���쳣��IndexOutOfBoundsException("Source does not fit in dest")
//	        List dest = new ArrayList();
//	        Collections.copy(dest,list);
	        //��ȷ�ģ�
	        List dest = Arrays.asList(new Object[list.size()]);
	        System.out.println(dest.size());//list.size();
	        Collections.copy(dest,list);

	        System.out.println(dest);


	        /*
	        Collections �����ṩ�˶�� synchronizedXxx() ������
	        �÷�����ʹ��ָ�����ϰ�װ���߳�ͬ���ļ��ϣ��Ӷ����Խ��
	        ���̲߳������ʼ���ʱ���̰߳�ȫ����

	         */
	        //���ص�list1��Ϊ�̰߳�ȫ��List
	        List list1 = Collections.synchronizedList(list);


	    }
	
	
	

}