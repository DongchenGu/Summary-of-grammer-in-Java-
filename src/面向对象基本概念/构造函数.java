package 面向对象基本概念;

import 面向对象基本概念.封装.Person;

public class 构造函数 {

	public static void main(String[] args) {
		Person person  =new Person();
		//person.Person();这种做法是错DE 
		person.speak();
		Person person2 = new Person("小明");
		person2.speak();
		
	}
	/**
	 * 构造函数：创建对象时调用的函数
	 * 构造函数的特点:函数名与类名相同
	 *               不用定义返回值类型
	 *               没有具体的返回值 
	 *        作用： 给对象进行初始化
	 *一个类中如果没有定义过构造函数，那么该类中会有一个默认的空参数构造函数
	 * 如果在类中定义了指定的构造函数，那么类中默认的构造函数就没有了     
	 * 
	 * 一般函数和构造函数的区别： 
	 *                  构造函数对象创建时就会调用与之对应的构造函数对对象进行初始化
	 *                   一般函数在对象创建以后需要时才调用
	 *构造函数在对象创建后只调用一次
	 *一般函数可以手动调用多次
	 *
	 */  
	 static class Person{
		private String name;
		private int age;
		//定义一个person类的构造函数。
		Person(){//构造函数，空参数
			System.out.println("无参构造函数运行了");
			this.name = "sge";
		    this.age = 2;
		}
		Person(String name){//有参数的构造函数/ 对象一创建就有名字
			this.name =name;
		}
		////////////上面两个函数就是重载（区别在于参数类型和数量）
		
			public void speak() {System.out.println(name+":"+age);}
		}
	
}
