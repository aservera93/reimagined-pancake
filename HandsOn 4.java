package com.AnthonyServera.handson4;

public class HandsOn {

	public static void main(String[] args) {
		

		int i = 4;
		
		System.out.println("Value: " +  i + "\nDoubled: " + doubleMe(i));
		
		System.out.println("\nValue: " +  i + "\nQuadrupled: " + quadrupleMe(i));
		
		System.out.println("\nValue: " +  i + "\nTimes: " +  quadrupleMe(i) + "\nResult: " +doubleMeTimes(i, i));
	}
	
	

	public static int doubleMe(int val)
	{
	
		val *= 2;
	return val;	
	}
	
	public static int quadrupleMe(int val)
	{
	
		val *= 2;
	return doubleMe(val);	
	}
	
	public static int doubleMeTimes(int val, int count)
	{
	
	count *= quadrupleMe(val);
	return count;
	}


}
