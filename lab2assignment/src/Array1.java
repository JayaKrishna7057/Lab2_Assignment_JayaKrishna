/**
  Author : Jayakrishna
  date :   23/10/2020
  desc :   getSecondSmallest
  */

import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		
          Scanner sc=new Scanner(System.in);
          int []array=new int[5];             //Array initialization with size of 5
          for(int i=0;i<5;i++)
         {
     	     array[i]=sc.nextInt();
         }
          Array1 a=new Array1();               //creating an object for class Array1
          int secondSmallest=a.getSecondSmallest(array);      //access method with object 'a' and set the value to SecondSmallest
          System.out.println(secondSmallest);
    }
         int getSecondSmallest(int[] array)          //initialize the method with arguement and return type int
        {
	   for(int i=0;i<array.length;i++)
	   {
		   for(int j=i+1;j<array.length-1;j++)
		   {
			   if(array[i]<array[j])
			   {
				   int temp=array[i];
				   array[i]=array[j];
				   array[j]=temp;
			   }
		   }
	   }
	   return array[2];                            //return the smallest element in the array
   }

}
