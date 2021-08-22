package com.bridgelabz.basiccoreprogramme;

public class VowelConstantChecker {

	public static void main(String[] args) {
		char characterToCheck = 'm';
		String vowels = "aeiouAEIOU";
		if(vowels.indexOf(characterToCheck) != -1) {
			System.out.println("The given character is a Vowel");
		}else {
			System.out.println("The given character is a constant");
		}
	}
}
