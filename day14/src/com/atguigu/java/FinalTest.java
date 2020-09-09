package com.atguigu.java;
/**
 * 
 *         final  : 最终的
 *         
 *         	1.final可以用来 修饰的结构，类，方法 ，变量
 *         	2.final 用来修饰一个类  ： 此类不能被其他类所继承
 *         		比如 ： String类，System类。
 *         
 *          3.修饰方法，表明此方法不可以重写
 *          	比如object 类的 getClass
 *          4.final修饰一个变量，此时变量是一个常量
 *          	final修饰属性 可以考虑赋值的位置：显示初始化，代码块中初始化
 *         						也可以在构造器中初始化
 *         
 *         final 修饰局部变量：
 *         			尤其是使用final修饰形参时，表明形参是一个常量，当我们调用此方法
 * 					给形参赋一个实参，一旦赋值以后，就只能在方法体内使用形参，但不能进行重新赋值
 * 
 * @author hao
 *
 */
public class FinalTest {

}
