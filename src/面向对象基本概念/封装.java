package ��������������;

public class ��װ {
	
	public static void main(String[] args) {
			Person person =new Person();
	}
	
	static class Person{
		private int age;//private������˽������
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
	 * һ�����ж����Ա����һ�����ֲ�����һ�������ã�һ���ǻ�ȡ
	 * private ˽�У���һ��Ȩ�����η����������γ�Ա��˽�е�����ֻ�ڱ�������Ч
	 */
}

