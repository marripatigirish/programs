package com.Basic500;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length value:---");
		double l=s.nextDouble();
		System.out.println("enter the base value:------");
		double  b=s.nextDouble();
		
		
		double areaofrectangle=l*b;
		System.out.println("area of rectangle"+areaofrectangle);
		

	}

}
