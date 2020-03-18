package 流程控制;

public class 循环结构 {
      public static void main(String [] args) {
    	  //while循环
    	  /*
    	   * while (条件表达式)
    	   * {
    	   *    执行语句
    	   * }
    	   * 
    	   * dowhile循环
    	   * do {
    	   *   执行语句
    	   * }while（条件判断）；注意dowhile后面是有分号的。
    	   * 
    	   * 
    	   */
    	  int x = 1;
    	 while(x<5) {
    		 
    		 //System.out.println(x);
    		 x++;
    	 }
    	  //用循环结构求1到100的和
    	int i =1,sum =0;
    	while(i<=100) {
    		
    		sum = sum + i++;
    	}
    	//System.out.println(sum);
    	
    	/*
    	 * for 循环
    	 * for(初始化表达式;循环条件表达式;循环后的操作表达式)
    	 * {执行语句，循环体}
    	 *
    	 */
    	i = 1;
    	for(System.out.println(i);i<3;System.out.println(i)) {
    		System.out.println("第");
    		i++;
    	}
    	for(int m =1;i<3;m++) {
    		System.out.println("第");
    	}   //此时m不能在外面访问
    	/*
    	 * for 和while可以互换，格式不同
*        无线循环的最简单办法
*        while（true）{}
*        for(;;){} 分号中间可以不用写，默认true
*        循环一定要确定哪些语句参与，哪些不参与，并且要控制次数
    	 */
    	/*
    	 * for语句可以循环嵌套
    	 * 只有当一个内循环转完的时候才能跳出到外循环
    	 * 
    	 */
    	
    	int w =1;
    	int q =1;
    	//循环嵌套打印*
	    for  (q =1;q<6;q++)
	    {
	    	w=1;
		   while(w<=q) {	
		    	System.out.print("*");
		    	w++;
		    }
	      System.out.println();
	    }
	    
	    for(int c =6;c>0;c--) {    //最简洁的方式，只有两个变量
	    	for (int v =1;v<=c;v++) {
	    		System.out.print("*");
	    	}	System.out.println();
	    }
	    
	    //打印99乘法表
	    for(int l=1;l <9 ;l++) {
           for(int o=1;o<=l;o++){
        	   System.out.print(o+"*"+l+"="+o*l+"\t");
           }
           System.out.println();
	    }
	    /*
	     * \n   回车
	     *\t制表符 
	     *\b 退格符号
	     *\r  按下回车键
	     *windows系统中的回车符号是由两个符号组成的\r\n
	     * linux中回车符是\n
	     * System.out.println("\"hello word\"");
	     * System.out.println("\\hello word\\");
	     */
	     //打印倒三角
	    for(int h=1;h<=6;h++) {
	    	for(int g=1;g<h;g++) {
	    		System.out.print(" ");
	    	}
	    	for(int f=h;f<=6;f++) {
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    }	    
	    }     
}
