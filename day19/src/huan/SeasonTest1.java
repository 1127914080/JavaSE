package huan;
/*
 * 
 *           使用enum关键字定义枚举类
 *           	说明：定义枚举类默认继承与Java.lang.Enum
 * 
 */
public class SeasonTest1 {
	public static void main(String[] args) {
		Season1 s1 = Season1.SUMMER;
		System.out.println(s1);
		System.err.println(Season1.class.getSuperclass());
	}
}
//使用enum关键字枚举类
enum Season1{
	
	
	//1.多个对象之间用“,”隔开，末尾对象“;”结束
		SPRING("春天","春暖花开"),
		SUMMER("夏天","夏日炎炎"),
		AUTUMN("秋天","秋高气爽"),
		WINTER("冬天","冰天雪地");

	
	
	//2.声明Season对象的属性:private final修饰
	private final String seasonName;
	private final String seasonDesc;
	
	//3.私有化类的构造器
	private Season1(String seasonName,String seasonDesc) {
		this.seasonName=seasonName;
		this.seasonDesc=seasonDesc;
		
	}
	
	
	//4.其他诉求1：获取枚举类对象的属性
	public String getSeasonName() {
		return seasonName;
	}

	public String getSeasonDesc() {
		return seasonDesc;
	}

	//5其他诉求2.
	@Override
	public String toString() {
		return "Season1 [seasonName=" + seasonName + ", seasonDesc=" + seasonDesc + "]";
	}	
	
}





