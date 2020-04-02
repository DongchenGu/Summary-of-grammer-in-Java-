package 面向对象基本概念;

public class 概述 {

	public static void main(String args[]) {
		
		Subway s = new Subway();//创建一个Subway实例，通过new关键字
		   //Subway就是一个类类型的引用变量，指向了该类的对象
		
	}
	/**
	 * 对事物的描述一般只关注两个方面，一个是属性，一个是行为
	 * 对象就是某一类食物的实实在在的个体
	 * 
	 * 类与对象的关系： 类就是事物的描述，对象是该类事物的实例
	 * 类中的成员变量就是属性，成员函数就是类的行为
	 * 
	 */
	
	//定义一个类，这里必须是static 因为有要在main函数中调用
	public static class Subway{
			 int num;    //属性
			 String str;
			 public void run() {System.out.println("。。。。。");}//行为
	 		 
		 }
	/**
	 * 面向对象的内存体现：
	 * 凡是用new创建的对象都存放在堆中，
	 */
		
		
}

