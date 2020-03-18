package 类型运算;

public class 位运算 {

	public static void  main (String[] args) {
		//&//与运算
		//6 & 3 = 2 
		System.out.println(6 & 3);
		// ^异或运算
		//6^3^3 = 6
		//~取反
		
		//<<左移  (位运算符)向左位移几位就是将原来的值乘以2的几次方
		//>>右移     最高位是什么最高位就拿什么补空位，往右移几位就除以2的几次幂
		//>>>无符号右移  高位出现的空位，都用0补空位
		System.out.println(3<<2);
		//最有效的办法算出2*8等于几
		System.out.println(2<<3);
		
//-=--------------------------------------		
		
		//两个变量数值互换
		int a =2;
		int b =3;
		int temp =a;
		a= b;
		b = temp;
		System.out.println();
		
		//两个变量互换值的第二个方法  -----这个方法容易出现精度问题
		a = a+ b;  //先将两个数的值保存在一个数值里面
		b  = a-  b;
		a = a - b;
		///通过位运算互换数值 --
		a = a^b;
		b = a^b;
		a = a^b;
		
		
	}
	
}
