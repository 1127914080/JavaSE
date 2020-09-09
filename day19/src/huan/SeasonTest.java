package huan;
/**
 * һ��ö�����ʹ��
 * 1.ö�������⣺��Ķ���ֻ�����޸���ȷ���ġ����ǳƴ���Ϊö����
 * 2.����Ҫ����һ�鳣��ʱ��ǿ�ҽ���ʹ��ö����
 * 3.���ö������ֻ��һ�������������Ϊ����ģʽ��ʵ�ַ�ʽ��
 *
 * ������ζ���ö����
 * ��ʽһ��jdk5.0֮ǰ���Զ���ö����
 * ��ʽ����jdk5.0������ʹ��enum�ؼ��ֶ���ö����
 *
 * ����Enum���еĳ��÷�����
 *    values()����������ö�����͵Ķ������顣�÷������Ժܷ���ر������е�ö��ֵ��
 *    valueOf(String str)�����԰�һ���ַ���תΪ��Ӧ��ö�������Ҫ���ַ���������ö�������ġ����֡����粻�ǣ���������ʱ�쳣��IllegalArgumentException��
 *    toString()�����ص�ǰö���������������
 *
 * �ġ�ʹ��enum�ؼ��ֶ����ö����ʵ�ֽӿڵ����
 *   ���һ��ʵ�ֽӿڣ���enum����ʵ�ֳ��󷽷�
 *   ���������ö����Ķ���ֱ�ʵ�ֽӿ��еĳ��󷽷�
 *
 */
public class SeasonTest {
	public static void main(String[] args) {
		Season spring = Season.SPRING;
		System.out.println(spring);
				
	}
}
//�Զ���ö����
class Season{
	//1.����Season���������:private final����
	private final String seasonName;
	private final String seasonDesc;
	
	//2.˽�л���Ĺ�����
	public Season(String seasonName,String seasonDesc) {
		this.seasonName=seasonName;
		this.seasonDesc=seasonDesc;
		
	}
	
	//3.�ṩ��ǰö����Ķ������public static final
	public static final Season SPRING= new Season("����","��ů����");
	public static final Season SUMMER= new Season("����","��������");
	public static final Season AUTUMN= new Season("����","�����ˬ");
	public static final Season WINTER= new Season("����","����ѩ��");

	//4.��������1����ȡö������������
	public String getSeasonName() {
		return seasonName;
	}

	public String getSeasonDesc() {
		return seasonDesc;
	}

	//5��������2.
	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", seasonDesc=" + seasonDesc + "]";
	}	
	
}





