package ���̿���;

public class ѭ���ṹ {
      public static void main(String [] args) {
    	  //whileѭ��
    	  /*
    	   * while (�������ʽ)
    	   * {
    	   *    ִ�����
    	   * }
    	   * 
    	   * dowhileѭ��
    	   * do {
    	   *   ִ�����
    	   * }while�������жϣ���ע��dowhile�������зֺŵġ�
    	   * 
    	   * 
    	   */
    	  int x = 1;
    	 while(x<5) {
    		 
    		 //System.out.println(x);
    		 x++;
    	 }
    	  //��ѭ���ṹ��1��100�ĺ�
    	int i =1,sum =0;
    	while(i<=100) {
    		
    		sum = sum + i++;
    	}
    	//System.out.println(sum);
    	
    	/*
    	 * for ѭ��
    	 * for(��ʼ�����ʽ;ѭ���������ʽ;ѭ����Ĳ������ʽ)
    	 * {ִ����䣬ѭ����}
    	 *
    	 */
    	i = 1;
    	for(System.out.println(i);i<3;System.out.println(i)) {
    		System.out.println("��");
    		i++;
    	}
    	for(int m =1;i<3;m++) {
    		System.out.println("��");
    	}   //��ʱm�������������
    	/*
    	 * for ��while���Ի�������ʽ��ͬ
*        ����ѭ������򵥰취
*        while��true��{}
*        for(;;){} �ֺ��м���Բ���д��Ĭ��true
*        ѭ��һ��Ҫȷ����Щ�����룬��Щ�����룬����Ҫ���ƴ���
    	 */
    	/*
    	 * for������ѭ��Ƕ��
    	 * ֻ�е�һ����ѭ��ת���ʱ�������������ѭ��
    	 * 
    	 */
    	
    	int w =1;
    	int q =1;
    	//ѭ��Ƕ�״�ӡ*
	    for  (q =1;q<6;q++)
	    {
	    	w=1;
		   while(w<=q) {	
		    	System.out.print("*");
		    	w++;
		    }
	      System.out.println();
	    }
	    
	    for(int c =6;c>0;c--) {    //����ķ�ʽ��ֻ����������
	    	for (int v =1;v<=c;v++) {
	    		System.out.print("*");
	    	}	System.out.println();
	    }
	    
	    //��ӡ99�˷���
	    for(int l=1;l <9 ;l++) {
           for(int o=1;o<=l;o++){
        	   System.out.print(o+"*"+l+"="+o*l+"\t");
           }
           System.out.println();
	    }
	    /*
	     * \n   �س�
	     *\t�Ʊ�� 
	     *\b �˸����
	     *\r  ���»س���
	     *windowsϵͳ�еĻس�������������������ɵ�\r\n
	     * linux�лس�����\n
	     * System.out.println("\"hello word\"");
	     * System.out.println("\\hello word\\");
	     */
	     //��ӡ������
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
