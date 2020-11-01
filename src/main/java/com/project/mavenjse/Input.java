package com.project.mavenjse;

import java.util.Scanner;

public class Input{
	

	public static void main (String[] args){
		int size; //input parameters
		int[] array;
		int searchNumber;

		System.out.println("Enter size of array "); //size
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		while (size<1)
		{
			System.out.println("Error ");
			size = in.nextInt();
		}

		
		array = new int[size];// array
		System.out.println("Enter number's in array ");
		array[0]=in.nextInt();
		for (int i=1; i<size; i++)
		{	
			int protect=in.nextInt();
			while (array[i-1]> protect)
			{
				System.out.println("Error ");
				protect=in.nextInt();
			}
			array[i]=protect;
			
		} 

		System.out.println("Enter search number ");//search number
		searchNumber=in.nextInt();
        	in.close();
		int searchIndex = Search.search(array,searchNumber);
		System.out.println("SearchIndex:");
		if (searchIndex==-1)
		{
			System.out.println("Number not found");
		}
		else
		{
			System.out.println(searchIndex);
		}
	}
}
