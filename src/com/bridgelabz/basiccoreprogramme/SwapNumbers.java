package com.bridgelabz.basiccoreprogramme;

public class SwapNumbers {

	public static void main(String[] args) {

		int number1 = 10;
		int number2 = 20;
		int variableForSwap;
		System.out.println("Before swapping the value of two numbers are "+ number1 +" "+ number2 );
		variableForSwap = number1;
		number1 = number2;
		number2 = variableForSwap;
		System.out.println("After swapping the vale of two numbers are "+ number1 +" "+ number2 );
	   
	}

}
