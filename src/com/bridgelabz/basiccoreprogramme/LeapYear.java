package com.bridgelabz.basiccoreprogramme;

public class LeapYear {

	public static void main(String[] args) {
		int yearToCheck = 2001;
		boolean isLeapYear = false;
		if (String.valueOf(yearToCheck).length() !=4 ) {
			System.err.println("Please enter the valid year!!!!!!!!!");
			System.exit(0);
		} else {
			if ((yearToCheck % 4 == 0 && yearToCheck % 100 == 0) || yearToCheck % 4 == 0) {
				isLeapYear = true;
			} else {
				isLeapYear = false;
			}
		}

		if(isLeapYear) {
			System.out.println("The year "+ yearToCheck + " is a leap year");
		}else {
			System.out.println("The year"+ yearToCheck +" is not a leap year");
		}
	}
}
