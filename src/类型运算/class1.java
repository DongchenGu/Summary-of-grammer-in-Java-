package 类型运算;
/**
 * 
 * @author NobertAcheson
 *    字符类型
 *    变量类型
 */
public class class1 {

	public static void main(String[] args) {
		
		
		//b = (byte)(b+200); 已越界
		System.out.println('b'+0);
		byte c = (byte)4;//正数都是int类型，不能给byte的要强制转换
		byte d =(byte) 4;
		byte e =(byte) 4;
		c = (byte) (d + e); //d和e是变量，不是常量，编译器不能判断值，防止超范围所以必须强制
		System.out.println(c);
		
		
		// byte 1个字节
		// short 2个字节
		// int 4个字节
		// long 8个字节
		// 
	    //foat 单精度4个字节
		//double 双精度，8个字节
		int x1 =3;
		int x2 = 98;
		int y = Integer.MAX_VALUE;
		int x =x1 + x2;
		System.out.println(x);
	}
	
}
