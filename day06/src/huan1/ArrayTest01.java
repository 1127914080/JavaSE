package huan1;

/**
 * 1.��ά����������ͳ�ʼ�� 
 * 2.��ε�������ĳ��Ⱥ�ָ��λ�õ�Ԫ�� 
 * 3.��λ�ȡ����ĳ��� 
 * 4.��α������� 
 * 5.����Ԫ�ص�Ĭ�ϳ�ʼ��ֵ
 * 6.������ڴ����
 */
public class ArrayTest01 {
	public static void main(String[] args) {
		//1,��ά����������ͳ�ʼ��
		int[] arr=new int[]{1,2,3,4,5};
		//��̬��ʼ��
		int[][] arr1= new int[][]{{1,2,3,4,5},{6,7,8},{9}};
		//��̬��ʼ��1
		String[][] arr3 = new String[3][5];
		//��̬��ʼ��2
		String[][] arr4 = new String[3][];
		//����д��
		int[] arr5[] = new int[][]{{1,2,3,4,5},{6,7,8},{10}};
		int arr6[][] = new int[][]{{1,2,3,5},{6,7,8},{10}};
	
	
		//2.��ε�������ĳ��Ⱥ�ָ��λ�õ�Ԫ�� 
		System.out.println(arr1[0][2]); // 3
		System.out.println(arr3[1][1]); // null
		arr4[1]=  new String[4];
		System.out.println(arr4[1][0]);
				
		//3.��λ�ȡ����ĳ��� 
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		System.out.println(arr1[1].length);
		
		//4.��α������� 
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				System.out.print(arr5[i][j]+" ");
			}
			System.out.println();
		}
	}
}	
