package ��������;

import java.io.IOException;
import java.util.Scanner;

public class ���������� {

	public static void main(String[] args) throws IOException {
		
		 System.out.println("������žų˷���������ֵ��");
		 Scanner src = new Scanner(System.in);
		 int max = src.nextInt();
		 System.out.println(max);
		 printChart(max);
	}
	/*
	 * ��ͬһ�����У�������ڶ��ͬ��������ֻҪ���ǵĲ����������߲������Ͳ�ͬ����
	 * 
	 * ���������أ�
	 * ͬһ����
	 * ͬ��
	 * ����������ͬ or �������Ͳ�ͬ
	 * 
	 * 
	 */
	
   public static int add(int a , int b) {
	   return a+b;
   }
   public static double add(double a , double b) {
	   return a+b;
   }
   public static int add(int a , int b,int c) {
	   return a+b+c;
   }
   
   public static void printChart(int max) {
	   for(int l = 1;l <=max ;l++) {
           for(int o=1;o<=l;o++){
        	   System.out.print(o+"*"+l+"="+o*l+"\t");
           }
           System.out.println();
	    }
   }
   
   /*
    * ʹ�ñ�׼���봮����System.in 
    *
    *  System.in.read( )һ��ֻ����һ���ֽ����ݣ�������ͨ��Ҫȡ��һ���ַ�����һ�����֣�
    *  ��ͺܲ��ʺϣ���Ҫ��������ȡ�����������룬��ʱ����ʹ��java.util.Scanner�ࡣ  
    *  
    * ������һ��Scanner����ʱ��Ҫһ��System.in������Ϊʵ���ϻ���System.in��ȡ���û����롣
    *
    *     Scanner��next( )��������ȡ���û�������ַ�����
    *     nextInt( )��ȡ�õ������ַ���ת��Ϊ�������ͣ�
    *     ͬ����nextFloat( )ת���ɸ����ͣ� 
    *     nextBoolean( )ת���ɲ����͡�
    * 
    */
}
