package com.lh.java;
/**
 * 
 *  	�����Ե�ʹ��
 *  	��Ա���� vs �ֲ�����
 *  	��ͬ��
 *  		1����������ĸ�ʽ  �������� ������ = ����ֵ
 *  		2������������ʹ��
 *  		3�������������Ӧ��������
 *  	��ͬ��
 *  		1��������������λ�ò�ͳ
 *  		���ԣ�ֱ�Ӷ��������һ��{}��
 *  		�ֲ������������ڷ����ڣ������βΣ�������ڣ�������
 *					�������ڣ��������ڲ��ı���
 *
 *			2������Ȩ�����η��Ĳ�ͬ
 *			���ԣ���������������ʱ��ָ����Ȩ�ޣ�ʹ��Ȩ�����η�
 *				����Ȩ�����η���private public ,ȱʡ�� protected
 */
public class Test02 {

}
class User{
	//��Ա����
	String name;
	int age;
	boolean isMale;
	
	//langage : �β�
	public void talk(String language) {
		System.out.println("����ʹ��"+language+"���н���");
	}
	
	public void eat() {
		String food= "�ӱ�"; //�ֲ�����
		System.out.println("������ϲ���ԣ�"+food);
	}
	
	
}