package com.bridgelabz.basiccoreprogramme;

public class FlipCoin {
	public static void main(String[] args) {
		  final int TOTAL_COIN_FLIP = 10;
		  int headCount = 0;
		  
		  for(int index = 0; index < TOTAL_COIN_FLIP; index++ ) {
			  if(Math.random() > 0.5) {
				  headCount++;  
			  }
		  }
		  int headCountPercent = (headCount * 100)/TOTAL_COIN_FLIP;
		  int tailCountPercent = 100 - headCountPercent;
		  
		  System.out.println("Head count percentage is: "+headCountPercent);
		  System.out.println("Tail count percentage is: "+tailCountPercent);
	
		
	}

}
