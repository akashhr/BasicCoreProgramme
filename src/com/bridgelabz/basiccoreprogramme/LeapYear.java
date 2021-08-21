package com.bridgelabz.basiccoreprogramme;

public class LeapYear {

	public static void main(String[] args) {
		int year = 200;
		boolean isLeapYear = false;
		 
		if(Integer.toString(year).length() != 4) {
			System.err.println("Enter valid Input!!!!");
			System.exit(0);
		}else {
			if(year % 400 == 0) {
				isLeapYear = true;
			}else if(year % 100 == 0) {
				isLeapYear = true;
			}else if(year % 4 == 0) {
				isLeapYear = true;
			}
		}
		
		if(isLeapYear) {
			System.out.println("THE year "+year+ " is a leap year");
		}else {
			System.out.println("THE year "+year+ " is not a leap year");
		}
			
	}

}
