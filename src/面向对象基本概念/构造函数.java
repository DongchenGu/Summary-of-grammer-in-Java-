package ��������������;

import ��������������.��װ.Person;

public class ���캯�� {

	public static void main(String[] args) {
		Person person  =new Person();
		//person.Person();���������Ǵ�DE 
		person.speak();
		Person person2 = new Person("С��");
		person2.speak();
		
	}
	/**
	 * ���캯������������ʱ���õĺ���
	 * ���캯�����ص�:��������������ͬ
	 *               ���ö��巵��ֵ����
	 *               û�о���ķ���ֵ 
	 *        ���ã� ��������г�ʼ��
	 *һ���������û�ж�������캯������ô�����л���һ��Ĭ�ϵĿղ������캯��
	 * ��������ж�����ָ���Ĺ��캯������ô����Ĭ�ϵĹ��캯����û����     
	 * 
	 * һ�㺯���͹��캯�������� 
	 *                  ���캯�����󴴽�ʱ�ͻ������֮��Ӧ�Ĺ��캯���Զ�����г�ʼ��
	 *                   һ�㺯���ڶ��󴴽��Ժ���Ҫʱ�ŵ���
	 *���캯���ڶ��󴴽���ֻ����һ��
	 *һ�㺯�������ֶ����ö��
	 *
	 */  
	 static class Person{
		private String name;
		private int age;
		//����һ��person��Ĺ��캯����
		Person(){//���캯�����ղ���
			System.out.println("�޲ι��캯��������");
			this.name = "sge";
		    this.age = 2;
		}
		Person(String name){//�в����Ĺ��캯��/ ����һ������������
			this.name =name;
		}
		////////////�������������������أ��������ڲ������ͺ�������
		
			public void speak() {System.out.println(name+":"+age);}
		}
	
}
