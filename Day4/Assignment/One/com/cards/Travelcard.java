package com.cards;

import com.rewards.*;
public class Travelcard extends Prepaidcard implements Rewardable {
	
	private double rewardPoint;
	@Override
	public boolean swipeCard(double amount) {
		
		if(amount*60 < getAvailableBalance() || amount*60 < getSwipeLimit()) {
			
			double amountInINR = amount * 60;
			double processingFee = amountInINR * 0.05;
			double totalAmountDeduce = amountInINR + processingFee;
			double availableBalance = getAvailableBalance() - totalAmountDeduce;
			setAvailableBalance(availableBalance);
			rewardPoint = (int) amountInINR/20;
			System.out.println("Successfully swiped : " + totalAmountDeduce);
			return true;
		}
		else {
			System.out.println("Cannot swipe more amount");
			return false;
		}
	}
	
	@Override
	public double calculateRewardPoint(double amount) {
		rewardPoint = rewardPoint + amount*60/20;
		return rewardPoint;
	}
	

}
