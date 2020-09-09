package huan;
/**
 *     
 *  1.内存解析的说明，只能存储两类， null  或   地址值
 *  2.创建的对象没有显示的值，赋给一个变量名，即为匿名对象
 *   	特点：只能调用一次
 *
 */
public class Test {
	public static void main(String[] args) {
		Phone p = new Phone();
		System.out.println(p);
		p.sendEmail();
		p.playGame();
		
		//匿名，没有名  ->直接调用
//		new Phone().sendEmail();
		new Phone().price=1999;
		
	}
}

class Phone {
	double price;
	
	public void sendEmail() {
		System.out.println("发邮件");
	}
	public void playGame() {
		System.out.println("玩游戏");
	}
	public void showPrice() {
		System.out.println("手机价格为："+price);
	}
}
