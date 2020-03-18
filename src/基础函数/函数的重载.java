package 基础函数;

import java.io.IOException;
import java.util.Scanner;

public class 函数的重载 {

	public static void main(String[] args) throws IOException {
		
		 System.out.println("请输入九九乘法表上限数值：");
		 Scanner src = new Scanner(System.in);
		 int max = src.nextInt();
		 System.out.println(max);
		 printChart(max);
	}
	/*
	 * 在同一个类中，允许存在多个同名函数，只要他们的参数个数或者参数类型不同即可
	 * 
	 * 函数的重载：
	 * 同一个类
	 * 同名
	 * 参数个数不同 or 参数类型不同
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
    * 使用标准输入串对象System.in 
    *
    *  System.in.read( )一次只读入一个字节数据，而我们通常要取得一个字符串或一组数字，
    *  这就很不适合，需要其他方法取得这样的输入，这时可以使用java.util.Scanner类。  
    *  
    * 在新增一个Scanner对象时需要一个System.in对象，因为实际上还是System.in在取得用户输入。
    *
    *     Scanner的next( )方法用以取得用户输入的字符串；
    *     nextInt( )将取得的输入字符串转换为整数类型；
    *     同样，nextFloat( )转换成浮点型； 
    *     nextBoolean( )转换成布尔型。
    * 
    */
}
