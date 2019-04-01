package com.app;

public class Simple {

	int a;
	int b;
	int c;
	public static int add(int a,int b) {
		return (a+b);
	
	}
	public static int mul(int a,int b)
	{
		return (a*b);
	}
	public static void main(String[] args) {
		
		Simple s=new Simple();
		s.add(10, 20);
		s.mul(20, 20);
		System.out.println("done the program");
	}
}
