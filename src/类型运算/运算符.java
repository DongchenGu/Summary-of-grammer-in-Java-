package 类型运算;
/**
 * 
 * @author NobertAcheson
 *
 */

public class 运算符 {

	public static void main(String[] args) {
		//算数符号 + - + * /
		int x = 6370;
		x =x /1000*1000;   //JAVA是强类型语言，结果是6000
		                   //两个整数运算结果还是整数，x/1000结果是6
		
		System.out.println(x);
		//%取余运算
		System.out.println(2%5);
		//+连接符
		System.out.println("gwegheg"+"ewhgwehweh");
		System.out.println(2+"gh");//任何数据和字符串相加都是相连接
		int a =1,b =2;
		System.out.println(a+","+ b);
		
		//++自增运算符 --自减运算符 
		int m =99;
		int n = 22;
		//m++;//a =a +1;
	    //n = ++m+n; 
	     n = m++ +n;
	     
	    int p  = m++; //将m自身的值赋给p，然后m自身值增加
	     m = m++;
		System.out.println(n);
		System.out.println(p);
		System.out.println(m);
		
		int k =9;
		k = k++;
		System.out.println(k);
		
		//赋值运算符 += -= == /= *=  %=
		short h =3; //一次运算，是赋值，赋值前先进行检查，然后再转化进行赋值，底层自动进行转化
		h+=4;//一次运算，是赋值运算符，底层自动转化
		//h = h + 4;  //h会自动进行类型提升，提升到short，是两次运算，需要进行强制转化
//=------------------------------------------------------------
		//三元运算符
		//（条件表达式）？ 表达式1 : 表达式2
		  //表达式为true执行第一个，表达式为false,执行第二个
		int j=6;
		int l =9;
		//获取两个数中较大 的整数
		int max = j > l ?j:l;
		
		//获取三个整数中较大的整数
		//先拿两个数比一下，再将得到的大数和第三个数比较一下大小
		int o=3,w=56,q=67;
		
		int Max = (o>w?o:w)> q ? (o>w?o:w) :q;	
		
	}
}
