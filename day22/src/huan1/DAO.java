package huan1;

import java.util.List;

/**
 * 
 *
 * DAO:data(base) access object
 */
public class DAO<T> { //��Ĺ��Բ���DAO

    //���һ����¼
    public void add(T t){

    }

    //ɾ��һ����¼
    public boolean remove(int index){

        return false;
    }

    //�޸�һ����¼
    public void update(int index,T t){

    }

    //��ѯһ����¼
    public T getIndex(int index){

        return null;
    }

    //��ѯ������¼
    public List<T> getForList(int index){

        return null;
    }

    //���ͷ���
    //��������ȡ����һ���ж�������¼����ȡ����Ա����ְʱ�䣿
    public <E> E getValue(){

        return null;
    }

}