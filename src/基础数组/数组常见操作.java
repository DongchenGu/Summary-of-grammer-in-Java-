
package ��������;

import java.util.*;
/**
 * 
 * @author NobertAcheson
 *  
 */
public class ���鳣������ {
	/*
	 *  �������ֻ�ȡ���ݵĻ�������
	 *  �����������Ǵ��ȡ������˼����ǶԽǱ�Ĳ���
	 */
	public static void main(String[] args) {
	
		int[] air = {2,3,7,34,45,86,687};
		
		//System.out.println(air.length);//air.lengthָ����air�����鳤�ȣ���������ѭ����
		
		printArr(air);
		System.out.println();
		int max=getMax_All(air);
		System.out.println(max);
		selectSort(air);
		printArr(air);
		
		Arrays.sort(air);//java�Դ���
		int half = halfSearch(air,45);
		System.out.println("���ҽ����"+half);
		//java�Դ��Ķ��ֲ���---------------------------------------------
		 int half2 = Arrays.binarySearch(air ,1);  //��������������в����ڣ�
		                                           //�÷������أ�-�����ĽǱ꣩-1�����ؽ���Ǹ�����ζ���Ҳ���
		 System.out.println("���ҽ����"+half2);
	}
	/*
	 *  �������ֻ�ȡ���ݵĻ�������
	 *  �����������Ǵ��ȡ������˼����ǶԽǱ�Ĳ���
	 *  
	 */
	//���������װ
	public static void printArr(int air[]) {
		for(int x =0;x<air.length;x++)
		{
			if(x!=air.length-1)
			System.out.print(air[x]+",");
			else
				System.out.print(air[x]);
		}
	}
	
	
	//��������ȡ���ֵ
			/*��Ҫ���бȽϣ������������¼סÿ�αȽϺ�����ֵ
			 * ��Ҫ�������е�Ԫ������ȡ�����ͱ����м�¼��Ԫ�ؽ��бȽϣ����ھ��滻
			 */
	public  static int getMax(int[] arr) {
		
		//���������¼���ֵ
		int max = 0;//��ֻ�ʺϺ������Ƚ�
		for(int x=0;x<arr.length;x++) {
			if(arr[x]>max) {max =arr[x];}
		}
		return max;
	}
	//��ȡ����Ԫ�ص����ֵ
       public  static int getMax_All(int[] arr) {
		
		//���������¼���ֵ--ͨ�÷���-��ʼ��Ϊĳһ��Ԫ��ֵ
		int max = arr[0];
		for(int x=1;x<arr.length;x++) {
			if(arr[x]>max) {max =arr[x];}
		}
		return max;
	}
       public  static int getMax_index(int[] arr) {
   		
   		//���������¼���ֵ-Ҳ���Գ�ʼ���Ǳ�
   		int maxIndex = 0;
   		for(int x=1;x<arr.length;x++) {
   			if(arr[x]>arr[maxIndex]) {maxIndex =x;}
   		}
   		return arr[maxIndex];
   	    }
      
       //------------����Ԫ������ѡ�����򷨣���С����
       public  static void selectSort(int[] arr) 
       {
       
    	   for(int x =0;x<arr.length-1;x++) 
    	   {		   
    		   for(int y =x+1;y<arr.length;y++) 
    		   {
    			   if (arr[x]>arr[y]) {int temp = arr[x];
    			                       arr[x]= arr[y];
    			                       arr[y]= temp;}
    		   }
    	   }
    	   
       } 
       
       //------------����Ԫ������ð�����򷨣���С����
       //��ÿ��ð��ʱ�����Ķ����ܵ�����
       public  static void pop(int[] arr) 
       {      
    	   for(int x =0;x<arr.length-1;x++) //x�ǿ���������
    	   {		   
    		   for(int y =0;y<arr.length-1-x;y++) 
    		   {
    			   if (arr[y]>arr[y+1]) {int temp = arr[y];
    			                       arr[y]= arr[y+1];
    			                       arr[y+1]= temp;}
    		   }
    	   }
    	   
       } 
       
       //�����е�Ԫ�ػ�λ�ã�������//Ҫ�����õķ�ʽ�Բ������и�ֵ
       public static void swap(int[] arr, int a, int b) {
    	   int temp = arr[a];
           arr[a]= arr[b];
           arr[b]= temp;  
       }
       //----------------------------------------/���鳣�����ܲ���
      
        public static int getIndex(int[] air,int key) {
        	for(int x =0;x<air.length;x++) {
        		if(air[x]==key) {return x;}
        	}
        	return -1;
        }
        //�۰����----���ֲ��ҷ�1
        public static int halfSearch(int[] air,int key) {
        	
        	int max,min,mid;
        	 min =0;
        	 max=air.length-1;
        	 mid = (min+max)/2;
        	while(air[mid]!=key) {
        		if(key>air[mid]) {min = mid +1;}
        		else if (key<air[mid]) { max = mid-1;}
        		if(max<min)
        			return -1;
        		 mid = (min+max)/2;//���Ըĳ�mid = (min+max)>>1����1λ�ȼ��ڳ���2
        	}
        	return mid;
        }
        //�۰����----���ֲ��ҷ�2
        public static int halfSearch2(int[] air, int key) {
        	int min,mid,max;
        	min = 0;
            max = air.length-1;   	
        		while(min<=max) {
        			mid = (min+max)>>2;
        			if(key>air[mid]) {min=mid+1;}
        			else if(key<air[mid]) {max = mid-1;}
        			else
        				return mid;
        			
        		}
        	        return -1;
        }
}
