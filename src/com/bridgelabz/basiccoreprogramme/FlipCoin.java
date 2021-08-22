package com.bridgelabz.basiccoreprogramme;

public class FlipCoin {
	public static void main(String[] args) {
		  int totalCoinFlip = 10;
		  int headCount = 0;
		  
		  for(int index = 0; index < totalCoinFlip; index++ ) {
			  if(Math.random() > 0.5) {
				  headCount++;  
			  }
		  }
		  int headCountPercent = (headCount * 100)/totalCoinFlip;
		  int tailCountPercent = 100 - headCountPercent;
		  
		  System.out.println("Head count percentage is: "+headCountPercent);
		  System.out.println("Tail count percentage is: "+tailCountPercent);
	}

}
