package huan;

//���ַ�����
//����һ��Ҫ����
public class Test01 {
	public static void main(String[] args) {
		
		int[] arr= new int[]{-98,-34,2,34,54,66,79,105,210,333};
		
		int dest = 54;
		int start = 0; //��ʼ
		int end = arr.length-1;   //ĩ����
		boolean isFlag = true;
		
		while(start <= end) {
			int middle = (start+end)/2;
			if (dest == arr[middle]) {
				System.out.println("�ҵ���ָ����Ԫ�� ��λ��Ϊ��"+middle);
				break;
			}else if (arr[middle] > dest) {
				end=middle-1;
			}else {
				start = middle +1;
			}
		}
//		if (isFlag) {
//			System.out.println("���ź���û���ҵ�");
//		}	
	}
}
