package com.cards;

public abstract class Prepaidcard {

	private int cardNo;
	private double availableBalance;
	private double swipeLimit;

	abstract boolean swipeCard(double amount);
	
	public void rechargeCard(double amount) {
		availableBalance = availableBalance + amount;
		System.out.println("Successfully deposited : " + amount);
	}
	
	
	@Override
	public String toString() {
		
		return "Card Details: " 
				+ "\nCard No      :  " + cardNo 
				+ "\nAvl Balance  :  " + availableBalance 
				+ "\nswipeLimit   :  " + swipeLimit;
		
	}
	
	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public double getSwipeLimit() {
		return swipeLimit;
	}

	public void setSwipeLimit(double swipeLimit) {
		this.swipeLimit = swipeLimit;
	}
	
}