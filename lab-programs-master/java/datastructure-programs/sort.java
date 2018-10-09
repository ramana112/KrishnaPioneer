package com.ds.programs.ds;
import java.util.*;


public class sort {
	public static void main(String args[])

	 {

	   Scanner s=new Scanner(System.in);

	   System.out.println("Enternumber of elements you want to enter");

	   int size=s.nextInt();

	   System.out.println("EnterElements");

	   int x[]=new int[size];

	   for(int i=0;i<x.length;i++)

	     x[i]=s.nextInt();

	   SortElements n=new SortElements(x);
	  
	   s.close();

	 }

}

class Arrange

{

 void sort(int a[])

 {

   int i,j,t=0;

   for(i=0;i<a.length;i++)

    for(j=0;j<a.length-i-1;j++)

    {

      if(a[j]>a[j+1])

      {

        t=a[j];

        a[j]=a[j+1];

        a[j+1]=t;

       }

     }

  }  

}

// Class for searching a key in a sorted list of elements(inherits Arrange class)

class SortElements extends Arrange

{

 SortElements(int x[])

 {

  sort(x);

  System.out.println("Sorted of elements is=");

  for(int i=0;i<x.length;i++)

   System.out.println(" "+x[i]);
 
}
}

