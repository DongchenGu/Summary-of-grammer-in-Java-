package 基础数组;

public class 多维数组 {
   public static void main(String args[]) {
	  // int []air = new int[6];
   int[][]air= new int [3][2];//创建一个二维数组，该数组中有三个一维数组，每个一维数组里又有两个元素
		   System.out.println(air);//直接打印二维数组
		                           //@左边是实体类型，右边是实体的哈希值
		   System.out.println(air[0]);//打印二维数组中角标位0的一维数组
		   System.out.println(air[0][0]);//打印而二维数组中的角标为0的一维数组的角标为0的元素
  
   int [][] ppt = new int [3][];//只明确第一维数组的长度，
		    //然后分别对每一个第二维进行初始化
		     ppt[0]= new int[4];
		     ppt[1]= new int[2];
		     ppt[2]= new int[3];
		     
    System.out.println(air.length);//打印二维数组中第一维的元素个数 
    System.out.println(air[2].length);
   // ---------------------------------------------------
    //静态多维数组初始化方式
    int [][] ggh= {{5,6,7},{3,4,5,},{3,4},{6,4}};
    //循环嵌套遍历
    for(int x =0;x<ggh.length;x++) {
    	for(int y =0;y<ggh[x].length;y++) {
    		System.out.println(ggh[x][y]);
    	}
    }
   }
   
   /**
    * 所谓的二维数组就是数组中的数组，就是一个数组的元素还是数组，有点类似于俄罗斯套娃，盒子里套盒子
    * 
    */
}
