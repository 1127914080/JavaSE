package huan;
/**
 * 
 * 
 *	1.һά����������ͳ�ʼ��
 *	2.��ε�������ĳ��Ⱥ�ָ��λ�õ�Ԫ��
 *	3.��λ�ȡ����ĳ���
 *	4.��α�������
 *	5.����Ԫ�ص�Ĭ�ϳ�ʼ��ֵ
 *	6.������ڴ����
 *
 */
public class ArrayTest {
	public static void main(String[] args) {
		//1.һά����������ͳ�ʼ��
		int num;//����
		num=10; //��ʼ��
		int id=1001; //����+��ʼ��
		
		int[] ids; //���� 
		//1.1��̬��ʼ�� : ����ĳ�ʼ��������Ԫ�صĸ�ֵ����ͬʱ���в���
		ids=new int[]{1001,1002,1003,1004};
		//1.2��̬��ʼ�� : ����ĳ�ʼ�� ������Ԫ�صĸ�ֵ�������ֿ�����
		String[] names = new String[4];

		/**
		 * д��
		 * 
		 *   1,int[] a = new int[]{1,2,3,4}
		 *   2,int[] b = new int[4]
		 */
		//�ܽ᣺����һ����ʼ����ɣ��䳤�Ⱦ�ȷ����
		
		//2.��ε�������ĳ��Ⱥ�ָ��λ�õ�Ԫ��: �Ǳ�ķ�ʽ
		//����ĽǱ�(������);�� 0  ��ʼ -1 ����
		names[0] = "١��";
		names[1] = "С����";
		names[2] = "����";
		names[3] = "С������";
		
		//3.��λ�ȡ����ĳ��� 
		//����: length
		System.out.println(names.length);
		System.out.println(ids.length);
		
		//4.��α�������
		//����һ��
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println("-----------");
		
		//������
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]); //��ʼ���� i ��ֵ��name[]�� ����[]��
		}
	} 
}	
