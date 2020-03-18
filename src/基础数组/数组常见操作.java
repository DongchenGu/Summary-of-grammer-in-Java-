
package 基础数组;

import java.util.*;
/**
 * 
 * @author NobertAcheson
 *  
 */
public class 数组常见操作 {
	/*
	 *  从数组种获取数据的基本操作
	 *  基本操作就是存和取，核心思想就是对角标的操作
	 */
	public static void main(String[] args) {
	
		int[] air = {2,3,7,34,45,86,687};
		
		//System.out.println(air.length);//air.length指的是air的数组长度，经常用在循环中
		
		printArr(air);
		System.out.println();
		int max=getMax_All(air);
		System.out.println(max);
		selectSort(air);
		printArr(air);
		
		Arrays.sort(air);//java自带的
		int half = halfSearch(air,45);
		System.out.println("查找结果："+half);
		//java自带的二分查找---------------------------------------------
		 int half2 = Arrays.binarySearch(air ,1);  //如果该数在数组中不存在，
		                                           //该方法返回（-插入点的角标）-1，返回结果是负数意味着找不到
		 System.out.println("查找结果："+half2);
	}
	/*
	 *  从数组种获取数据的基本操作
	 *  基本操作就是存和取，核心思想就是对角标的操作
	 *  
	 */
	//遍历数组封装
	public static void printArr(int air[]) {
		for(int x =0;x<air.length;x++)
		{
			if(x!=air.length-1)
			System.out.print(air[x]+",");
			else
				System.out.print(air[x]);
		}
	}
	
	
	//操作：获取最大值
			/*需要进行比较，并定义变量记录住每次比较后的最大值
			 * 需要将数组中的元素依次取出，和变量中记录的元素进行比较，大于就替换
			 */
	public  static int getMax(int[] arr) {
		
		//定义变量记录最大值
		int max = 0;//这只适合和正数比较
		for(int x=0;x<arr.length;x++) {
			if(arr[x]>max) {max =arr[x];}
		}
		return max;
	}
	//获取数组元素的最大值
       public  static int getMax_All(int[] arr) {
		
		//定义变量记录最大值--通用方法-初始化为某一个元素值
		int max = arr[0];
		for(int x=1;x<arr.length;x++) {
			if(arr[x]>max) {max =arr[x];}
		}
		return max;
	}
       public  static int getMax_index(int[] arr) {
   		
   		//定义变量记录最大值-也可以初始化角标
   		int maxIndex = 0;
   		for(int x=1;x<arr.length;x++) {
   			if(arr[x]>arr[maxIndex]) {maxIndex =x;}
   		}
   		return arr[maxIndex];
   	    }
      
       //------------数组元素排序（选择排序法）从小到大
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
       
       //------------数组元素排序（冒泡排序法）从小到大
       //在每轮冒泡时，最大的都会跑到最后边
       public  static void pop(int[] arr) 
       {      
    	   for(int x =0;x<arr.length-1;x++) //x是控制轮数的
    	   {		   
    		   for(int y =0;y<arr.length-1-x;y++) 
    		   {
    			   if (arr[y]>arr[y+1]) {int temp = arr[y];
    			                       arr[y]= arr[y+1];
    			                       arr[y+1]= temp;}
    		   }
    	   }
    	   
       } 
       
       //数组中的元素换位置（交换）//要用引用的方式对参数进行赋值
       public static void swap(int[] arr, int a, int b) {
    	   int temp = arr[a];
           arr[a]= arr[b];
           arr[b]= temp;  
       }
       //----------------------------------------/数组常见功能查找
      
        public static int getIndex(int[] air,int key) {
        	for(int x =0;x<air.length;x++) {
        		if(air[x]==key) {return x;}
        	}
        	return -1;
        }
        //折半查找----二分查找法1
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
        		 mid = (min+max)/2;//可以改成mid = (min+max)>>1右移1位等价于除以2
        	}
        	return mid;
        }
        //折半查找----二分查找法2
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
