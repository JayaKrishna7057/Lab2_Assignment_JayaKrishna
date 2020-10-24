/**
  Author : Jayakrishna
  date :   23/10/2020
  desc :   sortStrings
  */

import java.util.Scanner;
import java.util.*;
public class Array2 {
	
	public static void main(String[] args) {
		
	     Scanner sc=new Scanner(System.in);
	     String []array=new String[4];                 //Array initialization with size of 4
	     for(int i=0;i<=3;i++)
	     {
	    	 array[i]=sc.nextLine();
	     }
	     Array2 a2=new Array2();                       //creating an object for class Array2
	     String Alphabetical=a2.sortStrings(array);   //access method with object 'a2' and set the value to Alphabetical
	     System.out.println(Alphabetical);
	}
       String sortStrings(String[] array)         //initialize the method with arguement and return type string
     {
	for(int i=0;i<array.length;i++)
	   {
		   for(int j=i+1;j<array.length;j++)
		   {
			   if(array[i].compareTo(array[j])>0)
			   {
				   String temp=array[i];
				   array[i]=array[j];
				   array[j]=temp;
			   }
			   
		   }
	   }
	for(int i=0;i<array.length;i++) {
		if(i<4/2)
		{
			array[i]=array[i].toUpperCase();
		}
		else 
			array[i]=array[i].toLowerCase();
	}
	
	return Arrays.toString(array);                      //return the array
}
}
