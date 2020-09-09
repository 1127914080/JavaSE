package exer1;
import java.util.*;

/**
 * ����������� DAO<T>�������ж���һ��Map ��Ա������Map �ļ�Ϊ String ���ͣ�ֵΪ T ���͡�

 �ֱ𴴽����·�����
 public void save(String id,T entity)�� ���� T ���͵Ķ��� Map ��Ա������
 public T get(String id)���� map �л�ȡ id ��Ӧ�Ķ���
 public void update(String id,T entity)���滻 map ��keyΪid������,��Ϊ entity ����
 public List<T> list()������ map �д�ŵ����� T ����
 public void delete(String id)��ɾ��ָ�� id ����

 *
 * @author shkstart
 * @create 2019 ���� 3:34
 */
public class DAO<T> {

    private Map<String,T> map = new HashMap<String,T>();
    //���� T ���͵Ķ��� Map ��Ա������
    public void save(String id,T entity){
        map.put(id,entity);
    }
    //�� map �л�ȡ id ��Ӧ�Ķ���
    public T get(String id){
        return map.get(id);
    }
    //�滻 map ��keyΪid������,��Ϊ entity ����
    public void update(String id,T entity){
        if(map.containsKey(id)){
            map.put(id,entity);
        }
    }
    //���� map �д�ŵ����� T ����
    public List<T> list(){
        //����ģ�
//        Collection<T> values = map.values();
//        return (List<T>) values;
        //��ȷ�ģ�
        ArrayList<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for(T t : values){
            list.add(t);
        }
        return list;

    }
    //ɾ��ָ�� id ����
    public void delete(String id){
        map.remove(id);
    }

}
