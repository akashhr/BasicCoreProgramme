package com.bridgelabz.basiccoreprogramme;

public class QuotientRemainderCalculator {

	public static void main(String[] args) {
		 double divisor = 10;
		 double dividend = 101;
		
		if(divisor == 0) {
			System.err.println("Divisor cannot be zero!!!!");
			System.exit(0);
		}else {
			int remainder = (int) (dividend % divisor) ; 
			double quotient = dividend / divisor;
			System.out.println("Remainder is: "+ remainder);
			System.out.println("Quotient is :" +quotient);
			
		}
		
	}

}
