package ��������;

public class ��ά���� {
   public static void main(String args[]) {
	  // int []air = new int[6];
   int[][]air= new int [3][2];//����һ����ά���飬��������������һά���飬ÿ��һά��������������Ԫ��
		   System.out.println(air);//ֱ�Ӵ�ӡ��ά����
		                           //@�����ʵ�����ͣ��ұ���ʵ��Ĺ�ϣֵ
		   System.out.println(air[0]);//��ӡ��ά�����нǱ�λ0��һά����
		   System.out.println(air[0][0]);//��ӡ����ά�����еĽǱ�Ϊ0��һά����ĽǱ�Ϊ0��Ԫ��
  
   int [][] ppt = new int [3][];//ֻ��ȷ��һά����ĳ��ȣ�
		    //Ȼ��ֱ��ÿһ���ڶ�ά���г�ʼ��
		     ppt[0]= new int[4];
		     ppt[1]= new int[2];
		     ppt[2]= new int[3];
		     
    System.out.println(air.length);//��ӡ��ά�����е�һά��Ԫ�ظ��� 
    System.out.println(air[2].length);
   // ---------------------------------------------------
    //��̬��ά�����ʼ����ʽ
    int [][] ggh= {{5,6,7},{3,4,5,},{3,4},{6,4}};
    //ѭ��Ƕ�ױ���
    for(int x =0;x<ggh.length;x++) {
    	for(int y =0;y<ggh[x].length;y++) {
    		System.out.println(ggh[x][y]);
    	}
    }
   }
   
   /**
    * ��ν�Ķ�ά������������е����飬����һ�������Ԫ�ػ������飬�е������ڶ���˹���ޣ��������׺���
    * 
    */
}
