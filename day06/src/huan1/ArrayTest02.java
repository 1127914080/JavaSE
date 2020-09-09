package huan1;
/**
 * 5.数组元素的默认初始化值
 * 	 规定：二维数组分为外层数组的元素，内层数组的元素
 * 		int[][] arr = new int[4][3];
 * 		外层元素 arr[0] , arr[1]
 * 		内层元素 arr[0][0] , arr[1][2]
 * 
 * 		外层元素的初始化值为：地址值
 * 		内层元素的初始化值为：与一维数组初始化情况相同
 *
 */
public class ArrayTest02 {
	public static void main(String[] args) {
		// 5.数组元素的默认初始化值
		int[][] arr = new int[4][3];
		System.out.println(arr[0]);  //地址值
		System.out.println(arr[0][0]);
	}
}
