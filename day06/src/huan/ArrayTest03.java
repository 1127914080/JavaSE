package huan;

import java.util.Scanner;

/**
 *  从键盘读入学生成绩，找出最高分，并输出学生等级
 *  	成绩 >= 最高分 - 10  等级为'A' 
 * 		成绩 >= 最高分 - 20  等级为'B' 
 *		成绩 >= 最高分 - 30  等级为'C' 
 *		其余			          等级为'D' 
 *
 *		先读取学生人数，根据人数创建int数组，存放学生成绩
 */
public class ArrayTest03 {
	public static void main(String[] args) {
		//使用scanner 读取学生个数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生人数:");
		int number = sc.nextInt();
		//创建数组，存储学生成绩，动态初始化
		int[] soures= new int[number];
		//给数组中元素赋值
		System.out.println("请输入"+number+"个学生成绩");
		//获取数组中的最大值：最高分
		int maxScore = 0 ;
		for (int i = 0; i < soures.length; i++) {
			soures[i]=sc.nextInt();
			if (maxScore<soures[i]) {
				maxScore=soures[i];
			}
		}
		
		
//		for (int i = 0; i < soures.length; i++) {
//			if (maxScore<soures[i]) {
//				
//			}
//		}
		//根据每个学生成绩与最高分的差值，得到每个学生的等级，输出并遍历
		char lever;
		for (int i = 0; i < soures.length; i++) {
			if (maxScore-soures[i] <= 10) {
				lever = 'A';
			}else if (maxScore-soures[i] <= 20) {
				lever = 'B';
			}else if (maxScore-soures[i] <= 30) {
				lever = 'C';
			}else  {
				lever = 'D';
			}
			System.out.println("Student:" + i + ":soure is:"
					+ soures[i] +",grade is:"+lever);
			
		}
	}
}
