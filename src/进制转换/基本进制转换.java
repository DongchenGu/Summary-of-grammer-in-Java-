package 进制转换;

public class 基本进制转换 {

	  public static void main(String[] args) {
		  
		  toHex_char_perfect(60);
		
	  }

		/*
		 * 二进制转换成十六进制：每四位二进制转换成一位十六进制数
		 * 
		 * 0，1，2，3，4，5，6，7，8，9，A,  B,  C,  D,  E,  F
		 * 0，1，2，3，4，5，6，7，8，9，10，11，12，13，14，15
		 */
	
	//完美广义进制转换程序
	public static void turns(int num,int base,int offset) {
		//定义一个对应关系表
		char[] ch = {'0','1','2','3','4','5','6','7'
				,'8','9','A','B','C','D','E','F'};
		//定义一个存储器
		char [] storage = new char[32];//定义最长的长度-足够用
		int i=0;
	    while(num!=0){//当只剩下0是就不用循环了
	    	int temp =num & base; //通过位与运算确定后四位			 
	    	storage[i++]= ch[temp];
			num =num >>> offset;   //右移偏移量 
	    }
	    while(i>0) {System.out.print(storage[--i]);}//这里的--对应上面的storage[i++]保证位置对应
	}
	//--------------------------封装一下
	//十进制转十六进制
	   public static void toHex(int num) {turns(num,15,4);}
	//十进制转八进制
	   public static void toBinary(int num) {turns(num,7,3);}
	//十进制转二进制
	   public static void toOctal(int num) {turns(num,1,1);}
	
	
	
//--------------------------------------------------------------------------------	
	//思维过程
	public static void toHex_original(int num) {  //输出会反过来，最基本的思想
		
		  for(int i =1;i<8;i++) {//确定循环次数int类型4个字节32位二进制数按4位分组，拆成8个十六进制数
			int temp =num & 15; //通过位与运算确定后四位
			if(temp>9)
				System.out.print((char)(temp-10+'A'));
			else
			    System.out.print(temp);
			num =num >>> 4;   //右移四位 
		  }
		}
		
		//查表法转换为十六进制--反序
		public static void toHex_char(int num) {
			//定义一个对应关系表
			char[] ch = {'0','1','2','3','4','5','6','7'
					,'8','9','A','B','C','D','E','F'};
		    for(int x=0;x<8;x++){
		    	int temp =num & 15; //通过位与运算确定后四位
				 System.out.print(ch[temp]);
				num =num >>> 4;   //右移四位 
		    }
		}
		
		//完美的转换位十六进制，为了保证正序，采用栈的思想
		public static void toHex_char_perfect(int num) {
			//定义一个对应关系表
			char[] ch = {'0','1','2','3','4','5','6','7'
					,'8','9','A','B','C','D','E','F'};
			//定义一个存储器
			char [] storage = new char[8];
			int i=0;
		    while(num!=0){//当只剩下0是就不用循环了
		    	int temp =num & 15; //通过位与运算确定后四位			 
		    	storage[i++]= ch[temp];
				num =num >>> 4;   //右移四位 
		    }
		    while(i>0) {System.out.print(storage[--i]);}//这里的--对应上面的storage[i++]保证位置对应
		}
	
}
