/**
  Author : Jayakrishna
  date :   23/10/2020
  desc :   modifyArray
  */

import java.util.*;
public class Array4 {

	public static void main(String[] args) {
		
	     Scanner sc=new Scanner(System.in);
	     int []array=new int[5];                 //Array initialization with size of 5
	     for(int i=0;i<5;i++)
	          {
	          	 array[i]=sc.nextInt();
	           }
	     Array4 a4=new Array4();                   //creating an object for class Array4
	     int duplicates=a4.modifyArray(array);      //access method with object 'a4' and set the value to duplicates
	     System.out.println(duplicates);
		}
	
	   int modifyArray(int[] array)                  //initialize the method with arguement and return type int
	   { 
		   int k=0;
		   int bla[]=new int[5];
		   for(int i=0;i<array.length;i++)
		   {   int count=1;
			   for(int j=i+1;j<array.length;j++)
			    {
				   if(array[i]==array[j])
					   count=count+1;
			    }
			   if(count==1) 
			   {
				   bla[k]=array[i];
				   System.out.println(bla[k]);
				   k++;
			   }			   
		   }
		   
		  return 1;                                //return 1
	}
}
