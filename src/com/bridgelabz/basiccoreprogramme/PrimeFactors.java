package com.bridgelabz.basiccoreprogramme;

public class PrimeFactors {

	public static void main(String[] args) {
		int number = 26;
		for(int index = 2 ; index * index < number ; index++) {
			while(number % index == 0) {
				System.out.print(index + ",");
				number = number/index;
			}
		}
		if(number > 2) {
			System.out.println(number);
		}

	}

}
