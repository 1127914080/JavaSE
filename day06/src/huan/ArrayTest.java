package huan;
/**
 * 
 * 
 *	1.一维数组的声明和初始化
 *	2.如何调用数组的长度和指定位置的元素
 *	3.如何获取数组的长度
 *	4.如何遍历数组
 *	5.数组元素的默认初始化值
 *	6.数组的内存解析
 *
 */
public class ArrayTest {
	public static void main(String[] args) {
		//1.一维数组的声明和初始化
		int num;//声明
		num=10; //初始化
		int id=1001; //声明+初始化
		
		int[] ids; //声明 
		//1.1静态初始化 : 数组的初始化和数组元素的赋值操作同时进行操作
		ids=new int[]{1001,1002,1003,1004};
		//1.2动态初始化 : 数组的初始化 和数组元素的赋值操作，分开进行
		String[] names = new String[4];

		/**
		 * 写法
		 * 
		 *   1,int[] a = new int[]{1,2,3,4}
		 *   2,int[] b = new int[4]
		 */
		//总结：数组一旦初始化完成，其长度就确定了
		
		//2.如何调用数组的长度和指定位置的元素: 角标的方式
		//数组的角标(或索引);从 0  开始 -1 结束
		names[0] = "佟欢";
		names[1] = "小欢欢";
		names[2] = "欢儿";
		names[3] = "小欢欢儿";
		
		//3.如何获取数组的长度 
		//属性: length
		System.out.println(names.length);
		System.out.println(ids.length);
		
		//4.如何遍历数组
		//方法一：
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println("-----------");
		
		//方法二
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]); //初始化的 i 赋值给name[]中 放入[]里
		}
	} 
}	
