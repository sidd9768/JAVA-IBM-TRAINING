package com.test;

import com.rewards.*;
import com.cards.*;

public class Testcard {

	public static void main(String[] args) {

		Travelcard travelCard = new Travelcard();
		travelCard.setAvailableBalance(10000);
		travelCard.setCardNo(103456);
		travelCard.setSwipeLimit(1000);
		System.out.println(travelCard);

		travelCard.swipeCard(100);
		System.out.println("\nAfter transaction---------");
		System.out.println(travelCard);
		System.out.println( "Reward Point :  " + travelCard.calculateRewardPoint(100));
		
		travelCard.rechargeCard(1000);
		System.out.println("\nAfter recharge---------");
		System.out.println(travelCard);
		System.out.println( "Reward Point :  " + travelCard.calculateRewardPoint(1000));

	}

}
