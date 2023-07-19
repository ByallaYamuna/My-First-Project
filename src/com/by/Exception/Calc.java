package com.by.Exception;
import java.util.Scanner;

public class Calc {
	public static void main(String[] arg)
	
	
	{
		Scanner scn = new Scanner(System.in);
		Addition a1 = new Addition();
		try {
			System.out.print("Enter f.no: ");
			int a =scn.nextInt();
			System.out.print("Enter s.no: ");
			int b = scn.nextInt();
			int res =a1.add(a, b);
			System.out.println("Result: "+res);
		}catch(NegativeNumberException e) {
			System.out.println("Error"+e.getMessage());
			
		}
		}
		
		
	}
	
	 
	 
	


