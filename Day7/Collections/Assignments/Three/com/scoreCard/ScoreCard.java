package com.scoreCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ScoreCard {

	public static void main(String[] args) {
		
		Map<String, Integer> scoreCard = new TreeMap<>();
		
		scoreCard.put("Rahane", 20);
		scoreCard.put("Rahul", 30);
		scoreCard.put("Kohli", 150);
		scoreCard.put("Dhoni", 50);
		scoreCard.put("Lokesh", 2);
		
		Set<String> scores = scoreCard.keySet();
		
		System.out.println("Players who batted ");
		scores.forEach((player) -> System.out.println(player));
		
		System.out.println("\nScores by players");
		Iterator<String> iter = scores.iterator();
		int totalScore = 0;
		int highestScore = 0;
		String highestScorer = "";
		while(iter.hasNext()) {
			
			String key = iter.next();
			System.out.println(key + " : " + (int) scoreCard.get(key));
			totalScore = totalScore + (int) scoreCard.get(key);
			if(highestScore < (int)scoreCard.get(key)) {
				highestScore = (int) scoreCard.get(key);
				highestScorer = key;
			}
			
		}
		
		System.out.println("\nTotal Score : " + totalScore);
		
		System.out.println("\nName of the highest Scorer : " + highestScorer.toUpperCase() + " has Scored : " + highestScore);
		
		System.out.println("Runs scored by Dhone : " + scoreCard.get("Dhoni"));
		

	}

}
