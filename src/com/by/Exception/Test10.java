package com.by.Exception;

public class Test10 {
	public static void main(String[] args) {
		System.out.println("Main Start");
		try {
			System.out.println("In try");
			System.out.println(10/0);
			System.out.println(args[0]);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			//System.out.println("In catch");
		}finally {
			System.out.println("In finally");
		}
		System.out.println("After try/catch/finally");
		System.out.println("Main end");
		}
		
	}


