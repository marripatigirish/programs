package com.Basic500;

import java.util.Scanner;

public class AreaOftriangle {

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Base Value:-");
	double b=s.nextDouble();
	System.out.println("Enter the Height Value:-");
	double h=s.nextDouble();
	//calculate of triangle 
	

	double areaoftriangle=(b*h)/2;

	System.out.println("AREAOFTRIANGLE"+areaoftriangle);
	}

}