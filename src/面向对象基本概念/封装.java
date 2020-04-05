package 面向对象基本概念;

public class 封装 {
	
	public static void main(String[] args) {
			Person person =new Person();
	}
	
	static class Person{
		private int age;//private类型是私有类型
		public void setAge(int a) {
			if(a>0 && a<130) {
		     age =a;
			 speak();}
		}
		public int getAge() {
			return age;
		}
		void speak() {
			System.out.println("age="+age);;
		}
	}
	/**
	 * 一个类中对类成员变量一般有种操作，一个是设置，一个是获取
	 * private 私有：是一个权限修饰符，用于修饰成员，私有的内容只在本类中有效
	 */
}

