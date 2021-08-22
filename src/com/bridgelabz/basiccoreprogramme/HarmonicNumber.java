package com.bridgelabz.basiccoreprogramme;

public class HarmonicNumber {

	public static void main(String[] args) {
		int number = 500;
		double harmonicSum = 1.0;
		
		if(number == 0) {
			System.err.println("Nth value cannot be zero!!!!!!!");
			System.exit(1);
		}
		
		for(double index = 2; index <= number; index++) {
			double harmonicValue = 1.0 / index;
			harmonicSum += harmonicValue;
		}
		System.out.println("The vale of the "+number+ " th harmonic value is : "+harmonicSum);
	}

}
