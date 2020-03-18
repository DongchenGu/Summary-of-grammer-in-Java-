package 流程控制;

public class 选择结构 {

	public static void main(String[] args) {
		
		/*
		 *  switch (表达式)
		 *  {
		 *     case 取值1：
		 *          执行语句；
		 *          break； //跳出，如果没有会继续执行下面的
		 *     case 取值2：
		 *          执行语句；
		 *          break；
		 *     case 取值3：
		 *          执行语句；
		 *          break；
		 *      case 取值4：
		 *          执行语句；
		 *          break；
		 *          
		 *      default：
		 *         执行语句；
		 *         break；
		 *          
		 *  }
		 */
	  int x =3;
		switch(x) 
		{
		  case 4:
			System.out.println("a");
			break;
		  case 5:
				System.out.println("a");
				break;
		  case 6:
				System.out.println("a");
				break;
		  case 7:
				System.out.println("a");
				break;
		  case 8:
				System.out.println("a");
				break;
				//也可以重叠进行 --多个标识对应一个内容
		  case 9:
		  case 10:
		  case 11:
			  System.out.println("a");
				break;
		
		}
		
		
	}
}
