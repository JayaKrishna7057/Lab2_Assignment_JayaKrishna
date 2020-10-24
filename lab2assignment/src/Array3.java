/**
  Author : Jayakrishna
  date :   23/10/2020
  desc :   getSorted
  */

import java.util.*;
public class Array3 {

	public static void main(String[] args) {
		
	     Scanner sc=new Scanner(System.in);
	     int []array=new int[5];                         //Array initialization with size of 5
	     for(int i=0;i<5;i++)
	     {
	    	 array[i]=sc.nextInt();
	     }
	     Array3 a3=new Array3();                         //creating an object for class Array3
	     
	     
	     System.out.println(a3.getSorted(array));
	     
		}
	   public static String getSorted(int[] array)      //initialize the method with arguement and return type int
	   {  
		  // int b[]=new int[5];
		   int p=0;int temp=0,rev=0;
		   for(int i=0;i<5;i++)
	        {
			   p=array[i];
		   while(p!=0)
		   {
			  temp=p%10;
			  rev=temp*10+rev;
			  p=p/10;
		   }
		   array[i]=rev;
	   }
		   Arrays.sort(array);
		   
		   return Arrays.toString(array);                   //return the array
		  
	   }
}
