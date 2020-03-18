package 类型运算;

public class 比较与逻辑运算符 {

	public static void main (String[] args) {
		
		//比较运算符，运算完的结果必须是true或者是false
		//== 判断是否相等 
		//！= 不等于
		//<= 小于等于
		//>=大于等于
		
		
		//
		System.out.println(3>2);
		
		//逻辑运算符用来连接两个布尔类型的表达式
		//& 与符号
		// |或运算符
		int x =7;
		System.out.println(x>4 & x<9);
		// ^异或  相同为假，不同为真
		// && 短路，双与 ---- 只要有一个假就是假 -- 用来保证两方都是真--如果左边为假右边就不参与了
		// || 双或   只要有一个为真就是真  ---只要左边为真右边就不参与了
		//！取非
		
		//& 和 | 可用于bitwise operation，即二进制运算，而&&和 || 不可以。
		//区别2：在逻辑运算时，&& 和 || 叫做short-circuit logical operator, 
		//意思是先判定左侧的逻辑值，如果可以决定结果则不再浪费时间去判定右侧的逻辑值。
		//例如(2<3) || (a*5+b/3-c>5)，因为(2<3)是true，无论右侧是true or false，结果都是true, 所以右侧将不再进行判定。
		//而& 和 | 则总会对两侧进行判定，称为non-short-circuit logical operator.
		
	}
	
}
