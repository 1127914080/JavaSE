package huan;
/**
 *     
 *  1.�ڴ������˵����ֻ�ܴ洢���࣬ null  ��   ��ֵַ
 *  2.�����Ķ���û����ʾ��ֵ������һ������������Ϊ��������
 *   	�ص㣺ֻ�ܵ���һ��
 *
 */
public class Test {
	public static void main(String[] args) {
		Phone p = new Phone();
		System.out.println(p);
		p.sendEmail();
		p.playGame();
		
		//������û����  ->ֱ�ӵ���
//		new Phone().sendEmail();
		new Phone().price=1999;
		
	}
}

class Phone {
	double price;
	
	public void sendEmail() {
		System.out.println("���ʼ�");
	}
	public void playGame() {
		System.out.println("����Ϸ");
	}
	public void showPrice() {
		System.out.println("�ֻ��۸�Ϊ��"+price);
	}
}
