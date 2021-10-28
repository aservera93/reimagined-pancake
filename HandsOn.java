package com.AnthonyServera.handson3;

public class HandsOn {

	public static void main(String[] args) {
		
		
		int[] arr = {0,0,0,0,0}; 
	
		

		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("Enter a number: ");
			 arr[i] = StudentHelper.ReadInputInt();
			
			
		}
		
		System.out.println("You entered: ");
		for (int i = 0; i < arr.length; i++)
			
		{
			System.out.println(arr[i]);
			
		}
		
		System.out.println("Backwards it is: ");
		for (int i = arr.length - 1; i >= 0; i--)
		{
			System.out.println(arr[i]);
			
		}
		
		System.out.println("Odd entries are: ");
		for (int i = 0; i < arr.length; i++)
		{
			int n = arr[i] % 2;
			
			if (n == 1 || n == -1)
			{
			System.out.println(arr[i]);
			}
			
			
		}
		

	} // main bracket
} // class bracket
