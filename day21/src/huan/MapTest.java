package huan;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * һ��Map��ʵ����Ľṹ��
 *  |----Map:˫�����ݣ��洢key-value�Ե�����   ---�����ڸ��еĺ�����y = f(x)
 *         |----HashMap:��ΪMap����Ҫʵ���ࣻ�̲߳���ȫ�ģ�Ч�ʸߣ��洢null��key��value
 *              |----LinkedHashMap:��֤�ڱ���mapԪ��ʱ�����԰�����ӵ�˳��ʵ�ֱ�����
 *                      ԭ����ԭ�е�HashMap�ײ�ṹ�����ϣ������һ��ָ�룬ָ��ǰһ���ͺ�һ��Ԫ�ء�
 *                      ����Ƶ���ı�������������ִ��Ч�ʸ���HashMap��
 *         |----TreeMap:��֤������ӵ�key-value�Խ�������ʵ�������������ʱ����key����Ȼ�����������
 *                      �ײ�ʹ�ú����
 *         |----Hashtable:��Ϊ���ϵ�ʵ���ࣻ�̰߳�ȫ�ģ�Ч�ʵͣ����ܴ洢null��key��value
 *              |----Properties:���������������ļ���key��value����String����
 *
 *
 *      HashMap�ĵײ㣺����+����  ��jdk7��֮ǰ��
 *                    ����+����+����� ��jdk 8��
 *
 *
 *  �����⣺
 *  1. HashMap�ĵײ�ʵ��ԭ��
 *  2. HashMap �� Hashtable����ͬ��
 *  3. CurrentHashMap �� Hashtable����ͬ������ʱ������
 *
 *  ����Map�ṹ����⣺
 *    Map�е�key:����ġ������ظ��ģ�ʹ��Set�洢���е�key  ---> key���ڵ���Ҫ��дequals()��hashCode() ����HashMapΪ����
 *    Map�е�value:����ġ����ظ��ģ�ʹ��Collection�洢���е�value --->value���ڵ���Ҫ��дequals()
 *    һ����ֵ�ԣ�key-value������һ��Entry����
 *    Map�е�entry:����ġ������ظ��ģ�ʹ��Set�洢���е�entry
 *
 *  ����HashMap�ĵײ�ʵ��ԭ����jdk7Ϊ��˵����
 *      HashMap map = new HashMap():
 *      ��ʵ�����Ժ󣬵ײ㴴���˳�����16��һά����Entry[] table��
 *      ...�����Ѿ�ִ�й����put...
 *      map.put(key1,value1):
 *      ���ȣ�����key1�������hashCode()����key1��ϣֵ���˹�ϣֵ����ĳ���㷨�����Ժ󣬵õ���Entry�����еĴ��λ�á�
 *      �����λ���ϵ�����Ϊ�գ���ʱ��key1-value1��ӳɹ��� ----���1
 *      �����λ���ϵ����ݲ�Ϊ�գ�(��ζ�Ŵ�λ���ϴ���һ����������(��������ʽ����)),�Ƚ�key1���Ѿ����ڵ�һ����������
 *      �Ĺ�ϣֵ��
 *              ���key1�Ĺ�ϣֵ���Ѿ����ڵ����ݵĹ�ϣֵ������ͬ����ʱkey1-value1��ӳɹ���----���2
 *              ���key1�Ĺ�ϣֵ���Ѿ����ڵ�ĳһ������(key2-value2)�Ĺ�ϣֵ��ͬ�������Ƚϣ�����key1�������equals(key2)�������Ƚϣ�
 *                      ���equals()����false:��ʱkey1-value1��ӳɹ���----���3
 *                      ���equals()����true:ʹ��value1�滻value2��
 *
 *       ���䣺�������2�����3����ʱkey1-value1��ԭ��������������ķ�ʽ�洢��
 *
 *      �ڲ��ϵ���ӹ����У����漰���������⣬�������ٽ�ֵ(��Ҫ��ŵ�λ�÷ǿ�)ʱ�����ݡ�Ĭ�ϵ����ݷ�ʽ������Ϊԭ��������2��������ԭ�е����ݸ��ƹ�����
 *
 *      jdk8 �����jdk7�ڵײ�ʵ�ַ���Ĳ�ͬ��
 *      1. new HashMap():�ײ�û�д���һ������Ϊ16������
 *      2. jdk 8�ײ�������ǣ�Node[],����Entry[]
 *      3. �״ε���put()����ʱ���ײ㴴������Ϊ16������
 *      4. jdk7�ײ�ṹֻ�У�����+����jdk8�еײ�ṹ������+����+�������
 *         4.1 �γ�����ʱ�����ϰ��£�jdk7:�µ�Ԫ��ָ��ɵ�Ԫ�ء�jdk8���ɵ�Ԫ��ָ���µ�Ԫ�أ�
           4.2 �������ĳһ������λ���ϵ�Ԫ����������ʽ���ڵ����ݸ��� > 8 �ҵ�ǰ����ĳ��� > 64ʱ����ʱ������λ���ϵ������ݸ�Ϊʹ�ú�����洢��
 *
 *      DEFAULT_INITIAL_CAPACITY : HashMap��Ĭ��������16
 *      DEFAULT_LOAD_FACTOR��HashMap��Ĭ�ϼ������ӣ�0.75
 *      threshold�����ݵ��ٽ�ֵ��=����*������ӣ�16 * 0.75 => 12
 *      TREEIFY_THRESHOLD��Bucket�������ȴ��ڸ�Ĭ��ֵ��ת��Ϊ�����:8
 *      MIN_TREEIFY_CAPACITY��Ͱ�е�Node������ʱ��С��hash������:64
 *
 *  �ġ�LinkedHashMap�ĵײ�ʵ��ԭ���˽⣩
 *      Դ���У�
 *      static class Entry<K,V> extends HashMap.Node<K,V> {
             Entry<K,V> before, after;//�ܹ���¼��ӵ�Ԫ�ص��Ⱥ�˳��
             Entry(int hash, K key, V value, Node<K,V> next) {
                super(hash, key, value, next);
             }
         }
 *
 *
 *   �塢Map�ж���ķ�����
 ��ӡ�ɾ�����޸Ĳ�����
 Object put(Object key,Object value)����ָ��key-value��ӵ�(���޸�)��ǰmap������
 void putAll(Map m):��m�е�����key-value�Դ�ŵ���ǰmap��
 Object remove(Object key)���Ƴ�ָ��key��key-value�ԣ�������value
 void clear()����յ�ǰmap�е���������
 Ԫ�ز�ѯ�Ĳ�����
 Object get(Object key)����ȡָ��key��Ӧ��value
 boolean containsKey(Object key)���Ƿ����ָ����key
 boolean containsValue(Object value)���Ƿ����ָ����value
 int size()������map��key-value�Եĸ���
 boolean isEmpty()���жϵ�ǰmap�Ƿ�Ϊ��
 boolean equals(Object obj)���жϵ�ǰmap�Ͳ�������obj�Ƿ����
 Ԫ��ͼ�����ķ�����
 Set keySet()����������key���ɵ�Set����
 Collection values()����������value���ɵ�Collection����
 Set entrySet()����������key-value�Թ��ɵ�Set����

 *�ܽ᣺���÷�����
 * ��ӣ�put(Object key,Object value)
 * ɾ����remove(Object key)
 * �޸ģ�put(Object key,Object value)
 * ��ѯ��get(Object key)
 * ���ȣ�size()
 * ������keySet() / values() / entrySet()
 *
 *
 *
 *
 */
public class MapTest {

	@Test
	public void test1() {
		
		Map map = new HashMap();
		map.put(null, 123);
		
		
	}
}
