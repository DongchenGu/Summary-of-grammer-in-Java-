package 面向对象基本概念;

public class 成员变量和局部变量 {

	 public static void main(String[] args) {
		
	}
	/**
	 * 两者的区别：成员变量定义在类中，整个类都可以访问
	 *            局部变量定义在函数，语句，局部代码块中，只在所属的区域有效，
	 *            成员变量存在于堆内存的对象中
	 *            局部变量存在于栈内存的方法中
	 *            成员变量随着对象的创建而存在，随着对象的消失而消失
	 *            局部变量随着所属区域的执行而存在，随着所属区域的结束而释放
	 *            成员变量都有默认的初始化值
	 *            局部变量没有默认初始化值
	 */

	class Car{
		int num =4 ;//显示初始化
		String color;
		void run() {
			int num = 10;   //同名局部变量会覆盖成员变量
			System.out.println(num+"..."+color);
		}
	
	}
    public static void show(Car c) { //传入类类型的参数
		 c.num= 3;
		 c.color="black";
		 System.out.println(c.num+".."+c.color);
	}
}
