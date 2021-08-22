package com.bridgelabz.basiccoreprogramme;

public class LargestAmongThreeNos {
	public static void main(String[] args) {
		int number1 = 100;
		int number2 = 500;
		int number3 = 60;
		
		if(number1 > number2) {
			if(number1 > number3) {
				System.out.println("Number1: "+number1 + " is the largest");
			}else {
				System.out.println("Number3: "+number3 + " is the largest");
			}
		}else {
			if(number2 > number3) {
				System.out.println("Number2: "+number2 + " is the largest");
			}else {
				System.out.println("Number3: "+number3 + " is the largest");
			}
		}
	}
}
