package com.bridgelabz.basiccoreprogramme;

public class QuotientRemainderCalculator {

	public static void main(String[] args) {
		 int divisor = 10;
		 int dividend = -100;
		
		if(divisor == 0) {
			System.err.println("Divisor cannot be zero!!!!");
			System.exit(0);
		}else {
			int remainder = dividend % divisor ; 
			int quotient = dividend / divisor;
			System.out.println("Remainder is: "+ remainder);
			System.out.println("Quotient is :" +quotient);
			
		}
		
	}

}
