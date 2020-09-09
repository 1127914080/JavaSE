package huan;
/*
 * 
 *           ʹ��enum�ؼ��ֶ���ö����
 *           	˵��������ö����Ĭ�ϼ̳���Java.lang.Enum
 * 
 */
public class SeasonTest1 {
	public static void main(String[] args) {
		Season1 s1 = Season1.SUMMER;
		System.out.println(s1);
		System.err.println(Season1.class.getSuperclass());
	}
}
//ʹ��enum�ؼ���ö����
enum Season1{
	
	
	//1.�������֮���á�,��������ĩβ����;������
		SPRING("����","��ů����"),
		SUMMER("����","��������"),
		AUTUMN("����","�����ˬ"),
		WINTER("����","����ѩ��");

	
	
	//2.����Season���������:private final����
	private final String seasonName;
	private final String seasonDesc;
	
	//3.˽�л���Ĺ�����
	private Season1(String seasonName,String seasonDesc) {
		this.seasonName=seasonName;
		this.seasonDesc=seasonDesc;
		
	}
	
	
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
		return "Season1 [seasonName=" + seasonName + ", seasonDesc=" + seasonDesc + "]";
	}	
	
}





