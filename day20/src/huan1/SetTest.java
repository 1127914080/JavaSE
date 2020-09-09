package huan1;
/**
 * 1. Set�ӿڵĿ�ܣ�
 *
 * |----Collection�ӿڣ����м��ϣ������洢һ��һ���Ķ���
 *          |----Set�ӿڣ��洢����ġ������ظ�������   -->���н��ġ����ϡ�
 *              |----HashSet����ΪSet�ӿڵ���Ҫʵ���ࣻ�̲߳���ȫ�ģ����Դ洢nullֵ
 *                  |----LinkedHashSet����ΪHashSet�����ࣻ�������ڲ�����ʱ�����԰�����ӵ�˳�����
 *                                      ����Ƶ���ı���������LinkedHashSetЧ�ʸ���HashSet.
 *              |----TreeSet�����԰�����Ӷ����ָ�����ԣ���������
 *
 *
 *  1. Set�ӿ���û�ж��ⶨ���µķ�����ʹ�õĶ���Collection���������ķ�����
 *
 *  2. Ҫ����Set(��Ҫָ��HashSet��LinkedHashSet)����ӵ����ݣ������ڵ���һ��Ҫ��дhashCode()��equals()
 *     Ҫ����д��hashCode()��equals()�����ܱ���һ���ԣ���ȵĶ�����������ȵ�ɢ����
 *      ��д����������С���ɣ����������� equals() �����Ƚϵ� Field����Ӧ���������� hashCode ֵ��
 *
 *
 * @author shkstart
 * @create 2019 ���� 3:40
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

import huan.Person;

/*
    һ��Set���洢����ġ������ظ�������
    ��HashSetΪ��˵����
    1. �����ԣ�����������ԡ��洢�������ڵײ������в��ǰ�������������˳����ӣ����Ǹ������ݵĹ�ϣֵ�����ġ�

    2. �����ظ��ԣ���֤��ӵ�Ԫ�ذ���equals()�ж�ʱ�����ܷ���true.������ͬ��Ԫ��ֻ�����һ����

    �������Ԫ�صĹ��̣���HashSetΪ����
        ������HashSet�����Ԫ��a,���ȵ���Ԫ��a�������hashCode()����������Ԫ��a�Ĺ�ϣֵ��
        �˹�ϣֵ����ͨ��ĳ���㷨�������HashSet�ײ������еĴ��λ�ã���Ϊ������λ�ã����ж�
        �����λ�����Ƿ��Ѿ���Ԫ�أ�
            �����λ����û������Ԫ�أ���Ԫ��a��ӳɹ��� --->���1
            �����λ����������Ԫ��b(����������ʽ���ڵĶ��Ԫ�أ�����Ƚ�Ԫ��a��Ԫ��b��hashֵ��
                ���hashֵ����ͬ����Ԫ��a��ӳɹ���--->���2
                ���hashֵ��ͬ��������Ҫ����Ԫ��a�������equals()������
                       equals()����true,Ԫ��a���ʧ��
                       equals()����false,��Ԫ��a��ӳɹ���--->���2

        ������ӳɹ������2�����3���ԣ�Ԫ��a ���Ѿ�����ָ������λ��������������ķ�ʽ�洢��
        jdk 7 :Ԫ��a�ŵ������У�ָ��ԭ����Ԫ�ء�
        jdk 8 :ԭ����Ԫ���������У�ָ��Ԫ��a
        �ܽ᣺���ϰ���

        HashSet�ײ㣺����+����Ľṹ��

     */
public class SetTest{
	
	@Test
	public void test1() {
		//  HashSet 
		Set set = new HashSet();
		set.add(123);
		set.add(456);
		set.add("AA");
		set.add("CC");
		set.add(new User("huan", 18));
		set.add(new User("hao", 18));
		set.add(129);
		
		
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());	
		}
			System.out.println("------------------");
	}
	
	
	@Test
	//LinkedHashSet
	//LinkedHashSet,��ΪHashSet�����࣬��������ݵ�ͬʱ��ÿ�����ݻ�ά�����������ã���¼������ǰһ�����ݺͺ�һ������
	//�ŵ㣺����Ƶ���ı���������Ч�ʸ���HashSet
	public void test2() {
		Set set = new LinkedHashSet();
		set.add(123);
		set.add(456);
		set.add("AA");
		set.add("CC");
		set.add(new User("huan", 18));
		set.add(new User("hao", 18));
		set.add(129);
		
		
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());	
		}
		
	}
	

	
}