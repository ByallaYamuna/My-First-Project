package com.by.Exception;

public class Addition {
	public int add(int a,int b)throws NegativeNumberException{
		if(a<0 || b<0)
			throw new NegativeNumberException("Dont pass Negative Values");
		return a+b;
		
	}

}
