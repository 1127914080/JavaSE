package huan;

//二分法查找
//数组一定要有序
public class Test01 {
	public static void main(String[] args) {
		
		int[] arr= new int[]{-98,-34,2,34,54,66,79,105,210,333};
		
		int dest = 54;
		int start = 0; //初始
		int end = arr.length-1;   //末索引
		boolean isFlag = true;
		
		while(start <= end) {
			int middle = (start+end)/2;
			if (dest == arr[middle]) {
				System.out.println("找到了指定的元素 ，位置为："+middle);
				break;
			}else if (arr[middle] > dest) {
				end=middle-1;
			}else {
				start = middle +1;
			}
		}
//		if (isFlag) {
//			System.out.println("很遗憾，没有找到");
//		}	
	}
}
