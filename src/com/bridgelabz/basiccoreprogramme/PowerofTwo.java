package com.bridgelabz.basiccoreprogramme;

public class PowerofTwo {
	public static void main(String[] args) {
		int number =Integer.parseInt(args[0]);

		if (number < 0 || number >31) {
			System.err.println("Value of N must be between 0 and 31");
			System.exit(0);
		}

		for (int index = 0; index < number; index++) {
			double powersOftwo = Math.pow(2, index);
			System.out.println("2 ^ " + index + " = " + powersOftwo);
			checkLeapYear((int) powersOftwo);
		
		}
	}
	
	public static void checkLeapYear(int yearToCheck) {
		boolean isLeapYear = false;
		if(String.valueOf(yearToCheck).length() != 4) {
			System.out.println(yearToCheck + " : is a leap year? " + isLeapYear);
			return ;
		}else {
			if ((yearToCheck % 4 == 0 && yearToCheck % 100 == 0) || yearToCheck % 4 == 0) {
				isLeapYear = true;
			} else {
				isLeapYear = false;
			}	
		}
		System.out.println(yearToCheck + " : is a leap year?" + isLeapYear);
		
	}
}
