package huan2;
/** 
 * 
 * 
 *  		接口的使用
 *				接口也满足多态性
 *			          接口实际上就是定义了一种规范
 *				开发中，体会面向接口编程！
 *
 *
 *
 *
 *
 */
public class USBTest {
	public static void main(String[] args) {
		Computer com = new Computer();
		//1.创建了接口的非匿名实现类的非匿名对象
		Flash flash = new Flash();
		com.transferData(flash);
		System.out.println("--------------------");
		//2.创建了即可的非匿名实现类的匿名对象
		com.transferData(new Printer());
	
		System.out.println("----------------");
		//3.创建了接口的匿名实现类的非匿名对象
		USB phone  =  new USB() {
			
			@Override
			public void stop() {
				System.out.println("手机结束工作");
			}
			
			@Override
			public void start() {
				System.out.println("手机开始工作");
				
			}
		};
		com.transferData(phone);
		System.out.println("-------------------------");
		//4.创建了接口的匿名实现类的对象
		com.transferData(new USB() {
			
			@Override
			public void stop() {
				System.out.println("mp3->stop");
			}
			
			@Override
			public void start() {
				System.out.println("mp3->start");
				
			}
		});
		
		
	}
}

class Computer{
	
	public void transferData(USB usb) {
		usb.start();
		System.out.println("具体传输细节");
		
		usb.stop();
		
	}
}

interface USB{
	//常量 ：定义了长，宽，最大最小的传输速度等

	void start();
	
	void stop();
	
}
class Flash implements USB{

	@Override
	public void start() {
		System.out.println("U盘开始工作");
	}

	@Override
	public void stop() {
		System.out.println("U盘结束工作");
		
	}
	
}
class Printer implements USB{

	@Override
	public void start() {
		System.out.println("打印机开始工作");
		
	}

	@Override
	public void stop() {
		System.out.println("打印机结束工作");
		
	}
	
}