package ����ת��;

public class ��������ת�� {

	  public static void main(String[] args) {
		  
		  toHex_char_perfect(60);
		
	  }

		/*
		 * ������ת����ʮ�����ƣ�ÿ��λ������ת����һλʮ��������
		 * 
		 * 0��1��2��3��4��5��6��7��8��9��A,  B,  C,  D,  E,  F
		 * 0��1��2��3��4��5��6��7��8��9��10��11��12��13��14��15
		 */
	
	//�����������ת������
	public static void turns(int num,int base,int offset) {
		//����һ����Ӧ��ϵ��
		char[] ch = {'0','1','2','3','4','5','6','7'
				,'8','9','A','B','C','D','E','F'};
		//����һ���洢��
		char [] storage = new char[32];//������ĳ���-�㹻��
		int i=0;
	    while(num!=0){//��ֻʣ��0�ǾͲ���ѭ����
	    	int temp =num & base; //ͨ��λ������ȷ������λ			 
	    	storage[i++]= ch[temp];
			num =num >>> offset;   //����ƫ���� 
	    }
	    while(i>0) {System.out.print(storage[--i]);}//�����--��Ӧ�����storage[i++]��֤λ�ö�Ӧ
	}
	//--------------------------��װһ��
	//ʮ����תʮ������
	   public static void toHex(int num) {turns(num,15,4);}
	//ʮ����ת�˽���
	   public static void toBinary(int num) {turns(num,7,3);}
	//ʮ����ת������
	   public static void toOctal(int num) {turns(num,1,1);}
	
	
	
//--------------------------------------------------------------------------------	
	//˼ά����
	public static void toHex_original(int num) {  //����ᷴ�������������˼��
		
		  for(int i =1;i<8;i++) {//ȷ��ѭ������int����4���ֽ�32λ����������4λ���飬���8��ʮ��������
			int temp =num & 15; //ͨ��λ������ȷ������λ
			if(temp>9)
				System.out.print((char)(temp-10+'A'));
			else
			    System.out.print(temp);
			num =num >>> 4;   //������λ 
		  }
		}
		
		//���ת��Ϊʮ������--����
		public static void toHex_char(int num) {
			//����һ����Ӧ��ϵ��
			char[] ch = {'0','1','2','3','4','5','6','7'
					,'8','9','A','B','C','D','E','F'};
		    for(int x=0;x<8;x++){
		    	int temp =num & 15; //ͨ��λ������ȷ������λ
				 System.out.print(ch[temp]);
				num =num >>> 4;   //������λ 
		    }
		}
		
		//������ת��λʮ�����ƣ�Ϊ�˱�֤���򣬲���ջ��˼��
		public static void toHex_char_perfect(int num) {
			//����һ����Ӧ��ϵ��
			char[] ch = {'0','1','2','3','4','5','6','7'
					,'8','9','A','B','C','D','E','F'};
			//����һ���洢��
			char [] storage = new char[8];
			int i=0;
		    while(num!=0){//��ֻʣ��0�ǾͲ���ѭ����
		    	int temp =num & 15; //ͨ��λ������ȷ������λ			 
		    	storage[i++]= ch[temp];
				num =num >>> 4;   //������λ 
		    }
		    while(i>0) {System.out.print(storage[--i]);}//�����--��Ӧ�����storage[i++]��֤λ�ö�Ӧ
		}
	
}
