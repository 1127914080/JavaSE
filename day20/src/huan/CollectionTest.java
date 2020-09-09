package huan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;

/**
 * 	һ�����Ͽ�ܵĸ���
 *
 * 1.���ϡ����鶼�ǶԶ�����ݽ��д洢�����Ľṹ�����Java������
 *  	˵������ʱ�Ĵ洢����Ҫָ�����ڴ����Ĵ洢�����漰���־û��Ĵ洢��.txt,.jpg,.avi�����ݿ��У�
 *
 * 2.1 �����ڴ洢������ݷ�����ص㣺
 *      > һ����ʼ���Ժ��䳤�Ⱦ�ȷ���ˡ�
 *      > ����һ������ã���Ԫ�ص�����Ҳ��ȷ���ˡ�����Ҳ��ֻ�ܲ���ָ�����͵������ˡ�
 *       	���磺String[] arr;int[] arr1;Object[] arr2;
 * 2.2 �����ڴ洢������ݷ����ȱ�㣺
 *      > һ����ʼ���Ժ��䳤�ȾͲ����޸ġ�
 *      > �������ṩ�ķ����ǳ����ޣ�������ӡ�ɾ�����������ݵȲ������ǳ����㣬ͬʱЧ�ʲ��ߡ�
 *      > ��ȡ������ʵ��Ԫ�صĸ�������������û���ֳɵ����Ի򷽷�����
 *      > ����洢���ݵ��ص㣺���򡢿��ظ����������򡢲����ظ������󣬲������㡣
 *
 * 	�������Ͽ��
 *      |----Collection�ӿڣ����м��ϣ������洢һ��һ���Ķ���
 *          |----List�ӿڣ��洢����ġ����ظ������ݡ�  -->����̬������
 *              |----ArrayList��LinkedList��Vector
 *
 *          |----Set�ӿڣ��洢����ġ������ظ�������   -->���н��ġ����ϡ�
 *              |----HashSet��LinkedHashSet��TreeSet
 *
 *      |----Map�ӿڣ�˫�м��ϣ������洢һ��(key - value)һ�Ե�����   -->���к�����y = f(x)
 *              |----HashMap��LinkedHashMap��TreeMap��Hashtable��Properties
 *
 *
 *	 ����Collection�ӿ��еķ�����ʹ��
 *
 *
 *
 *
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();

        //add(Object e):��Ԫ��e��ӵ�����coll��
        coll.add("AA");
        coll.add("BB");
        coll.add(123);//�Զ�װ��
        coll.add(new Date());

        //size():��ȡ��ӵ�Ԫ�صĸ���
        System.out.println(coll.size());//4

        //addAll(Collection coll1):��coll1�����е�Ԫ����ӵ���ǰ�ļ�����
        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("CC");
        coll.addAll(coll1);

        System.out.println(coll.size());//6
        System.out.println(coll);

        //clear():��ռ���Ԫ��
        coll.clear();

        //isEmpty():�жϵ�ǰ�����Ƿ�Ϊ��
        System.out.println(coll.isEmpty());

    }

}
