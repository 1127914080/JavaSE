package huan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/**
 * 1. List�ӿڿ��
 *
 *    |----Collection�ӿڣ����м��ϣ������洢һ��һ���Ķ���
 *          |----List�ӿڣ��洢����ġ����ظ������ݡ�  -->����̬������,�滻ԭ�е�����
 *              |----ArrayList����ΪList�ӿڵ���Ҫʵ���ࣻ�̲߳���ȫ�ģ�Ч�ʸߣ��ײ�ʹ��Object[] elementData�洢
 *              |----LinkedList������Ƶ���Ĳ��롢ɾ��������ʹ�ô���Ч�ʱ�ArrayList�ߣ��ײ�ʹ��˫������洢
 *              |----Vector����ΪList�ӿڵĹ���ʵ���ࣻ�̰߳�ȫ�ģ�Ч�ʵͣ��ײ�ʹ��Object[] elementData�洢
 *
 *
 *   2. ArrayList��Դ�������
 *   2.1 jdk 7�����
 *      ArrayList list = new ArrayList();//�ײ㴴���˳�����10��Object[]����elementData
 *      list.add(123);//elementData[0] = new Integer(123);
 *      ...
 *      list.add(11);//����˴ε���ӵ��µײ�elementData�������������������ݡ�
 *      Ĭ������£�����Ϊԭ����������1.5����ͬʱ��Ҫ��ԭ�������е����ݸ��Ƶ��µ������С�
 *
 *      ���ۣ����鿪����ʹ�ô��εĹ�������ArrayList list = new ArrayList(int capacity)
 *
 *   2.2 jdk 8��ArrayList�ı仯��
 *      ArrayList list = new ArrayList();//�ײ�Object[] elementData��ʼ��Ϊ{}.��û�д�������Ϊ10������
 *
 *      list.add(123);//��һ�ε���add()ʱ���ײ�Ŵ����˳���10�����飬��������123��ӵ�elementData[0]
 *      ...
 *      ��������Ӻ����ݲ�����jdk 7 ���졣
 *   2.3 С�᣺jdk7�е�ArrayList�Ķ���Ĵ��������ڵ����Ķ���ʽ����jdk8�е�ArrayList�Ķ���
 *            �Ĵ��������ڵ���������ʽ���ӳ�������Ĵ�������ʡ�ڴ档
 *
 *  3. LinkedList��Դ�������
 *      LinkedList list = new LinkedList(); �ڲ�������Node���͵�first��last���ԣ�Ĭ��ֵΪnull
 *      list.add(123);//��123��װ��Node�У�������Node����
 *
 *      ���У�Node����Ϊ��������LinkedList��˫�������˵��
 *      private static class Node<E> {
             E item;
             Node<E> next;
             Node<E> prev;

             Node(Node<E> prev, E element, Node<E> next) {
             this.item = element;
             this.next = next;
             this.prev = prev;
             }
         }
 *
 *   4. Vector��Դ�������jdk7��jdk8��ͨ��Vector()��������������ʱ���ײ㶼�����˳���Ϊ10�����顣
 *      �����ݷ��棬Ĭ������Ϊԭ�������鳤�ȵ�2����
 *
 *  �����⣺ArrayList��LinkedList��Vector���ߵ���ͬ��
 *  ͬ�������඼��ʵ����List�ӿڣ��洢���ݵ��ص���ͬ���洢����ġ����ظ�������
 *  ��ͬ������
 *
 *
 *
 *   5. List�ӿ��еĳ��÷���
 *
 *
 *
 *
 */


	/**
	 *    
	 *	void add(int index, Object ele):��indexλ�ò���eleԪ��
	 *	boolean addAll(int index, Collection eles):��indexλ�ÿ�ʼ��eles�е�����Ԫ����ӽ���
	 *	Object get(int index):��ȡָ��indexλ�õ�Ԫ��
	 *	int indexOf(Object obj):����obj�ڼ������״γ��ֵ�λ��
	 *	int lastIndexOf(Object obj):����obj�ڵ�ǰ������ĩ�γ��ֵ�λ��
	 *	Object remove(int index):�Ƴ�ָ��indexλ�õ�Ԫ�أ������ش�Ԫ��
	 *	Object set(int index, Object ele):����ָ��indexλ�õ�Ԫ��Ϊele
	 *	List subList(int fromIndex, int toIndex):���ش�fromIndex��toIndexλ�õ��Ӽ���

	 *	�ܽ᣺���÷���
                           ����add(Object obj)
		      ɾ��remove(int index) / remove(Object obj)
                           �ģ�set(int index, Object ele)
                           �飺get(int index)
                           �壺add(int index, Object ele)
                          ���ȣ�size()
                       �������� Iterator��������ʽ
             �� ��ǿforѭ��
             �� ��ͨ��ѭ��

     */	
public class ListTest {

		@Test
		public void test1() {
			ArrayList list = new ArrayList();
			list.add(123);
			list.add(456);
			list.add("huan");
			list.add(new Person("����",22));
			list.add(456);
			
			System.out.println(list);
			System.out.println("---------------------------------");
			//void add(int index, Object ele):��indexλ�ò���eleԪ��
			list.add(1, 789);
			System.out.println(list);
		
			System.out.println("---------------------------------");
		
			//boolean addAll(int index, Collection eles):��indexλ�ÿ�ʼ��eles�е�����Ԫ����ӽ���
			List list1 = Arrays.asList(1,2,3);
			list.addAll(list1); //����
		//	list.add(list1);  //����
			System.out.println(list.size());
			System.out.println("-------------");
		//Object get(int index):��ȡָ��indexλ�õ�Ԫ��
			System.out.println(list.get(3));	
			
		}
		
		@Test
		public void test2() {
			ArrayList list = new ArrayList();
			list.add(123);
			list.add(456);
			list.add("huan");
			list.add(new Person("����",22));
			list.add(456);
			
			//int indexOf(Object obj):����obj�ڼ������״γ��ֵ�λ��
			int index = list.indexOf(123);
			System.out.println(index);
			System.out.println("-------------------------");
			
			//int lastIndexOf(Object obj):����obj�ڵ�ǰ������ĩ�γ��ֵ�λ��
			
			int index1 = list.lastIndexOf(456);
			System.out.println(index1);
			System.out.println("----------------------------");
			//Object remove(int index):�Ƴ�ָ��indexλ�õ�Ԫ�أ������ش�Ԫ��
			Object r1 = list.remove(0);
			System.out.println(r1);
			System.out.println(list);
			
			System.out.println("----------------------------");
			//Object set(int index, Object ele):����ָ��indexλ�õ�Ԫ��Ϊele
			
			list.set(1, "cc");
			System.out.println(list);
			
			
			
			//List subList(int fromIndex, int toIndex):���ش�fromIndex��toIndexλ�õ��Ӽ���
		
			List subList = list.subList(2, 4);
			System.out.println(subList);
			System.out.println(list);

		}
	
		@Test
		public void test3() {
			ArrayList list = new ArrayList();
			list.add(123);
			list.add(456);
			list.add("huan");
			list.add(new Person("����",22));
		
		//������
		//��ʽһ��������
			Iterator ite = list.iterator();
			while (ite.hasNext()) {
				System.out.println(ite.next());
				
			}
			
		//��ʽ������ǿforѭ��
			System.out.println("-------------");
			for (Object obj : list) {
				System.out.println(obj);
			}
	
		//��ʽ������ͨѭ��
			System.out.println("-------------");
			for(int i=0 ; i < list.size();i++) {
				System.out.println(list.get(i));
			}
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
