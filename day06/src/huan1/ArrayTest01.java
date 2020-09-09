package huan1;

/**
 * 1.二维数组的声明和初始化 
 * 2.如何调用数组的长度和指定位置的元素 
 * 3.如何获取数组的长度 
 * 4.如何遍历数组 
 * 5.数组元素的默认初始化值
 * 6.数组的内存解析
 */
public class ArrayTest01 {
	public static void main(String[] args) {
		//1,二维数组的声明和初始化
		int[] arr=new int[]{1,2,3,4,5};
		//静态初始化
		int[][] arr1= new int[][]{{1,2,3,4,5},{6,7,8},{9}};
		//动态初始化1
		String[][] arr3 = new String[3][5];
		//动态初始化2
		String[][] arr4 = new String[3][];
		//其他写法
		int[] arr5[] = new int[][]{{1,2,3,4,5},{6,7,8},{10}};
		int arr6[][] = new int[][]{{1,2,3,5},{6,7,8},{10}};
	
	
		//2.如何调用数组的长度和指定位置的元素 
		System.out.println(arr1[0][2]); // 3
		System.out.println(arr3[1][1]); // null
		arr4[1]=  new String[4];
		System.out.println(arr4[1][0]);
				
		//3.如何获取数组的长度 
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		System.out.println(arr1[1].length);
		
		//4.如何遍历数组 
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				System.out.print(arr5[i][j]+" ");
			}
			System.out.println();
		}
	}
}	
