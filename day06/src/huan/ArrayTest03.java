package huan;

import java.util.Scanner;

/**
 *  �Ӽ��̶���ѧ���ɼ����ҳ���߷֣������ѧ���ȼ�
 *  	�ɼ� >= ��߷� - 10  �ȼ�Ϊ'A' 
 * 		�ɼ� >= ��߷� - 20  �ȼ�Ϊ'B' 
 *		�ɼ� >= ��߷� - 30  �ȼ�Ϊ'C' 
 *		����			          �ȼ�Ϊ'D' 
 *
 *		�ȶ�ȡѧ��������������������int���飬���ѧ���ɼ�
 */
public class ArrayTest03 {
	public static void main(String[] args) {
		//ʹ��scanner ��ȡѧ������
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ������:");
		int number = sc.nextInt();
		//�������飬�洢ѧ���ɼ�����̬��ʼ��
		int[] soures= new int[number];
		//��������Ԫ�ظ�ֵ
		System.out.println("������"+number+"��ѧ���ɼ�");
		//��ȡ�����е����ֵ����߷�
		int maxScore = 0 ;
		for (int i = 0; i < soures.length; i++) {
			soures[i]=sc.nextInt();
			if (maxScore<soures[i]) {
				maxScore=soures[i];
			}
		}
		
		
//		for (int i = 0; i < soures.length; i++) {
//			if (maxScore<soures[i]) {
//				
//			}
//		}
		//����ÿ��ѧ���ɼ�����߷ֵĲ�ֵ���õ�ÿ��ѧ���ĵȼ������������
		char lever;
		for (int i = 0; i < soures.length; i++) {
			if (maxScore-soures[i] <= 10) {
				lever = 'A';
			}else if (maxScore-soures[i] <= 20) {
				lever = 'B';
			}else if (maxScore-soures[i] <= 30) {
				lever = 'C';
			}else  {
				lever = 'D';
			}
			System.out.println("Student:" + i + ":soure is:"
					+ soures[i] +",grade is:"+lever);
			
		}
	}
}
