package com.Basic500;

import java.util.Scanner;

public class NumberSeries {
     int min,max;
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the minimum value:");
		int min=s.nextInt();
		System.out.println("enter the maximum value:");
		int max=s.nextInt();
		int i;
		for(i=min;i<=max;i++);
		System.out.println(i+"   ");
		
		

	}

}
