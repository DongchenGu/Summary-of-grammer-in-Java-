package 流程控制;
/**
 * 
 * @author NobertAcheson
 *
 */

public class 判断结构顺序结构 {

	public static void main(String []args) {
		
		/*if语句必须明确自己的控制范围 ，省略大括号时，默认是if后面的第一个语句。
		 * if 语句的第一种格式
		 * if(条件表达式)
		 * {执行语句
		 * }
		 * 
		 * if语句的第二种格式
		 * if(条件表达式){ 执行语句  }
		 * else{   执行语句 }
		 *       
		 * 当if else 结构中都有运算结果时可以用三元运算符简化
		 * 
		 * 也可以对条件进行多次判断---只有一个代码块能执行
		 * if (条件表达式){  执行语句}
		 * else if(条件表达式){ 执行语句 }
		 * else { 执行语句 }
		 * 
		 * 
		 */
		
		int a = 34;
		int b;
		if(a>1) {
			b =12;
		}
		else {
			b =35;
		}
		
		
		if (a>56);//注意不能加分号
		
		{ 
			int m =3;    //局部代码块里面的变量不能在代码块外访问
			     //m的作用域在代码块里面，执行完局部代码块，m就已经被释放
			System.out.println("erhrh--"+m);  //局部代码块
		}
	   //	System.out.println("erhrh--"+m);
		
	
		//if和switch的应用区别
		  // if ：1：对具体的值进行判断
		   //     2: 对区间进行判断
		   ///    3：对运算结果是boolean类型的表达式进行判断
	    //  switch 
		  //  1：对具体的值进行判断
		  //  2： 值的个数是固定的，对于几个固定的值的判断建议使用switch
		
	}
	
}
