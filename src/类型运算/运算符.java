package ��������;
/**
 * 
 * @author NobertAcheson
 *
 */

public class ����� {

	public static void main(String[] args) {
		//�������� + - + * /
		int x = 6370;
		x =x /1000*1000;   //JAVA��ǿ�������ԣ������6000
		                   //������������������������x/1000�����6
		
		System.out.println(x);
		//%ȡ������
		System.out.println(2%5);
		//+���ӷ�
		System.out.println("gwegheg"+"ewhgwehweh");
		System.out.println(2+"gh");//�κ����ݺ��ַ�����Ӷ���������
		int a =1,b =2;
		System.out.println(a+","+ b);
		
		//++��������� --�Լ������ 
		int m =99;
		int n = 22;
		//m++;//a =a +1;
	    //n = ++m+n; 
	     n = m++ +n;
	     
	    int p  = m++; //��m�����ֵ����p��Ȼ��m����ֵ����
	     m = m++;
		System.out.println(n);
		System.out.println(p);
		System.out.println(m);
		
		int k =9;
		k = k++;
		System.out.println(k);
		
		//��ֵ����� += -= == /= *=  %=
		short h =3; //һ�����㣬�Ǹ�ֵ����ֵǰ�Ƚ��м�飬Ȼ����ת�����и�ֵ���ײ��Զ�����ת��
		h+=4;//һ�����㣬�Ǹ�ֵ��������ײ��Զ�ת��
		//h = h + 4;  //h���Զ���������������������short�����������㣬��Ҫ����ǿ��ת��
//=------------------------------------------------------------
		//��Ԫ�����
		//���������ʽ���� ���ʽ1 : ���ʽ2
		  //���ʽΪtrueִ�е�һ�������ʽΪfalse,ִ�еڶ���
		int j=6;
		int l =9;
		//��ȡ�������нϴ� ������
		int max = j > l ?j:l;
		
		//��ȡ���������нϴ������
		//������������һ�£��ٽ��õ��Ĵ����͵��������Ƚ�һ�´�С
		int o=3,w=56,q=67;
		
		int Max = (o>w?o:w)> q ? (o>w?o:w) :q;	
		
	}
}
