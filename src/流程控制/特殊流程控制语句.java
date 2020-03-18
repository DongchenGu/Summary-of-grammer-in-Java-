package 流程控制;

public class 特殊流程控制语句 {

	public static void main(String [] args) {
		/*
		 * break 跳出
		 * break 的作用范围：要么是switch 要么是循环语句
		 * break 不能用在if后面,很多初学者都会犯错
		 * 当break语句单独存在时，下面能有其他语句，因为执行不到
		 * 如果出现了嵌套循环，break想要跳出指定的循环，可以通过标号来完成
		 * 
		 */
		xiaoqiang: for (int x=0;x<3;x++) {
			wangcai: for(int y =0;y<4;y++) {
				System.out.println("sfgg");
				break xiaoqiang;
			}	
		}
	
	/*
	 * continue 继续，作用范围：循环结构
	 *  结束本次循环，继续下次循环
	 */
		
	}
	
}
