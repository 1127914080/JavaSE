package huan2;
/**
 * 	-ʹ��ͬ�����ƽ�����ģʽ�е�����ʽ��дΪ�̰߳�ȫ��
 * @author hao
 *
 */
public class BankTest {

	
}
class Bank{
	
	private Bank() {}
	
	private static Bank instance = null;
	
	public static Bank getInstance() {
		//��ʽһ �� Ч�ʵ�
	
//		synchronized (Bank.class) {
//			if (instance== null) {
//				instance = new Bank();
//				
//			}
//			return instance;
//		}
		//��ʽ�� �� Ч�ʸ�
		if (instance== null) {
		synchronized (Bank.class) {
			if (instance== null) {
				instance = new Bank();
				}
			}
			
		}
		return instance;
	}
	
}
