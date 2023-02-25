package com.tns.usestatic;

public class UseConstants {
	final int N=1000;
	static final int STATIC_N;
	static
	{
		STATIC_N=5000;
	}
	public static void main(String args[])
	{
		UseConstants o=new UseConstants();
		System.out.println(o.N);

		System.out.println(STATIC_N);
	}
}
